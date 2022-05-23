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
public class Module {
    @Id
    @GeneratedValue
    private int idModule;
    private String groupe;
    @ManyToOne
    private Semestre semestre;
    @OneToMany(mappedBy = "module")
    private Collection<ProfesseurHasModule> professeurHasModules;

}
