package org.example.first;

import javax.jws.WebParam;

/**
 * Created by vivi on 3.1.2017 г..
 */

public class FirstOperation implements FirstServicePortType {

    @Override
    public FirstOperationResponse executeFirstOperation(@WebParam(partName = "parameters", name = "firstOperationRequest", targetNamespace = "http://www.example.org/first/") FirstOperationRequest parameters) {
        String input = parameters.getIn();
        FirstOperationResponse response = new FirstOperationResponse();
        String output = createOutput(input);
        response.setOut(output);
        return response;
    }

    private String createOutput(String input) {
        switch (input){
            case "date" : return "date response";
            case "time" : return "time response";
            default: return "default";
        }
    }
}
