package com.crud.libros.crud_libros.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "registro") // Table name
//Lombok
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class Registro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titulo;
    private String autor;
    private int anio;
    private String genero;
    private String resumen;

    public Registro(String titulo, String autor, int anio, String genero, String resumen) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
        this.genero = genero;
        this.resumen = resumen;
    }
}//Registro
