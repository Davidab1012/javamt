/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.usa.ciclo3.ciclo3.service;

import com.usa.ciclo3.ciclo3.model.mensaje;
import com.usa.ciclo3.ciclo3.repository.mensajeRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author USUARIO
 */
@Service
public class mensajeService {
        @Autowired
    private mensajeRepository metodosCrud;
    
    public List<mensaje> getAll(){
        return metodosCrud.getAll();
    }

    public Optional<mensaje> getMessage(int messageId) {
        return metodosCrud.getMessage(messageId);
    }
    
    public mensaje save(mensaje message){
        if(message.getIdMessage()==null){
            return metodosCrud.save(message);
        }else{
            Optional<mensaje> evt= metodosCrud.getMessage(message.getIdMessage());
            if(evt.isEmpty()){
                return metodosCrud.save(message);
            }else{
                return message;
            }
        }
    }
    public mensaje update(mensaje message){
        if(message.getIdMessage()!=null){
            Optional<mensaje> e= metodosCrud.getMessage(message.getIdMessage());
            if(!e.isEmpty()){
                if(message.getMessageText()!=null){
                    e.get().setMessageText(message.getMessageText());
                }
                metodosCrud.save(e.get());
                return e.get();
            }else{
                return message;
            }
        }else{
            return message;
        }
    }

    public boolean deleteMessage(int messageId) {
        Boolean aBoolean = getMessage(messageId).map(message -> {
            metodosCrud.delete(message);
            return true;
        }).orElse(false);
        return aBoolean;
    }
    
    
}

