package Rahim.faridKurs.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Hotel")
public class Hotel {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Integer id;
    private String name;
    private Integer Raiting;
    private Double reviewScore;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Kabnet kabnet;



}
