package com.company.base.service.Impl;

import com.company.base.model.BranchModel;
import com.company.base.service.HomeService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Service
public class HomeServiceImpl implements HomeService {

    @Value("${directory.blanc}")
    private String BLANC_SOURCE_DIR;

    @Value("${directory.sirius}")
    private String SIRIUS_SOURCE_DIR;

    @Override
    public void runCmd(BranchModel branch) throws IOException {
        String os = System.getProperty("os.name");
        boolean isWindows = os.toLowerCase().startsWith("windows");

        // Build command
        List<String> commands = new ArrayList<>();
        String dir = 1 == branch.getSourceDir() ? SIRIUS_SOURCE_DIR : BLANC_SOURCE_DIR;

        if (isWindows)  {
            //cmd
            commands.add("cmd.exe");
            commands.add("/c");
            commands.add("start");
            commands.add("exec.bat");
            commands.add(dir);
            commands.add(branch.getBranchSource());
            commands.add(branch.getBranchTarget());
        } else {
            //terminal
            commands.add("/bin/sh");
            commands.add("-c");
            commands.add("exec.sh");
            //add parameters ...
        }

        //exec command
        new ProcessBuilder(commands).start();
    }
}
