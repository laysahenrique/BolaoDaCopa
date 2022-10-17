package com.laysafontoura.controllers;

import com.laysafontoura.model.NationalTeam;
import com.laysafontoura.model.NationalTeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class NationalTeamController {
    
    @Autowired
    NationalTeamRepository nationalTeamRepository;
    
    @GetMapping(value = "/nationalteams")
    public String showNationalTeams(Model model){
        model.addAttribute("nationalteams", nationalTeamRepository.findAll());
        return "nationalteams";
    }
    
    @PostMapping(value = "nationalteams/add")
    public String createNationalTeam(NationalTeam nationalTeam) {        
        return null;        
    }
    
}