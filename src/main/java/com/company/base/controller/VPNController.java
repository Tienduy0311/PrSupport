package com.company.base.controller;

import com.company.base.service.IVPNManageService;
import com.company.base.service.Impl.VPNManageServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

@Controller
@RequestMapping("/api/vpn")
public class VPNController {

	private IVPNManageService service;

	public VPNController(VPNManageServiceImpl vpnManageService) {
		this.service = vpnManageService;
	}

	@GetMapping("/connect")
	public String connect() throws IOException, InterruptedException {
		this.service.connect();
		return "done";
	}
}
