package main.exceptions;

public class CourseNameExistsException extends Exception{
    public CourseNameExistsException()
    {
        super("                   Course name already exists!");
    }
}
