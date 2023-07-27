package Rahim.faridKurs.dto;

import jakarta.validation.constraints.NotBlank;

public record CategoryRequest(
        @NotBlank
        Integer roomCount,
        @NotBlank
        Double price
) {
}
