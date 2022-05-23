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
public class Professeur {
    @Id
    @GeneratedValue
    private int idProfesseur;
    private String nom;
    private String prenom;
    private String grade;
    private String cin;
    private int telephone;
    @OneToMany(mappedBy = "professeur")
    private Collection<ProfesseurHasModule> professeurHasModules;
}
