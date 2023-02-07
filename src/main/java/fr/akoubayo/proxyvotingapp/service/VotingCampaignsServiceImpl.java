package fr.akoubayo.proxyvotingapp.service;

import fr.akoubayo.proxyvotingapp.dto.VotingCampaignDto;
import fr.akoubayo.proxyvotingapp.model.VotingCampaign;
import fr.akoubayo.proxyvotingapp.repository.VotingCampaignRepository;
import fr.akoubayo.proxyvotingapp.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VotingCampaignsServiceImpl implements VotingCampaignsService {
    @Autowired
    private VotingCampaignRepository votingCampaignRepository;

    @Override
    public List<VotingCampaignDto> getAllVotingCampaings() {
        List<VotingCampaign> listVotingCampaign = votingCampaignRepository.findAll();
        return listVotingCampaign.stream().map(Mapper::toDto).toList();
    }
}
