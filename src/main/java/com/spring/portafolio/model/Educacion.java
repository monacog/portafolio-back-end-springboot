
package com.spring.portafolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;



    
@Getter @Setter @ToString
@Entity
public class Educacion {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String titulo;
    private String institucion;
    private String fechaInicio;
    private String fechaFinal;

    public Educacion() {
    }

    public Educacion(String titulo, String institucion, String fechaInicio, String fechaFinal) {
        this.titulo = titulo;
        this.institucion = institucion;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    
    
}

