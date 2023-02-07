package fr.akoubayo.proxyvotingapp.repository;

import fr.akoubayo.proxyvotingapp.model.VotingCampaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VotingCampaignRepository extends JpaRepository<VotingCampaign, Integer> {
}
