package main.exceptions;

public class UsernameAlreadyExistsException extends Exception{
    public UsernameAlreadyExistsException()
    {
        super("                     Username already exists!");
    }
}
