package com.devsuperior.apicrud.repository;

import com.devsuperior.apicrud.entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}