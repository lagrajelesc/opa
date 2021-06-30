package com.opa.assesment.opaassesment.service.impl;

import com.opa.assesment.opaassesment.exception.Exercise2Exception;
import com.opa.assesment.opaassesment.model.Exercise2Model;
import com.opa.assesment.opaassesment.repository.Exercise2Repository;
import com.opa.assesment.opaassesment.service.Exercise2Service;
import com.opa.assesment.opaassesment.validator.Exercise2Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Component
public class Exercise2Impl implements Exercise2Service {

    private Exercise2Repository exercise2Repository;

    public Exercise2Impl(Exercise2Repository exercise2Repository){
        this.exercise2Repository = exercise2Repository;
    }

    @Override
    public List<Integer> perfectNaturalNumber(int firstNum, int secondNum) throws Exercise2Exception {
        new Exercise2Validator(firstNum, secondNum);
        List<Integer> list = new ArrayList<>();
        for (int i = firstNum; i <= secondNum; i++) {
            if (i == 0) {
                continue;
            }
            int sum = 0;
            for (int j = 1; j < i; j++) {
                if (i % j == 0 && i % j != i) {
                    sum += j;
                }

            }
            if (i == sum) {
                list.add(i);
            }
        }
        saveRecord(list,firstNum, secondNum);
        return list;
    }

    private void saveRecord(List<Integer> list, int firstNum, int secondNum) {
        Exercise2Model exercise2Model = new Exercise2Model();
        exercise2Model.setFirstLimit(String.valueOf(firstNum));
        exercise2Model.setSecondLimit(String.valueOf(secondNum));
        exercise2Model.setResults(list.toString());
        exercise2Model.setDate(LocalDateTime.now());
        exercise2Repository.save(exercise2Model);
    }


    @Override
    public List<Exercise2Model> getHistory() {
        return exercise2Repository.findAll();
    }
}
