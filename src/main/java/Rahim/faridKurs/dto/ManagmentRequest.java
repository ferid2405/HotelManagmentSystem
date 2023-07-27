package Rahim.faridKurs.dto;

import jakarta.validation.constraints.NotBlank;

public record ManagmentRequest(
        @NotBlank
        String name,
        @NotBlank
        String duty
) {
}
