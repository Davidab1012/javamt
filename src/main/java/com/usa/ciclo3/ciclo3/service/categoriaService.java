/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.ciclo3.ciclo3.service;

import com.usa.ciclo3.ciclo3.model.categoria;
import com.usa.ciclo3.ciclo3.repository.categoriaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */

@Service
public class categoriaService {
    @Autowired
    private categoriaRepository metodosCrud;
    
    public List<categoria> getAll(){
        return metodosCrud.getAll();
    }
    
    public Optional<categoria> getCategoria(int idCategoria){
        return metodosCrud.getCategoria(idCategoria);
    }
    
    public categoria save(categoria categoria){
        if(categoria.getId()==null){
            return metodosCrud.save(categoria);
        }else{
            Optional<categoria> evt=metodosCrud.getCategoria(categoria.getId());
            if(evt.isEmpty()){
                return metodosCrud.save(categoria);
            }else{
                return categoria;
            }
        }
    }
    public categoria update(categoria categoria){
        if(categoria.getId()!=null){
            Optional<categoria>g=metodosCrud.getCategoria(categoria.getId());
            if(!g.isEmpty()){
                if(categoria.getDescription()!=null){
                    g.get().setDescription(categoria.getDescription());
                }
                if(categoria.getName()!=null){
                    g.get().setName(categoria.getName());
                }
                return metodosCrud.save(g.get());
            }
        }
        return categoria;
    }
    public boolean deleteCategoria(int categoriaId){
        Boolean d=getCategoria(categoriaId).map(categoria -> {
            metodosCrud.delete(categoria);
            return true;
        }).orElse(false);
        return d;
    }
}

