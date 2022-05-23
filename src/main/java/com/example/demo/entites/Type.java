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
@NoArgsConstructor @AllArgsConstructor
public class Type {
    @Id
    @GeneratedValue
    private int idType;
    private String name;
    @OneToMany(mappedBy = "type")
    private Collection<Filiere> filieres;

}
