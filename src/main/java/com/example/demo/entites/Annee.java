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
public class Annee {
    @Id
    @GeneratedValue
    private int idAnnee;
    private String annee;
    @OneToMany(mappedBy = "annee")
    private Collection<ProfesseurHasModule> professeurHasModules;

}
