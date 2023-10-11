package com.crud.libros.crud_libros;

import com.crud.libros.crud_libros.entity.Registro;
import com.crud.libros.crud_libros.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudLibrosApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CrudLibrosApplication.class, args);
    }

    @Autowired
    private RegistroRepository repository;

    @Override
    public void run(String... args) throws Exception {
//        //   Prueba para insertar datos
//        Registro libro1 = new Registro("Caballero Carmelo", "Abraham", 1990, "Epopeya", "Era un gallo");
//        Registro libro2 = new Registro("Libro3", "Autor", 2010, "Genero2", "Resumen222");
//        repository.save(libro1); // Guarda el libro
//        repository.save(libro2); // Guarda el libro
    }//run
}//CrudLibrosApplication
