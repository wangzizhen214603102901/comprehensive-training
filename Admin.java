package org.No.4.bms.domain;

import lombok.Data;

@Data
public class Admin {
    private Integer adminId;

    private String adminName;

    private String adminPwd;

    private String adminEmail;
}