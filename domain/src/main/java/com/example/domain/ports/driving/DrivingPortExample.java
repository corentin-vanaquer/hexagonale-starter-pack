package com.example.domain.ports.driving;

import com.example.domain.model.RecordExample;

import java.util.List;

public interface DrivingPortExample {
    void createExample(RecordExample entity);
    RecordExample getExampleById(Long id);
    List<RecordExample> findAllExample();
    void updateExample(Long id, RecordExample entity);
    void deleteExample(Long id);
}
