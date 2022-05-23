package com.example.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;
    private String nom;
    private String prenom;
    private String cne;
    private Date dateNaissance;
    @OneToOne
    //@JoinColumn(name="idFiliere")
    private Filiere filiere;

}
