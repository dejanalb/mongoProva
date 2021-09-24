package com.rjcsoft.mongoprova.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rjcsoft.mongoprova.model.Anagrafica;
import com.rjcsoft.mongoprova.repository.AnagraficaRepository;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class Controller {

	@Autowired 
	AnagraficaRepository anagraficaRepository;
	
	public Controller(AnagraficaRepository anagraficaRepository) {
		super();
		this.anagraficaRepository = anagraficaRepository;
	}

    @PutMapping("/insert")
	public void insert(@RequestBody Anagrafica anagraf){
		
		this.anagraficaRepository.insert(anagraf);
		
		
	}
    
    @GetMapping("/find")
    public List<Anagrafica> find(){
       List<Anagrafica> anagrafics = this.anagraficaRepository.findAll();
       return anagrafics;
    }


}