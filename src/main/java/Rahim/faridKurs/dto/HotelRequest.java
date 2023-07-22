package Rahim.faridKurs.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record HotelRequest(
        @NotBlank
        String name,

        @NotBlank
        Character degree
) {
}
