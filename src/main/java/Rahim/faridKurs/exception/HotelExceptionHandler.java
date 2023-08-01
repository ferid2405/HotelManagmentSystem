package Rahim.faridKurs.exception;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

@RequiredArgsConstructor
public class HotelExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(HotelNotFound.class)
    @ResponseStatus(code = HttpStatus.NOT_FOUND)
    public ResponseEntity<ErrorDetails> handleUserNotFound(WebRequest request, HotelNotFound exception){
        ErrorDetails errorDetails = new ErrorDetails(
                exception.getMessage(),
                request.getDescription(false),
                404);

        return ResponseEntity.ok(errorDetails);
    }
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    @ResponseStatus(code = HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<String> handleAll(WebRequest request,Exception exception){
        return ResponseEntity.ok(
                exception.getMessage() + " "
                        + request.getDescription(false));
    }

}
