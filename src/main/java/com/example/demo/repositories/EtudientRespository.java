package com.example.demo.repositories;

import com.example.demo.entites.Etudient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "Etudient", path = "Etudient")
public interface EtudientRespository extends JpaRepository<Etudient,Long> {

}
