package com.backend.mysql.app.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.backend.mysql.app.models.dao.IUsuarioDao;
import com.backend.mysql.app.models.entity.Usuario;

@Service
public class UsuarioServiceImpl implements IUsuarioService {

	@Autowired
	private IUsuarioDao iUsuarioDao;

	@Override
	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>) iUsuarioDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Usuario findById(int id) {
		return iUsuarioDao.findById(id).orElse(null);
	}

	@Override
	public Usuario save(Usuario usuario) {
		return iUsuarioDao.save(usuario);
	}

}
