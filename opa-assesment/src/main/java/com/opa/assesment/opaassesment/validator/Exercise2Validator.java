package com.opa.assesment.opaassesment.validator;

import com.opa.assesment.opaassesment.exception.Exercise2Exception;

public class Exercise2Validator {

    public Exercise2Validator(int firstNum, int secondNum) throws Exercise2Exception {
        if ((firstNum < 0) || (secondNum < 0)) {
            throw new Exercise2Exception("Los números ingresados deben ser mayores o iguales a 0.");
        }
        if (firstNum == secondNum) {
            throw new Exercise2Exception("Los números ingresados deben ser diferentes entre ellos.");
        }
        if (firstNum > secondNum) {
            throw new Exercise2Exception("El límite inferior debe ser menor que el límite superior.");
        }
    }
}
