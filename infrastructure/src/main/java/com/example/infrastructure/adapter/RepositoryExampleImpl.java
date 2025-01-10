package com.example.infrastructure.adapter;

import com.example.domain.model.RecordExample;
import com.example.domain.ports.driven.DrivenPortExample;
import com.example.infrastructure.persistance.JpaRepositoryExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepositoryExampleImpl implements DrivenPortExample {

    private final JpaRepositoryExample jpaRepositoryExample;

    @Autowired
    public RepositoryExampleImpl(JpaRepositoryExample jpaRepositoryExample) {
        this.jpaRepositoryExample = jpaRepositoryExample;
    }

    @Override
    public void saveExample(RecordExample entity) {

    }

    @Override
    public RecordExample findExampleById(Long id) {
        return null;
    }

    @Override
    public List<RecordExample> findAllExample() {
        return null;
    }

    @Override
    public void deleteExample(Long id) {

    }
}
