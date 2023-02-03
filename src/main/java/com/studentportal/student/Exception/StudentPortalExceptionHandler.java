package exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class StudentPortalExceptionHandler {

    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    @ExceptionHandler(exception.InvalidDetailsException.class)
    public Map<String,String> handleInvalidArgument(exception.InvalidDetailsException exception){
        System.out.println("In StudentPortalExceptionHandler....................");
        Map<String,String> errorMap = new HashMap<>();
        errorMap.put("error message", exception.getMessage());

        return errorMap;
    }
}