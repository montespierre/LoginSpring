package com.weimont.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weimont.app.contracts.IUsuarioContract;
import com.weimont.app.entity.Usuario;
import com.weimont.app.repository.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioContract{
	
	@Autowired
	private IUsuarioRepository usuarioRepository;

	@Override
	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return (List<Usuario>) usuarioRepository.findAll();
	}

	@Override
	public Usuario findByNombreEndsWith(String nombre, String password) {
		// TODO Auto-generated method stub
		return usuarioRepository.findByNombreEndsWith(nombre, password);
	}

	@Override
	public Usuario findById(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id).orElse(null);
	}

	@Override
	public Usuario save(Usuario usuario) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(usuario);
	}

	@Override
	public void delete(Long id) {
		usuarioRepository.deleteById(id);
		
	}

	
}
