package com.example.web.controller;

import com.example.web.mapper.MapperExample;
import com.example.domain.ports.driving.DrivingPortExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerExample {

    private final DrivingPortExample drivingPortExample;
    private final MapperExample controllerMapperExample;

    @Autowired
    public ControllerExample(DrivingPortExample drivingPortExample, MapperExample controllerMapperExample) {
        this.drivingPortExample = drivingPortExample;
        this.controllerMapperExample = controllerMapperExample;
    }

    // TODO: Implement methods with Swagger

}
