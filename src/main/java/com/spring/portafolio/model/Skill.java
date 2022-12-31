
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
public class Skill {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    
    private String classs;
    private String role;
    private String label;
    private String style;
    private int valuenow;
    private int valuemin;
    private int valuemax;
    private String lenguaje;   
    
    private static String[] predefinido= {"progress-bar progress-bar-striped progress-bar-animated",
                                        "progress-bar progress-bar-striped bg-success progress-bar-animated",
                                        "progress-bar progress-bar-striped bg-danger progress-bar-animated",
                                        "progress-bar progress-bar-striped bg-info progress-bar-animated",
                                        "progress-bar progress-bar-striped bg-warning progress-bar-animated"};
    
    public Skill() { }

    public Skill(int i, String style, int valuenow,String lenguaje) {
        this.classs = predefinido[i];
        this.role ="progressbar";
        this.label = "Success striped example";
        this.style = "width:"+valuenow+"%";
        this.valuenow = valuenow;
        this.valuemin = 0;
        this.valuemax = 100;
        this.lenguaje = lenguaje;
    }
    
    
    
    
    
    
   
    
}
