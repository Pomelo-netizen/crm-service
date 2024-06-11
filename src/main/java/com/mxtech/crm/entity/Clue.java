package com.mxtech.crm.entity;

import lombok.Data;
import java.sql.Timestamp;

@Data
public class Clue {
    private Long id;
    private String name;
    private String contact;
    private String status;
    private Integer score;
    private Timestamp createdAt;
    private Timestamp updatedAt;
}
