package com.company.base.model;

import lombok.Data;

@Data
public class BranchModel {
    private String branchSource;

    private String branchTarget;

    private int sourceDir;
}
