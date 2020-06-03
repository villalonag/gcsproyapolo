package com.apolo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apolo.model.Transaccion;
import com.apolo.service.ITransaccionService;


@RestController
@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RequestMapping({"/Transacciones"})
public class TransaccionController {

    // inject via application.properties
    @Value("${welcome.message}")
    private String message;
    
    
	//@Autowired
	//private ITraxservice service;    
    @Autowired
    private ITransaccionService service;
    
    
    @GetMapping
    public List<Transaccion> ListarTransacciones() {        
       return service.list();
    }
    
    @GetMapping(path = {"/{idtrx}"})
    public Transaccion getransaccion(@PathVariable(value = "idtrx") int idtrx) {
    	return service.listarId(idtrx);
    }
    

	// Insert New
	@PostMapping   
	public Transaccion createTrax(@RequestBody Transaccion t) {    		
		return service.add(t);
	}

    
	// Insert New
	@PutMapping(path = {"/{idtrx}"})   
	public Transaccion updateTrax(@RequestBody Transaccion t, @PathVariable("idtrx") int idtrx) {
		///t.setIdtrx(idtrx);
		return service.add(t);
	}

	
    @DeleteMapping(path = {"/{idtrx}"})
    public Transaccion deleteTransaccion(@PathVariable(value = "idtrx") int idtrx) {
     	return service.delete(idtrx);
    }
      
        
	


    
   

}
