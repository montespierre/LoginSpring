package com.weimont.app.contracts;

import java.util.List;

import com.weimont.app.entity.Usuario;

public interface IUsuarioContract {
	
	public List<Usuario> findAll();
	
	public Usuario findByNombreEndsWith(String nombre, String password);
	
	public Usuario findById(Long id);
	
	public Usuario save(Usuario usuario);
	
	public void delete(Long id);

}
