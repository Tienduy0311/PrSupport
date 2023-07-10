package com.company.base.service;

import com.company.base.model.BranchModel;

import java.io.IOException;

public interface HomeService {
    void runCmd(BranchModel branch) throws IOException;
}
