package com.example.demo.web;
import com.example.demo.entites.Etudient;
import com.example.demo.repositories.EtudientRespository;
import org.springframework.web.bind.annotation.*;
import java.util.List;

//Controlleur the repository Etudient
//@RestController

public class EtudientRestController {
   private EtudientRespository er;
//constructeur the controller Etudient
    public EtudientRestController (EtudientRespository er){
        this.er=er;
    }
//function the controller who return all etudient
    @GetMapping(path="/Etudient")
    public List<Etudient> etudientList(){
        return er.findAll();
    }
    @GetMapping(path="/Etudient/{id}")
    public Etudient etudientList(@PathVariable Long id){
            Etudient et=this.er.findById(id).get();
            return   et;
    }

    @PostMapping(path="/Etudient")
    public Etudient save(@RequestBody Etudient et){
        return er.save(et);
    }
    @PutMapping(path="/Etudient/{id}")
    public Etudient update(@PathVariable Long id,@RequestBody Etudient et){
        et.setId(id);
        return er.save(et);
    }
    @DeleteMapping(path="/Etudient/{id}")
    public void delete(@PathVariable Long id){
        er.deleteById(id);

    }






}
