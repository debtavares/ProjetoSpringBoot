package com.example.curso.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.curso.entities.Categoria;
import com.example.curso.entities.Pedido;
import com.example.curso.entities.Usuario;
import com.example.curso.entities.enums.PedidoStatus;
import com.example.curso.repositories.CategoriaRepository;
import com.example.curso.repositories.PedidoRepository;
import com.example.curso.repositories.UsuarioRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	@Override
	public void run(String... args) throws Exception {
		Usuario u1 = new Usuario(null, "Maria", "123"); //id nulo pois o próprio banco de dados vai gerar
		
		Pedido p1 = new Pedido(null, Instant.parse("2022-05-20T19:53:07Z"), PedidoStatus.PAGO, u1);
		Pedido p2 = new Pedido(null, Instant.parse("2022-05-20T20:53:07Z"), PedidoStatus.PAGO, u1);
		
		Categoria c1 = new Categoria(null, "Books");
		
		usuarioRepository.saveAll(Arrays.asList(u1));   //passa uma lista de objetos para salvar no banco de dados
		pedidoRepository.saveAll(Arrays.asList(p1,p2));
	}

}
