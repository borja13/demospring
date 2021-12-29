package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiTablasGenerales {

	@RequestMapping(value = "/tablas/{idTabla}", method = RequestMethod.GET)
	public String obtenerTablas(@PathVariable String idTabla) {

		return "Buenas";
		
	}
	
	@GetMapping("/prueba")
    public List<String> findAll(){
		List<String> palabrabas = new ArrayList();
		palabrabas.add("AAsdsa");
		palabrabas.add("AA");
		palabrabas.add("AA");
		palabrabas.add("AA");
		palabrabas.add("AA");
        //retornará todos los usuarios
        return palabrabas;
    }
}
