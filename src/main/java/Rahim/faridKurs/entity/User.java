package Rahim.faridKurs.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "User")
public class User {
    private Integer id;
    private String name;
    private String surname;
    private Integer roomNumber;
    private String email;
    private String password;
}
