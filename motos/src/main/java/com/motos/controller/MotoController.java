package com.motos.controller;

import com.motos.model.Moto;
import com.motos.services.MotoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

// INDICA QUE ESTA CLASE RECOGE LAS PETICIONES DE LA URL DE LO QUE QUERAMOS HACER
@RestController
// INDICAR LA TABLA SOBRE LA QUE SE VAN A REALIZAR LAS OPERACIONES
@RequestMapping("/motos")
public class MotoController {

    // LA CLASE CONTROLLER ES LA QUE RECIBE LA INFORMACION DESDE FUERA Y SE LA PASA AL SERVICE
    // EL SERVICE CONTACTA CON LA BASE DE DATOS Y HAGA LAS OPERACIONES
    private MotoService motoService;

    public MotoController(MotoService motoService) {
        this.motoService = motoService;
    }

    // PARA INSERTAR DATOS EN LA TABLA SE USA POST
    @PostMapping("/insertar")
    public Moto insertarMoto(@RequestBody Moto moto){
        return motoService.insertarMoto(moto);
    }

    @GetMapping("/leerTodas")
    public List<Moto> leerMotos(){
        return motoService.leerMotos();
    }

    // ESPECIFICAMOS EN LA RUTA EL ID QUE SE VA A BUSCAR
    @GetMapping("/buscarMoto/{id}")
    public Optional<Moto> buscarMoto(@PathVariable int id){
        return motoService.leerMotoPorId(id);
    }

    // COMO QUEREMOS ELIMINAR UNA POR ID HAY QUE ESPECIFICARLO EN LA RUTA
    @DeleteMapping("/eliminar/{id}")
    public String eliminarMoto(@PathVariable int id){ // SE PASA POR PARAMETRO EL ID CORRESPONDIENTE
        boolean eliminada = motoService.eliminarMoto(id);
        if(eliminada){
            return "Moto eliminada correctamente.";
        }else {
            return "No se pudo eliminar moto.";
        }
    }

}
