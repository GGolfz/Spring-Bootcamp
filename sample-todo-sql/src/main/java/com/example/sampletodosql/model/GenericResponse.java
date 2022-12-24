package com.example.sampletodosql.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class GenericResponse<T> {
    private boolean isSuccess;
    private T data;
    private Exception error;


    public static <T> GenericResponse successWithData(T data) {
        return new GenericResponse(
                true, data, null
        );
    }

    public static GenericResponse failureWithError(Exception exception) {
        return new GenericResponse(false, null, exception);
    }
}
