package com.example.web.business;

import com.example.domain.model.RecordExample;
import com.example.domain.ports.driven.DrivenPortExample;
import com.example.domain.ports.driving.DrivingPortExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceExampleImpl implements DrivingPortExample {

    private final DrivenPortExample drivenPortExample;

    @Autowired
    public ServiceExampleImpl(DrivenPortExample drivenPortExample) {
        this.drivenPortExample = drivenPortExample;
    }

    @Override
    public void createExample(RecordExample entity) {

    }

    @Override
    public RecordExample getExampleById(Long id) {
        return null;
    }

    @Override
    public List<RecordExample> findAllExample() {
        return null;
    }

    @Override
    public void updateExample(Long id, RecordExample entity) {

    }

    @Override
    public void deleteExample(Long id) {

    }
}
