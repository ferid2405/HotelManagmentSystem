package Rahim.faridKurs.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;

public record UserRequest(
        String name,
        @Email
        String email,

        @Size(min = 8)
        String password
) {
}
