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
public class RedSocial {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    
    private String href;
    private String target;
    private String classs;

    public RedSocial() {
    }

    public RedSocial(String href, String target, String classs) {
        this.href = href;
        this.target = target;
        this.classs = classs;
    }
    
    
            
            
}
