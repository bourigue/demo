package com.example.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProfesseurHasModule {
    @Id @GeneratedValue
    private int idProfesseurHasModule;
    @ManyToOne
    private Annee annee;
    @ManyToOne
    private Professeur professeur;
    @ManyToOne
    private Module module;
    @ManyToOne
    private CoursTDTP coursTDTP;
}
