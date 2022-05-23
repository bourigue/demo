package com.example.demo.entites;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Examen_has_professeur_has_module_has_etudiant {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idExamen_has_professeur_has_module_has_etudiant;

}
