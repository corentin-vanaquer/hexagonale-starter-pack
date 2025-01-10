package com.example.infrastructure.persistance;

import com.example.infrastructure.model.EntityExample;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaRepositoryExample extends JpaRepository<EntityExample, Long> {
}
