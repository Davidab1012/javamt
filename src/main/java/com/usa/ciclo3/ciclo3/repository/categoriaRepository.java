/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.ciclo3.ciclo3.repository;

import com.usa.ciclo3.ciclo3.model.categoria;
import com.usa.ciclo3.ciclo3.repository.crud.categoriaCrudRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


/**
 *
 * @author USUARIO
 */
@Repository
public class categoriaRepository {
    @Autowired
    private categoriaCrudRepository crud2;
    
     public List<categoria> getAll(){
        return (List<categoria>) crud2.findAll();       
    }
    
    public Optional <categoria> getCategoria(int id){
        return crud2.findById(id);
    }
    
    public categoria save(categoria categoria){
        return crud2.save(categoria);
    }
     public void delete(categoria categoria){
        crud2.delete(categoria);
    }
}
