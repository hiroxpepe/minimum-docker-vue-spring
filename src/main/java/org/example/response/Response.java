package org.example.response;

import lombok.Getter;
import lombok.NonNull;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * a POJO class to be mapped to JSON
 */
@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Component(value="response") // name of the bean
@Scope(value="prototype")
public class Response {

    ///////////////////////////////////////////////////////////////////////////
    // Field

    @NonNull
    private String message; // content of message 

    @NonNull
    private boolean isError; // whether or not an error has occurred
}