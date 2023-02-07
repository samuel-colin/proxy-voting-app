package fr.akoubayo.proxyvotingapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="users")
@Data
public class User {
    @Id
    private Integer id;
    private String matricule;
    private String lastname;
    private String firstname;
    private String email;
    private String password;
    @Column(name="last_login")
    private Date lastLogin;
    @Column(name="created_at")
    private Date createdAt;
    @Column(name="updated_at")
    private Date updatedAt;
    @ManyToMany
    @JoinTable(
        name = "users_groups",
        joinColumns = @JoinColumn(name = "user"),
        inverseJoinColumns = @JoinColumn(name = "group"))
    private List<Group> groups;
}
