package com.example.infrastructure.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
@Table(name = "entity")
public class EntityExample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
