package Rahim.faridKurs.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Managment")

public class Managment {
    private Integer id;
    private String name;
    private String duty;
}
