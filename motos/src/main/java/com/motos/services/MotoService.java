package com.motos.services;

import com.motos.model.Moto;
import com.motos.repository.MotoRepository;

import java.util.List;
import java.util.Optional;

// DESDE AQUI RECOGEMOS LOS QUE MANDA EL CONTROLLER PARA HACER LAS OPERACIONES EN LA BASE DE DATOS
// Contiene la lógica entre controller y repository: validaciones, transacciones, transformaciones, manejo de excepciones, etc.
public class MotoService {

    private MotoRepository repository;

    public Moto insertarMoto(Moto moto){
        // .SAVE PARA GUARDAR EN LA BASE DE DATOS
        return repository.save(moto);
    }

    public List<Moto> leerMotos(){
        // .FINDALL PARA BUSCAR TODOS LOS DISPONIBLES DE ALGO EN LA BASE DE DATOS
        return repository.findAll();
    }

    // NO PERMITE DEVOLVER DIRECTAMENTE LA MOTO
    public Optional<Moto> leerMotoPorId(int id){
        return repository.findById(id);
    }

    public boolean eliminarMoto(int id){
        if(repository.existsById(id)){
            repository.deleteById(id);
            return true;
        }
        else{
            return false;
        }
    }

}
