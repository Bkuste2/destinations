package com.src.destinations.User.Services;

import com.src.destinations.User.Dtos.AuthenticationRequestDTO;
import com.src.destinations.User.Dtos.AuthenticationResponseDTO;
import org.springframework.http.ResponseEntity;

public interface AuthenticationService {
    public ResponseEntity<AuthenticationResponseDTO> login(AuthenticationRequestDTO authenticationRequestDTO);
}
