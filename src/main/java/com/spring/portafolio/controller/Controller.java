
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
import org.springframework.web.bind.annotation.RequestParam;
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
    public void crearPersona(@RequestBody Persona o){
        perServ.crear(o);
    }
    
    @GetMapping("ver/personas")
    @ResponseBody
    public List<Persona> verPersonas(){
        return  perServ.buscarAll();
    }
    
    @GetMapping("ver/persona")
    @ResponseBody
    public Persona verPersona(@RequestParam Long id){
        return perServ.buscarId(id);
    }
    
    @DeleteMapping("elimnar/persona")
    public void eliminarPersona(@RequestBody Persona o){
        perServ.eliminar(o);
    }
    
    @DeleteMapping("eliminar/persona")
    public void eliminarPersonaId(@RequestParam Long id){
        
        perServ.eliminarId(id);
    }
    
    @PutMapping("editar/persona")
    public void editarPersona(@RequestBody Persona o){
        perServ.editar(o);
    }
    
    //ESTUDIO
    
    @PostMapping("crear/educacion")
    public void crearEducacion(@RequestBody Educacion o){
        eduServ.crear(o);
    }
        
    @GetMapping("ver/educacion")
    @ResponseBody
    public Educacion verEducacionId(@RequestParam Long id){
        return eduServ.buscarId(id);
    }
    
    @GetMapping("ver/educacions")
    @ResponseBody
    public List<Educacion> verEducacions(){
        return eduServ.buscarAll();
    }
   
    @DeleteMapping("eliminar/educacion")
    public void eliminarEducacion(@RequestBody Educacion o){
        eduServ.eliminar(o);
    }
    
    @DeleteMapping("eliminar/educacion/id")
    public void eliminarEducacionId(@RequestParam Long id){
        eduServ.eliminarId(id);
    }    
    
    @PutMapping("editar/educacion")
    public void editarEducacion(@RequestBody Educacion e){
        eduServ.editar(e);
    }
    
    // EXPERIENCIA
    @PostMapping("crear/experiencia")
    public void crearExperiencia(@RequestBody Experiencia o){
        expServ.crear(o);
    }
    
    @GetMapping("ver/experiencias")
    public List<Experiencia> verExperiencias(){
        return expServ.buscarAll();
    }
    
    @GetMapping("ver/experiencia")
    public Experiencia verExperiencia( Long id){
        return expServ.buscarId(id);
    }
    
    @DeleteMapping("eliminar/experiencia")
    public void elimnarExperiencia(@RequestBody Experiencia o){
        expServ.eliminar(o);
    }
    
    @PutMapping("editar/experiencia")
    public void editarExperiencia(@RequestBody Experiencia o){
        expServ.editar(o);
    }
    
    // PROYECTO
    
    @PostMapping("crear/proyecto")
    public void crearProyecto(@RequestBody Proyecto o){      
        String href= o.getHref();
        String titulo= o.getTitulo();
        String descripcion =o.getDescripcion();
        String fecha=o.getFecha();
        proyecServ.crear(new Proyecto(href,titulo,descripcion,fecha));
    }
    
    @GetMapping("ver/proyectos")
    @ResponseBody
    public List<Proyecto> verProyectos(){
        return proyecServ.buscarAll();
    }
    
    @GetMapping("ver/proyecto")
    public Proyecto verProyecto(@RequestParam Long id){
        return proyecServ.buscarId(id);
    }
    
    @DeleteMapping("eliminar/proyecto")
    public void elimnarProyecto(@RequestBody Proyecto o){
        proyecServ.eliminar(o);
    }
    
    @PutMapping("editar/proyecto")
    public void editarProyecto(@RequestBody Proyecto o){
        
        o.setSrc("../assets/banner empresa");
        o.setAlt("Imagen empresa generica");
        
        proyecServ.editar(o);
    }
    
    // RED SOCIAL
    
    @PostMapping("crear/redsocial")
    public void crearRedSocial(@RequestBody RedSocial o){
        redSocServ.crear(o);
    }
    
    @GetMapping("ver/redsocial")
    public RedSocial verRedSocial(@RequestParam Long id){
        return redSocServ.buscarId(id);
    }
    
    @GetMapping("ver/redsociales")
    @ResponseBody
    public List<RedSocial> verRedSocial(){
        return redSocServ.buscarAll();
    }
    
    @DeleteMapping("eliminar/redsocial")
    public void elimnarRedSocial(@RequestBody RedSocial  o){
        redSocServ.eliminar(o);
    }
    
    @PutMapping("editar/redsocial")
    public void editarRedSocial(@RequestBody RedSocial  o){
        redSocServ.editar(o);
    }
    
     // SKILL

    @PostMapping("crear/skill")
    public void crearSkill(@RequestBody Skill o){
        skillServ.crear(o);
    }
    
    @GetMapping("ver/skills")
    @ResponseBody
    public List<Skill> verSkill(){
        return skillServ.buscarAll();
    }
    
    @GetMapping("ver/skill")
    @ResponseBody
    public Skill verSkill( Long id){
        return skillServ.buscarId(id);
    }
    
    @DeleteMapping("eliminar/skill")
    public void elimnarSkill(@RequestBody Skill o){
        skillServ.eliminar(o);
    }
    
    @PutMapping("editar/skill")
    public void editarSkill(@RequestBody Skill o){
        skillServ.editar(o);
    }

    
}
