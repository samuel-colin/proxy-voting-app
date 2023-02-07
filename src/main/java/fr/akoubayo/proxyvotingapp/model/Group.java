package fr.akoubayo.proxyvotingapp.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Entity
@Table(name="groups")
@Data
public class Group {
    @Id
    private Integer id;
    private String label;
    private String description;
    private String icon;
    @Column(name="created_at")
    private Date createdAt;
    @ManyToMany(mappedBy = "groups")
    private List<User> users;
}
