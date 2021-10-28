/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.ciclo3.ciclo3.repository;

import com.usa.ciclo3.ciclo3.model.mensaje;
import com.usa.ciclo3.ciclo3.repository.crud.mensajeCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author USUARIO
 */
@Repository
public class mensajeRepository {
    @Autowired
    private mensajeCrudRepository crud3;
    public List<mensaje> getAll(){
        return (List<mensaje>) crud3.findAll();
    }
    public Optional<mensaje> getMessage(int id){
        return crud3.findById(id);
    }

    public mensaje save(mensaje message){
        return crud3.save(message);
    }
     public void delete(mensaje mensaje){
        crud3.delete(mensaje);
    }
}