package fr.akoubayo.proxyvotingapp.dto;

import fr.akoubayo.proxyvotingapp.model.Group;
import fr.akoubayo.proxyvotingapp.model.User;
import fr.akoubayo.proxyvotingapp.model.VotingCampaign;
import lombok.Data;

@Data
public class VotingCampaignDto {
    private Integer id;
    private String label;
    private String description;
    private InformationDto organizer;
    private GroupDto group;
}
