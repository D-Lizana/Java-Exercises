package com.motos.repository;
import com.motos.model.Moto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


// INDICA A SPRING QUE ESTA INTERFAZ FORMA PARTE DE LA CAPA DE ACCESO A DATOS
// HEREDA DE LA CLASE JPA PARA PODER USAR LOS METODOS PARA MANEJAR LA BASE DE DATOS

// hereda muchos métodos útiles ya implementados por Spring Data JPA: save(), findAll(), findById(), deleteById(), etc.
@Repository
public interface MotoRepository extends JpaRepository<Moto, Integer> {

}
