/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.ciclo3.ciclo3.repository;

import com.usa.ciclo3.ciclo3.model.cliente;
import com.usa.ciclo3.ciclo3.repository.crud.clienteCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author USUARIO
 */
@Repository
public class clienteRepository {
      @Autowired
    private clienteCrudRepository crud1;
    

    public List<cliente> getAll(){
        return (List<cliente>) crud1.findAll();       
    }
    
    public Optional <cliente> getCliente(int id){
        return crud1.findById(id);
    }
    
    public cliente save(cliente cliente){
        return crud1.save(cliente);
    }
     public void delete(cliente cliente){
        crud1.delete(cliente);
    } 
}
