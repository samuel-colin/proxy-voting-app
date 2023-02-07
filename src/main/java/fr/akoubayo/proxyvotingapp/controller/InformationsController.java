package fr.akoubayo.proxyvotingapp.controller;

import fr.akoubayo.proxyvotingapp.dto.GroupDto;
import fr.akoubayo.proxyvotingapp.dto.InformationDto;
import fr.akoubayo.proxyvotingapp.service.InformationsService;
import fr.akoubayo.proxyvotingapp.utils.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(Path.INFORMATIONS)
public class InformationsController {
    @Autowired
    private InformationsService informationsService;

    @GetMapping(produces = "application/json")
    public List<InformationDto> get() {
        return informationsService.getAllUsers();
    }

    @GetMapping(value="{matricule}", produces = "application/json")
    public InformationDto getByMatricule(@PathVariable("matricule") String matricule) {
        return informationsService.findByMatricule(matricule);
    }

    @GetMapping(value="groups", produces = "application/json")
    public List<GroupDto> getGroups() {
        return informationsService.getAllGroup();
    }
}
