package com.example.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Salle {
    @Id
    @GeneratedValue
    private int idSalle;
    private String name;
    private int capaciteEtudiant;
    private int nombreSurveillant;
    @OneToMany(mappedBy = "salle")
    private Collection<Examen> examens;
}
