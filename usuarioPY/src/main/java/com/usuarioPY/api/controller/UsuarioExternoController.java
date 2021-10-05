package com.usuarioPY.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.usuarioPY.api.model.UsuarioExterno;
import com.usuarioPY.api.repository.UsuariosExternoRepository;

public class UsuarioExternoController {

	private UsuariosExternoRepository repository;

	@PostMapping("/saveUsuario")
	public String saveUsuario(@RequestBody UsuarioExterno usuario) {
		repository.save(usuario);
		return "Agregado usuario : " + usuario.getId();
	}

	@GetMapping("/obtenerUsuariosInternos")
	public List<UsuarioExterno> getUsuario() {
		return repository.findAll();
	}

	@GetMapping("/obtenerUsuariosInternos/{id}")
	public Optional<UsuarioExterno> getUsuario(@PathVariable int id) {
		return repository.findById(id);
	}
}
