package com.example.demo.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public
class Etudient {

     @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;
     private String nom;




}
