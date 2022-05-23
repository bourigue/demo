package com.example.demo.repositories;

import com.example.demo.entites.Etudient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudientRespository extends JpaRepository<Etudient,Long> {

}
