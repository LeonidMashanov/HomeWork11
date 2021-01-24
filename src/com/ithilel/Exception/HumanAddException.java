package com.ithilel.Exception;

public class HumanAddException extends Exception{
    public HumanAddException() {
        super();
    }

    public HumanAddException(String message) {
        super(message);
    }

    public HumanAddException(String message, Throwable cause) {
        super(message, cause);
    }

    public HumanAddException(Throwable cause) {
        super(cause);
    }
}
