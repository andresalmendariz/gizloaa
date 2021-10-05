package com.usuarioMS.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.usuarioMS.model.usuariointerno;
import com.usuarioMS.repository.UsuariosInternoRepository;

@RestController
public class UsuarioInternoController {
	

	private UsuariosInternoRepository repository;
	
	@PostMapping("/saveUsuario")
	public String saveUsuario(@RequestBody usuariointerno usuario) {
		repository.save(usuario);
		return "Agregado usuario : " + usuario.getId();
	}
	
	@GetMapping("/obtenerUsuariosInternos")
	public List<usuariointerno> getUsuario() {
		return repository.findAll();
	}
	
	@GetMapping("/obtenerUsuariosInternos/{id}")
	public Optional<usuariointerno> getUsuario(@PathVariable int id) {
		return repository.findById(id);
	}

}
