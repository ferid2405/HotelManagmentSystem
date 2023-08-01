package Rahim.faridKurs.exception;

public record ErrorDetails(
        String message,
        String uri,
        int statusCode
) {
}
