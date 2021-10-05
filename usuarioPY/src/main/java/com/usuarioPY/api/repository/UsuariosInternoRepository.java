package com.usuarioPY.api.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.usuarioPY.api.model.usuariointerno;


@Repository
public interface UsuariosInternoRepository extends MongoRepository<usuariointerno, Serializable>{

}
