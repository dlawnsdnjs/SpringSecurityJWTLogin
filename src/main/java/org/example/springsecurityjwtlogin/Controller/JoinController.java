package org.example.springsecurityjwtlogin.Controller;

import org.example.springsecurityjwtlogin.DTO.JoinDTO;
import org.example.springsecurityjwtlogin.Service.JoinService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JoinController {
    private final JoinService joinService;

    @Autowired
    public JoinController(JoinService joinService) {
        this.joinService = joinService;
    }

    @PostMapping("/join")
    public String joinProcess(JoinDTO joinDTO){
        System.out.println(joinDTO.getUsername());
        joinService.joinProcess(joinDTO);

        return "ok";
    }
}
