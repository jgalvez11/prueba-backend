package com.backend.mysql.app.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.mysql.app.models.entity.Usuario;
import com.backend.mysql.app.models.services.IUsuarioService;

@CrossOrigin(origins = { "http://localhost:*" })
@RestController
@RequestMapping(value = "/api")
public class UsuarioRestController {

	@Autowired
	private IUsuarioService iUsuarioService;

	@GetMapping("/usuario")
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> lista = new ArrayList<>();
		try {
			lista = iUsuarioService.findAll();
			return new ResponseEntity<>(lista, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(lista, HttpStatus.CONFLICT);
		}
	}

	@GetMapping("/usuario/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable("id") int id) {
		Usuario usuario = new Usuario();
		try {
			usuario = iUsuarioService.findById(id);
			return new ResponseEntity<>(usuario, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(usuario, HttpStatus.CONFLICT);
		}
	}

	@PostMapping("/usuario/save")
	public ResponseEntity<Usuario> saveUsuario(@RequestBody Usuario usuario) {
		Usuario usuarioCreado = new Usuario();
		try {
			usuarioCreado = iUsuarioService.save(usuario);
			return new ResponseEntity<>(usuarioCreado, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(usuarioCreado, HttpStatus.CONFLICT);
		}

	}

}
