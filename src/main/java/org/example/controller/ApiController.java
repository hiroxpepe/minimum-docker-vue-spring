package org.example.controller;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import org.example.response.Response;

/**
 * a POJO class of controller to be requested via ajax
 */
@RequiredArgsConstructor
@Controller
public class ApiController {

    ///////////////////////////////////////////////////////////////////////////
    // Field

    @NonNull
    private ApplicationContext context; // lombok automatically creates a constructor and injects it from there

    ///////////////////////////////////////////////////////////////////////////
    // public methods

    // accepts ajax requests and returns a message
    @CrossOrigin
    @RequestMapping(
        value="/message",
        method=RequestMethod.GET,
        headers="Accept=application/json"
    )
    public @ResponseBody Response getMessage() {
        // normally, this is where the business logic is handled

        // return an object for the response
        return (Response) context.getBean(
            "response", // specify the name of the bean
            "Did you call me?", // content of message 
            false
        );
    }
}
