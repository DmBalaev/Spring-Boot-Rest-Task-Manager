package com.dm.rest.payload.requests;

import com.dm.rest.persistance.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class RegistrationRequest {
    @NotBlank
    @Size(min = 4, max = 20)
    private String login;
    @NotBlank
    @Email
    private String email;
    @NotBlank
    @Size(min = 6, max = 20)
    private String password;

    public User getUser(){
        User user = new User();
        user.setLogin(login);
        user.setEmail(email);
        user.setPassword(password);

        return user;
    }
}
