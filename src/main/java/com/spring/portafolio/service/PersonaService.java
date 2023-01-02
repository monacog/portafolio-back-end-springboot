
package com.spring.portafolio.service;

import com.spring.portafolio.model.Persona;
import com.spring.portafolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService {
    
    @Autowired
    public PersonaRepository persRepo;

    public void crear(Persona p) {
        persRepo.save(p);
    }

    public void eliminar(Persona p) {        
        persRepo.delete(p);
    }

    public void eliminarId(Long id) {
        persRepo.deleteById(id);
    }

    public List<Persona> buscarAll() {
       return persRepo.findAll();
    }

    public Persona buscarId(Long id) {

        return persRepo.findById(id).get();
    }

    public void editar(Persona p) {
        persRepo.save(p);
    }

    public void editarId(Long id) {
        persRepo.save(persRepo.getReferenceById(id));
    }    
    
}
