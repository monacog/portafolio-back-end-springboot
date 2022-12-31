
package com.spring.portafolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity @Getter @Setter @ToString
public class Persona {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String nombre;
    private String apellido;
    private String pais;
    private String provincia;
    private String Localidad;
    private String edad;
    private String fechaNacimiento;

    public Persona() {
    }

    public Persona(String nombre, String apellido, String pais, String provincia, String Localidad, String edad, String fechaNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.pais = pais;
        this.provincia = provincia;
        this.Localidad = Localidad;
        this.edad = edad;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
       
    
}
