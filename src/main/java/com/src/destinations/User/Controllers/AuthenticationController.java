package com.src.destinations.User.Controllers;

import com.src.destinations.User.Dtos.AuthenticationRequestDTO;
import com.src.destinations.User.Services.AuthenticationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("auth")
public class AuthenticationController {
  @Autowired
  AuthenticationService authenticationService;

  @PostMapping("")
  public ResponseEntity login(
    @RequestBody @Valid AuthenticationRequestDTO authenticationRequestDTO
  ) {
    return authenticationService.login(authenticationRequestDTO);
  }
}
