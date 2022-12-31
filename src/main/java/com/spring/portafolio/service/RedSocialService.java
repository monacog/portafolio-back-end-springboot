
package com.spring.portafolio.service;

import com.spring.portafolio.model.RedSocial;
import com.spring.portafolio.repository.RedSocialRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RedSocialService {
    
    @Autowired
    public RedSocialRepository redSocRep;
    
     public void crear(RedSocial r) {
        redSocRep.save(r);
    }

    public void eliminar(RedSocial r) {        
        redSocRep.delete(r);
    }

    public void eliminarId(Long id) {
        redSocRep.deleteById(id);
    }

    public List<RedSocial> buscarAll() {
       return redSocRep.findAll();
    }

    public RedSocial buscarId(Long id) {

        return redSocRep.findById(id).get();
    }

    public void editar(RedSocial r) {
        redSocRep.save(r);
    }

    public void editarId(Long id) {
        redSocRep.save(redSocRep.getReferenceById(id));
    }    
    
    
    
    
}
