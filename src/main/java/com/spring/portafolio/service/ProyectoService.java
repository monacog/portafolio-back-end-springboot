
package com.spring.portafolio.service;

import com.spring.portafolio.model.Proyecto;
import com.spring.portafolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService {
    
    
    @Autowired
    public ProyectoRepository proyecRep;
    
     public void crear(Proyecto p) {
        proyecRep.save(p);
    }

    public void eliminar(Proyecto p) {        
        proyecRep.delete(p);
    }

    public void eliminarId(Long id) {
        proyecRep.deleteById(id);
    }

    public List<Proyecto> buscarAll() {
       return proyecRep.findAll();
    }

    public Proyecto buscarId(Long id) {

        return proyecRep.findById(id).get();
    }

    public void editar(Proyecto p) {
        proyecRep.save(p);
    }

    public void editarId(Long id) {
        proyecRep.save(proyecRep.getReferenceById(id));
    }    
    
    
}
