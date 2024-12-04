package com.src.destinations.Destination.Controllers;

import com.src.destinations.Destination.Entities.Destination;
import com.src.destinations.Destination.Services.DestinationService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("destinations")
public class DestinationController {

    @Autowired
    private DestinationService destinationService;

    @GetMapping("")
    public ResponseEntity<List<Destination>> findAll() {
        return destinationService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Optional<Destination>> findById(@PathVariable UUID id) {
        return destinationService.findById(id);
    }

    @PostMapping("")
    public ResponseEntity<Destination> create(@RequestBody @Valid Destination data) {
        return destinationService.create(data);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Destination> update(
            @PathVariable UUID id,
            @RequestBody @Valid Destination data
    ) {
        try {
            return destinationService.update(id, data);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(null);
        }
    }


    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable UUID id) {
        return destinationService.delete(id);
    }

    @PatchMapping("/{id}/rating")
    public ResponseEntity<String> addRating(
            @PathVariable UUID id,
            @RequestParam double rating
    ) {
        return destinationService.addRating(id, rating);
    }
}
