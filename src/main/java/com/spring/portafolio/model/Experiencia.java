
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
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String experiencia;
    private String empresa;
    private String fechaInicio;
    private String fechaFinal;

    public Experiencia() {
    }

    public Experiencia(String experiencia, String empresa, String fechaInicio, String fechaFinal) {
        this.experiencia = experiencia;
        this.empresa = empresa;
        this.fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }
     
    
}
