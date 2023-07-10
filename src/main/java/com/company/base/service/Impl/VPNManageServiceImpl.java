package com.company.base.service.Impl;

import com.company.base.service.IVPNManageService;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;


@Service
public class VPNManageServiceImpl implements IVPNManageService {
	@Override
	public void connect() throws IOException, InterruptedException {
		ProcessBuilder builder = new ProcessBuilder("cscript.exe", "D:\\Tool\\vpn\\vpn_connect.vbs");
		Process process = builder.start();
		InputStream inputStream = process.getInputStream();
		BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}

		int exitCode = process.waitFor();
		System.out.println("Exit code: " + exitCode);
	}

	@Override
	public void disconnect() {

	}
}
