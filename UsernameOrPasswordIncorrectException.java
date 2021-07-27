package main.exceptions;

public class UsernameOrPasswordIncorrectException extends Exception{
    public UsernameOrPasswordIncorrectException()
    {
        super("Incorrect username or password!");
    }
}
