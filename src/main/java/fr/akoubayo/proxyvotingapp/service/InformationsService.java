package fr.akoubayo.proxyvotingapp.service;

import fr.akoubayo.proxyvotingapp.dto.GroupDto;
import fr.akoubayo.proxyvotingapp.dto.InformationDto;

import java.util.List;

public interface InformationsService {
    List<InformationDto> getAllUsers();
    List<GroupDto> getAllGroup();
    InformationDto findByMatricule(String matricule);
}
