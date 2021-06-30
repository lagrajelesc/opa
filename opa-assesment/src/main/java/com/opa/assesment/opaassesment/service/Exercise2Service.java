package com.opa.assesment.opaassesment.service;

import com.opa.assesment.opaassesment.exception.Exercise2Exception;
import com.opa.assesment.opaassesment.model.Exercise2Model;

import java.io.Serializable;
import java.util.List;

public interface Exercise2Service extends Serializable {

    List<Integer> perfectNaturalNumber(int firstNum, int secondNum) throws Exercise2Exception;

    List<Exercise2Model> getHistory();
}
