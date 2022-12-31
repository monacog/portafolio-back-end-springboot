
package com.spring.portafolio.service;

import com.spring.portafolio.model.Experiencia;
import com.spring.portafolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService {
    
    @Autowired
    public ExperienciaRepository expRep;
    
     public void crear(Experiencia e) {
        expRep.save(e);
    }

    public void eliminar(Experiencia e) {        
        expRep.delete(e);
    }

    public void eliminarId(Long id) {
       expRep.deleteById(id);
    }

    public List<Experiencia> buscarAll() {
       return expRep.findAll();
    }

    public Experiencia buscarId(Long id) {

        return expRep.findById(id).get();
    }

    public void editar(Experiencia e) {
        expRep.save(e);
    }

    public void editarId(Long id) {
        expRep.save(expRep.getReferenceById(id));
    }    
    
    
}
