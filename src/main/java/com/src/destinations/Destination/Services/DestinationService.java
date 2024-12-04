package com.src.destinations.Destination.Services;

import com.src.destinations.Destination.Entities.Destination;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface DestinationService {
    public ResponseEntity<List<Destination>> findAll();

    public ResponseEntity<Optional<Destination>> findById(UUID id);

    public ResponseEntity<List<Destination>> findByNameOrLocation(String name, String location);

    public ResponseEntity<Destination> create(Destination data);

    public ResponseEntity<Destination> update(UUID id, Destination data);

    public ResponseEntity delete(UUID id);

    public ResponseEntity<String> addRating(UUID id, double rating);
}

