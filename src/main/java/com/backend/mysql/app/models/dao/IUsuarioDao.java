package com.backend.mysql.app.models.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.backend.mysql.app.models.entity.Usuario;

@Repository
public interface IUsuarioDao extends CrudRepository<Usuario, Integer> {

}
