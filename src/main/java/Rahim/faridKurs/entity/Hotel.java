package Rahim.faridKurs.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Hotel")
public class Hotel {
    private Integer id;
    private String name;
    private Character starRaiting;
    private Double reviewScore;

    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Category category;
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    private Managment managment;


}
