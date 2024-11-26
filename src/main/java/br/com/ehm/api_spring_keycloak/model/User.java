package br.com.ehm.api_spring_keycloak.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class User {

    @NotBlank(message = "Username is required")
    private String username;

    private String password;

}
