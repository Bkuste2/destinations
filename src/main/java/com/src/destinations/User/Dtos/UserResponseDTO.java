package com.src.destinations.User.Dtos;

import jakarta.validation.constraints.NotNull;

public record UserResponseDTO(
  @NotNull String name,
  @NotNull String email,
  @NotNull String password,
  @NotNull String birthDate,
  String presentation,
  String githubLink,
  String linkedinLink,
  String instagramLink,
  String facebookLink,
  String twitterLink
) {}
