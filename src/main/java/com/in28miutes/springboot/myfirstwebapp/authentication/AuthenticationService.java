package com.in28miutes.springboot.myfirstwebapp.authentication;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationService {

    public boolean authentication(String userName, String password){

        boolean IsvalueName = userName.equalsIgnoreCase("kim");
        boolean IsvaluePassword =  password.equalsIgnoreCase("1234");

        return IsvalueName && IsvaluePassword;
    }
}
