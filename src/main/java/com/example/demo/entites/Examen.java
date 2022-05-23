package com.example.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Examen {
    @Id @GeneratedValue
    private int idExamen;
    private Date dateExamen;
    private String heure;
    @ManyToOne
    private Salle salle;
    @OneToMany(mappedBy = "examen")
    private Collection<Surveillant> surveillants;
}
