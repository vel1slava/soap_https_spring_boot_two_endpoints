package org.example.first;

import org.example.second.SecondOperationRequest;
import org.example.second.SecondOperationResponse;
import org.example.second.SecondServicePortType;

import javax.jws.WebParam;

/**
 * Created by vivi on 3.1.2017 г..
 */

public class SecondOperation implements SecondServicePortType {

    @Override
    public SecondOperationResponse executeSecondOperation(@WebParam(partName = "parameters", name = "secondOperationRequest", targetNamespace = "http://www.example.org/second/") SecondOperationRequest parameters) {
        String input = parameters.getIn();
        SecondOperationResponse response = new SecondOperationResponse();
        String output = createOutput(input);
        response.setOut(output);
        return response;
    }

    private String createOutput(String input) {
        switch (input) {
            case "date":
                return "date2 response";
            case "time":
                return "time2 response";
            default:
                return "default2";
        }
    }

}
