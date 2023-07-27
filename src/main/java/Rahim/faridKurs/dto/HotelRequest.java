package Rahim.faridKurs.dto;

import jakarta.validation.constraints.NotBlank;

public record HotelRequest(
        @NotBlank
        String name,
        @NotBlank
        Character starRaiting,
        @NotBlank
        Double reviewScore
) {
}
