package com.dm.rest.payload.requests;

import lombok.Data;

@Data
public class RegistrationRequest {
    private String name;
    private String password;
}
