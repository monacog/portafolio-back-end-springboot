
package com.spring.portafolio.service;

import com.spring.portafolio.model.Educacion;
import com.spring.portafolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService {
    
    @Autowired
    public EducacionRepository eduRepos;
    
    public void crear(Educacion e) {
        eduRepos.save(e);
    }

    public void eliminar(Educacion e) {        
        eduRepos.delete(e);
    }

    public void eliminarId(Long id) {
        eduRepos.deleteById(id);
    }

    public List<Educacion> buscarAll() {
       return eduRepos.findAll();
    }

    public Educacion buscarId(Long id) {

        return eduRepos.findById(id).get();
    }

    public void editar(Educacion e) {
        eduRepos.save(e);
    }

    public void editarId(Long id) {
        eduRepos.save(eduRepos.getReferenceById(id));
    }    
}
