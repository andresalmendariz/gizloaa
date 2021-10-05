package com.usuarioMS.repository;

import java.io.Serializable;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.usuarioMS.model.usuariointerno;

@Repository
public interface UsuariosInternoRepository extends MongoRepository<usuariointerno, Serializable>{

}
