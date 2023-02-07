package fr.akoubayo.proxyvotingapp.utils;

import fr.akoubayo.proxyvotingapp.dto.GroupDto;
import fr.akoubayo.proxyvotingapp.dto.InformationDto;
import fr.akoubayo.proxyvotingapp.dto.VotingCampaignDto;
import fr.akoubayo.proxyvotingapp.model.Group;
import fr.akoubayo.proxyvotingapp.model.User;
import fr.akoubayo.proxyvotingapp.model.VotingCampaign;

import java.util.List;
import java.util.Map;

public class Mapper {
    public static InformationDto toDto(User user) {
        InformationDto informationDto = new InformationDto();
        informationDto.setId(user.getId());
        informationDto.setMatricule(user.getMatricule());
        informationDto.setLastname(user.getLastname());
        informationDto.setFirstname(user.getFirstname());
        informationDto.setEmail(user.getEmail());
        informationDto.setPassword(user.getPassword());
        informationDto.setLastLogin(user.getLastLogin());
        informationDto.setCreatedAt(user.getCreatedAt());
        informationDto.setUpdatedAt(user.getUpdatedAt());
        informationDto.setGroups(user.getGroups().stream().map(Mapper::toDto).toList());
        return informationDto;
    }

    public static GroupDto toDto(Group group) {
        GroupDto groupDto = new GroupDto();
        groupDto.setId(group.getId());
        groupDto.setLabel(group.getLabel());
        groupDto.setDescription(group.getDescription());
        groupDto.setIcon(group.getIcon());
        groupDto.setCreatedAt(group.getCreatedAt());
        return groupDto;
    }

    public static VotingCampaignDto toDto(VotingCampaign votingCampaign) {
        VotingCampaignDto votingCampaignDto = new VotingCampaignDto();
        votingCampaignDto.setId(votingCampaign.getId());
        votingCampaignDto.setLabel(votingCampaign.getLabel());
        votingCampaignDto.setDescription(votingCampaign.getDescription());
        votingCampaignDto.setOrganizer(Mapper.toDto(votingCampaign.getOrganizer()));
        votingCampaignDto.setGroup(Mapper.toDto(votingCampaign.getGroup()));
        return votingCampaignDto;
    }
}
