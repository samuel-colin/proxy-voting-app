package fr.akoubayo.proxyvotingapp.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name="voting_campaigns")
@Data
public class VotingCampaign {
    @Id
    private Integer id;
    private String label;
    private String description;
    @OneToOne
    @JoinColumn(name = "organizer_id", referencedColumnName = "id")
    private User organizer;
    @OneToOne
    @JoinColumn(name = "group_id", referencedColumnName = "id")
    private Group group;
}
