package com.opa.assesment.opaassesment.controller;

import com.opa.assesment.opaassesment.dto.Exercise2Request;
import com.opa.assesment.opaassesment.exception.Exercise2Exception;
import com.opa.assesment.opaassesment.model.Exercise2Model;
import com.opa.assesment.opaassesment.service.Exercise2Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Exercise2")
public class Exercise2Controller {

    private Exercise2Service service;

    public Exercise2Controller(Exercise2Service service) {
        this.service = service;
    }

    @PostMapping("/perfectNaturalNum")
    public List<Integer> perfectNaturalNum(@RequestBody Exercise2Request request) throws Exercise2Exception {
        return service.perfectNaturalNumber(request.getFirstNum(), request.getSecondNum());
    }

    @GetMapping("/getExecutionHistory")
    public List<Exercise2Model> getHistory(){
        return service.getHistory();
    }
}
