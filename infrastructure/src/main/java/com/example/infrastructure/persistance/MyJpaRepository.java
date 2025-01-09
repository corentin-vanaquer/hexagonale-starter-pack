package com.example.infrastructure.persistance;

import com.example.infrastructure.model.MyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyJpaRepository extends JpaRepository<MyEntity, Long> {
}
