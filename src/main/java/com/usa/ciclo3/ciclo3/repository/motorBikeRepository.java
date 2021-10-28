/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.ciclo3.ciclo3.repository;

import com.usa.ciclo3.ciclo3.model.motorBike;
import com.usa.ciclo3.ciclo3.repository.crud.motorBikeCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author USUARIO
 */
@Repository
public class motorBikeRepository {
     @Autowired
    private motorBikeCrudRepository crud;
    

    public List<motorBike> getAll(){
        return (List<motorBike>) crud.findAll();       
    }
    
    public Optional <motorBike> getOrthesis(int id){
        return crud.findById(id);
    }
    
    public motorBike save(motorBike motorbike){
        return crud.save(motorbike);
    }
      public void delete(motorBike motorbike){
        crud.delete(motorbike);
    }
    
    
}

