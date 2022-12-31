
package com.spring.portafolio.service;

import com.spring.portafolio.model.Skill;
import com.spring.portafolio.repository.SkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SkillService {
    
    @Autowired
    public SkillRepository skillRep;
    
     public void crear(Skill s) {
        skillRep.save(s);
    }

    public void eliminar(Skill s) {        
        skillRep.delete(s);
    }

    public void eliminarId(Long id) {
        skillRep.deleteById(id);
    }

    public List<Skill> buscarAll() {
       return skillRep.findAll();
    }

    public Skill buscarId(Long id) {

        return skillRep.findById(id).get();
    }

    public void editar(Skill s) {
        skillRep.save(s);
    }

    public void editarId(Long id) {
        skillRep.save(skillRep.getReferenceById(id));
    }    
    
}
