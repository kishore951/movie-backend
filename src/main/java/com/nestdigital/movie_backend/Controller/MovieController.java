package com.nestdigital.movie_backend.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieController {

    @PostMapping("/movieadd")
    public String movieadd(){
        return "movie";
    }
}
