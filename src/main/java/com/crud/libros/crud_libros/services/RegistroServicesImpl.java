package com.crud.libros.crud_libros.services;
import com.crud.libros.crud_libros.entity.Registro;
import com.crud.libros.crud_libros.repository.RegistroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RegistroServicesImpl implements RegistroServices{
    @Autowired
    private RegistroRepository repository;
    @Override
    public List<Registro> listarLibrosRegistrados() {
        return repository.findAll();
    }
}//RegistroServices
