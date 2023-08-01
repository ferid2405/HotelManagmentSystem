package Rahim.faridKurs.dto;

import jakarta.validation.constraints.NotBlank;

public record KabnetRequest(
        @NotBlank
        Integer roomCount,
        @NotBlank
        Double price
) {
}
