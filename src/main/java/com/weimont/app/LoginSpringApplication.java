package com.weimont.app;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.weimont.app.entity.Usuario;
import com.weimont.app.repository.IUsuarioRepository;

@SpringBootApplication
public class LoginSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoginSpringApplication.class, args);
	}
	
	@Bean
	ApplicationRunner applicationRunner(IUsuarioRepository usuarioRepository) {
		return args -> {
			
			Usuario usuario1 = new Usuario(1,"Juan", "Benavides", "juan@juan.com", "jcs", "jcs", "administrador");
			Usuario usuario2 = new Usuario(2, "Pedro", "Lopez", "pedro@pedro.com", "pbs", "pbsw", "administrador");
			
			usuarioRepository.save(usuario1);
			usuarioRepository.save(usuario2);
			
			
			
		};
		
	}

}
