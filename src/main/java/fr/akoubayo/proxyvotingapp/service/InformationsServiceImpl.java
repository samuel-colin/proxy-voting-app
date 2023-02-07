package fr.akoubayo.proxyvotingapp.service;

import fr.akoubayo.proxyvotingapp.dto.GroupDto;
import fr.akoubayo.proxyvotingapp.dto.InformationDto;
import fr.akoubayo.proxyvotingapp.exceptions.MultipleChoicesException;
import fr.akoubayo.proxyvotingapp.exceptions.ResourceNotFoundException;
import fr.akoubayo.proxyvotingapp.model.Group;
import fr.akoubayo.proxyvotingapp.model.User;
import fr.akoubayo.proxyvotingapp.repository.GroupRepository;
import fr.akoubayo.proxyvotingapp.repository.UserRepository;
import fr.akoubayo.proxyvotingapp.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InformationsServiceImpl implements InformationsService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private GroupRepository groupRepository;

    public List<InformationDto> getAllUsers() {
        List<User> listUser = userRepository.findAll();
        return listUser.stream().map(Mapper::toDto).toList();
    }

    public List<GroupDto> getAllGroup() {
        List<Group> listGroup = groupRepository.findAll();
        return listGroup.stream().map(Mapper::toDto).toList();
    }

    @Override
    public InformationDto findByMatricule(String matricule) {
        List <InformationDto> listReturn = userRepository.findByMatricule(matricule).stream().map(Mapper::toDto).toList();

        if (listReturn.size() == 0)
            throw new ResourceNotFoundException();
        if (listReturn.size() > 1)
            throw new MultipleChoicesException();

        return listReturn.get(0);
    }
}
