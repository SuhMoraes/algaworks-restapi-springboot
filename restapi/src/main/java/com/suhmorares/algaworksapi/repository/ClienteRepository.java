package com.suhmorares.algaworksapi.repository;

import com.suhmorares.algaworksapi.model.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Clients, Long> {
}
