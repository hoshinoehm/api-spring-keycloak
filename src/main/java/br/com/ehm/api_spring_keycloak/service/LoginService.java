package br.com.ehm.api_spring_keycloak.service;

import br.com.ehm.api_spring_keycloak.model.User;
import org.springframework.http.ResponseEntity;

public interface LoginService<T> {
    ResponseEntity<T> login(User user);
    ResponseEntity<T> refreshToken(String refreshToken);

}
