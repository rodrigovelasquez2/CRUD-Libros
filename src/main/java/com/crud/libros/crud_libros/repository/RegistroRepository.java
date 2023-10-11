package com.crud.libros.crud_libros.repository;

import com.crud.libros.crud_libros.entity.Registro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistroRepository extends JpaRepository<Registro,Long> {

}//RegistroRepository
