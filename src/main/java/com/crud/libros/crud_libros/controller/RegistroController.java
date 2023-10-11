package com.crud.libros.crud_libros.controller;

import com.crud.libros.crud_libros.entity.Registro;
import com.crud.libros.crud_libros.services.RegistroServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RegistroController {
    @Autowired
    private RegistroServices registroServices;

    //ListarLibros
    @GetMapping("/index") // HTTP de la pagina
    public String listarLibrosRegistrados(Model modelo ){
        modelo.addAttribute("index",registroServices.listarLibrosRegistrados());
        return "index";// Este debe ser el nombre de tu archivo HTML sin la extensión.
    }//listarLibrosRegistrados

    //RegistrarLibros
    @GetMapping("/index/RegistrarLibros") // HTTP de la pagina
    public String registrarLibros(Model modelo){
        Registro libro = new Registro();
        modelo.addAttribute("libro",libro);
        return "RegistrarLibros";
    }//registrarLibros


}//RegistroController
