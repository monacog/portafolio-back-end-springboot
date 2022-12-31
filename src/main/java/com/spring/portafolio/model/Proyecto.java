
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
public class Proyecto {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String src;
    private String alt;
    private String href;
    private String titulo;
    private String descripcion;
    private String fecha;
    
    /*
        "src": "../assets/banner empresa",
	"alt": "Imagen empresa generica",
        "href": "https: //github.com/monacog/portafolio-FrontEnd.git",
	"titulo": "Why Me",
	"descripcion": "Pagina web simple para Fabrica de calzados - freelance.",
	"fecha": "Enero 2022"
    */

    public Proyecto() {
    }

    public Proyecto( String href, String titulo, String descripcion, String fecha) {
        this.src = "../assets/banner empresa";
        this.alt = "Imagen empresa generica";
        this.href = href;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
    
    
    
    
}
