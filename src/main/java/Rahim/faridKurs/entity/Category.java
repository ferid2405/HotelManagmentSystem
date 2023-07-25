package Rahim.faridKurs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Category")
public class Category {
    @GeneratedValue
    @Id
    private Integer id;
    private Integer roomCount;
    private Double price;
}
