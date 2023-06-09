package com.smartreservation.UserService.Payload;


import com.smartreservation.UserService.Model.Role;

import java.util.*;

public class JwtResponse {

        private String token;
        private String type = "Basic";
        private String username;
    private String roles;


    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    public JwtResponse(String token, String username, String roles) {
        this.token = token;

        this.username = username;

        this.roles = roles;
    }

    private String password;


}
