package main.exceptions;

public class EmptyFieldException extends Exception {

    public EmptyFieldException()
    {
        super("                     All fields are required!");
    }
}
