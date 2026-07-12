package com.cognizant.jwt.controller;


import com.cognizant.jwt.model.AuthenticationRequest;
import com.cognizant.jwt.model.AuthenticationResponse;
import com.cognizant.jwt.util.JwtUtil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class AuthenticationController {


    @Autowired
    private JwtUtil jwtUtil;



    @PostMapping("/authenticate")
    public AuthenticationResponse authenticate(
            @RequestBody AuthenticationRequest request
    ){


        if(request.getUsername().equals("user")
                &&
                request.getPassword().equals("password")){


            String token =
                    jwtUtil.generateToken(
                            request.getUsername()
                    );


            return new AuthenticationResponse(token);

        }


        throw new RuntimeException("Invalid Credentials");

    }



    @GetMapping("/hello")
    public String hello(){

        return "Hello JWT User";

    }


}