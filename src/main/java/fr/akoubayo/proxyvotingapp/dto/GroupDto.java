package fr.akoubayo.proxyvotingapp.dto;

import lombok.Data;

import java.util.Date;
@Data
public class GroupDto {
    private Integer id;
    private String label;
    private String description;
    private String icon;
    private Date createdAt;
}
