package com.src.destinations.Destination.Repositories;

import com.src.destinations.Destination.Entities.Destination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@Repository
public interface DestinationRepository extends JpaRepository<Destination, UUID> {
    List<Destination> findByNameOrLocation(String name, String location);
    void save(Optional<Destination> destination);
}
