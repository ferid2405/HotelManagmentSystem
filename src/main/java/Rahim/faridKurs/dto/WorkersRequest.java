package Rahim.faridKurs.dto;


import jakarta.validation.constraints.NotNull;

public record WorkersRequest(
        @NotNull
        Integer id
) {
}
