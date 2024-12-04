package com.src.destinations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Destinations {

  public static void main(String[] args) {
    System.out.println("JWT Secret: " + System.getenv("JWT_SECRET"));
    SpringApplication.run(Destinations.class, args);
  }
}
