package com.mxtech.crm.dto;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class ClueDto {
    private Long id;
    private String name;
    private String contact;
    private String status;
    private Integer score;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
