package com.usuarioPY.api.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.usuarioPY.api.model.UsuarioExterno;

public interface UsuariosExternoRepository extends MongoRepository<UsuarioExterno, Serializable> {

}
