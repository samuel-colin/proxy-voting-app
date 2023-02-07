package fr.akoubayo.proxyvotingapp.dto;

import fr.akoubayo.proxyvotingapp.model.User;
import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class InformationDto {
    private Integer id;
    private String matricule;
    private String lastname;
    private String firstname;
    private String email;
    private String password;
    private Date lastLogin;
    private Date createdAt;
    private Date updatedAt;
    private List<GroupDto> groups;
}
