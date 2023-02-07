package fr.akoubayo.proxyvotingapp.service;

import fr.akoubayo.proxyvotingapp.dto.VotingCampaignDto;

import java.util.List;

public interface VotingCampaignsService {
    List<VotingCampaignDto> getAllVotingCampaings();
}
