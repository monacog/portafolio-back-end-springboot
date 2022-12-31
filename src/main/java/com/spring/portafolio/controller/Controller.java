
package com.spring.portafolio.controller;

import com.spring.portafolio.model.Educacion;
import com.spring.portafolio.model.Experiencia;
import com.spring.portafolio.model.Persona;
import com.spring.portafolio.model.Proyecto;
import com.spring.portafolio.model.RedSocial;
import com.spring.portafolio.model.Skill;
import com.spring.portafolio.service.EducacionService;
import com.spring.portafolio.service.ExperienciaService;
import com.spring.portafolio.service.PersonaService;
import com.spring.portafolio.service.ProyectoService;
import com.spring.portafolio.service.RedSocialService;
import com.spring.portafolio.service.SkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    public PersonaService perServ;
    
    @Autowired
    public EducacionService eduServ;
    
    @Autowired
    public ExperienciaService expServ;
    
    @Autowired
    public ProyectoService proyecServ;
    
    @Autowired
    public RedSocialService redSocServ;
    
    @Autowired
    public SkillService skillServ;
    
    // PERSONA
    
    @PostMapping("crear/persona")
    public void crearPersona(@RequestBody Persona persona){
        perServ.crear(persona);
    }
    
    @GetMapping("ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return  perServ.buscarAll();
    }
    
    @DeleteMapping("elimnar/persona")
    public void eliminarPersona(@RequestBody Persona persona){
        perServ.eliminar(persona);
    }
    
    @PutMapping("editar/persona")
    public void editarPersona(@RequestBody Persona persona){
        perServ.editar(persona);
    }
    
    
    @PostMapping("crear/educacion")
    public void crearEducacion(@RequestBody Educacion edu){
        eduServ.crear(edu);
    }
    
    //ESTUDIO
    
    @GetMapping("ver/estudio")
    public Educacion verEstudio( Long id){
        return eduServ.buscarId(id);
    }
    
    @GetMapping("ver/estudios")
    @ResponseBody
    public List<Educacion> verEstudios(){
        return eduServ.buscarAll();
    }
    
    @DeleteMapping("eliminar/estudio")
    public void elimnarEstudio(@RequestBody Educacion edu){
        eduServ.eliminar(edu);
    }
    
    @PutMapping("editar/educacion")
    public void editarEducacion(Educacion e){
        eduServ.editar(e);
    }
    
    // EXPERIENCIA
    @PostMapping("crear/experiencia")
    public void crearExperiencia(@RequestBody Experiencia o){
        expServ.crear(o);
    }
    
    @GetMapping("ver/experiencia")
    public Experiencia verExperiencia( Long id){
        return expServ.buscarId(id);
    }
    
    @GetMapping("ver/experiencias")
    @ResponseBody
    public List<Experiencia> verExperiencias(){
        return expServ.buscarAll();
    }
    
    @DeleteMapping("eliminar/experiencia")
    public void elimnarExperiencia(@RequestBody Experiencia o){
        expServ.eliminar(o);
    }
    
    @PutMapping("editar/experiencia")
    public void editarExperiencia(Experiencia o){
        expServ.editar(o);
    }
    
    // PROYECTO
    
    @PostMapping("crear/proyecto")
    public void crearProyecto(@RequestBody Proyecto o){
        proyecServ.crear(o);
    }
    
    @GetMapping("ver/proyecto")
    public Proyecto verProyecto( Long id){
        return proyecServ.buscarId(id);
    }
    
    @GetMapping("ver/proyectos")
    @ResponseBody
    public List<Proyecto> verProyecto(){
        return proyecServ.buscarAll();
    }
    
    @DeleteMapping("eliminar/proyecto")
    public void elimnarProyecto(@RequestBody Proyecto o){
        proyecServ.eliminar(o);
    }
    
    @PutMapping("editar/proyecto")
    public void editarProyecto(Proyecto o){
        proyecServ.editar(o);
    }
    
    // RED SOCIAL
    
    @PostMapping("crear/redsocial")
    public void crearRedSocial(@RequestBody RedSocial o){
        redSocServ.crear(o);
    }
    
    @GetMapping("ver/redsocial")
    public RedSocial verRedSocial( Long id){
        return redSocServ.buscarId(id);
    }
    
    @GetMapping("ver/redsociales")
    @ResponseBody
    public List<RedSocial > verRedSocial(){
        return redSocServ.buscarAll();
    }
    
    @DeleteMapping("eliminar/redsocial")
    public void elimnarRedSocial(@RequestBody RedSocial  o){
        redSocServ.eliminar(o);
    }
    
    @PutMapping("editar/redsocial")
    public void editarRedSocial(RedSocial  o){
        redSocServ.editar(o);
    }
    
     // SKILL

    @PostMapping("crear/skill")
    public void crearSkill(@RequestBody Skill o){
        skillServ.crear(o);
    }
    
    @GetMapping("ver/skill")
    public Skill verSkill( Long id){
        return skillServ.buscarId(id);
    }
    
    @GetMapping("ver/skill")
    @ResponseBody
    public List<Skill> verSkill(){
        return skillServ.buscarAll();
    }
    
    @DeleteMapping("eliminar/skill")
    public void elimnarSkill(@RequestBody Skill o){
        skillServ.eliminar(o);
    }
    
    @PutMapping("editar/skill")
    public void editarSkill(Skill o){
        skillServ.editar(o);
    }

    
}
