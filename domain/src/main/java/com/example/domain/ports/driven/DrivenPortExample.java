package com.example.domain.ports.driven;

import com.example.domain.model.RecordExample;

import java.util.List;

public interface DrivenPortExample {
        void saveExample(RecordExample entity);
        RecordExample findExampleById(Long id);
        List<RecordExample> findAllExample();
        void deleteExample(Long id);
}
