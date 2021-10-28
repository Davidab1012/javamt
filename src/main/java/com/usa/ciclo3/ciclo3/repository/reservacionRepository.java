/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.ciclo3.ciclo3.repository;

import com.usa.ciclo3.ciclo3.model.reservacion;
import com.usa.ciclo3.ciclo3.repository.crud.reservacionCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author USUARIO
 */
@Repository
public class reservacionRepository {
     @Autowired
    private reservacionCrudRepository crud4;
    
    public List<reservacion> getAll(){
        return (List<reservacion>) crud4.findAll();
    }
    public Optional<reservacion> getReservation(int id){
        return crud4.findById(id);
    }
    public reservacion save(reservacion reservacion){
        return crud4.save(reservacion);
    }
     public void delete(reservacion reservacion){
        crud4.delete(reservacion);
    }
   
}

