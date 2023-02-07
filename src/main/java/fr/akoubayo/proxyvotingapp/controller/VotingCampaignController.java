package fr.akoubayo.proxyvotingapp.controller;

import fr.akoubayo.proxyvotingapp.dto.VotingCampaignDto;
import fr.akoubayo.proxyvotingapp.service.VotingCampaignsService;
import fr.akoubayo.proxyvotingapp.utils.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(Path.VOTING_CAMPAIGN)
public class VotingCampaignController {
    @Autowired
    private VotingCampaignsService votingCampaignsService;

    @GetMapping(produces = "application/json")
    public List<VotingCampaignDto> getAll() {
        return votingCampaignsService.getAllVotingCampaings();
    }

}
