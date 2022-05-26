package com.example.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
