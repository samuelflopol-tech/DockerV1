package co.edu.ue.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.edu.ue.entities.Prueba;
import co.edu.ue.service.IPruebaService;

@RestController
@CrossOrigin(origins = "*")
public class testController {
	
	@Autowired
	IPruebaService services;
	
	@GetMapping(value="/saludar")
	public String hello() {
		return "Hola estudiantes de la 15A :)";
	}

	@GetMapping(value="/test_c")
	public String ci(){
		return "Prueba de integración continua";
	}

	@GetMapping(value="/test_19/06")
	public String aqui(){
		return "Prueba del 19 de junio";
	}
	
	@GetMapping(value="/sumar")
    public int sumar(
            @RequestParam int numero1,
            @RequestParam int numero2,
            @RequestParam int numero3) {

        return numero1 + numero2 + numero3;
    }
	
	@GetMapping(value="/lista")
	public List<Prueba> getTesting(){
		return services.listPrueba();
	}
	

}
