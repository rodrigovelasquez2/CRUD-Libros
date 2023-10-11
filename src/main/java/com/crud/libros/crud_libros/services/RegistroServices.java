package com.crud.libros.crud_libros.services;

import com.crud.libros.crud_libros.entity.Registro;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface RegistroServices {
    public List<Registro> listarLibrosRegistrados();

}//RegistroServices
