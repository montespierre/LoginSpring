package com.weimont.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weimont.app.contracts.IUsuarioContract;
import com.weimont.app.entity.Usuario;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UsuarioController {

	@Autowired
	private IUsuarioContract usuarioContract;
	
	@PostMapping("/usuarios/login")
	public Usuario login(@RequestBody Usuario usuario) {
		
		Usuario u = usuarioContract.findByNombreEndsWith(usuario.getNombreUsuario(), usuario.getPasswordUsuario());
		if(u != null) {
			return u;
		}else {
			Usuario us = new Usuario();
			
			us.setNombre("No existe");
			
			return us;			
		}

	}
	
}
