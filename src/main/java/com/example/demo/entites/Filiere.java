package com.example.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Filiere {
    @Id
    @GeneratedValue
    private int idFiliere;
    private String name;
    @ManyToOne
    private Type type;
    @OneToOne
    private Etudiant etudiant;
}
