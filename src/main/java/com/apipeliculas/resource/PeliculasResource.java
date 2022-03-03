package com.apipeliculas.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apipeliculas.entity.Peliculas;
import com.apipeliculas.repository.IPeliculasRepository;

@RestController
@RequestMapping("/apiPeliculas/v1")
public class PeliculasResource {
	
	@Autowired
	private IPeliculasRepository peliculasRepository;
	
	
	@GetMapping("/peliculas")
	
	public List<Peliculas> findAll(){
		return peliculasRepository.findAll();
		
	}
	
	
	@PostMapping("/peliculas")
	
	public Peliculas create(@RequestBody Peliculas pelicula) {
		
		return peliculasRepository.save(pelicula);
		
	}
	
	
	@PutMapping("/peliculas/{id}")
	
	public Peliculas update(@RequestBody Peliculas pelicula, @PathVariable Integer id) {
	
		Peliculas peliculasBase = peliculasRepository.getById(id);
		
		peliculasBase.setNombre(pelicula.getNombre());
		peliculasBase.setGenero(pelicula.getGenero());
		peliculasBase.setFechaEstreno(pelicula.getFechaEstreno());
		peliculasBase.setPrecio(pelicula.getPrecio());
	
		
		return peliculasRepository.save(peliculasBase);
	}
	
	
	@DeleteMapping("/peliculas/{id}")
	
	public void delete(@PathVariable Integer id) {
		
		peliculasRepository.deleteById(id);
	}
	
	
	
	
	

}
