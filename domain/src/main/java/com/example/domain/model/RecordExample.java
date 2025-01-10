package com.example.domain.model;

import lombok.Builder;

@Builder(toBuilder = true)
public record RecordExample(Long id, String name) {
}
