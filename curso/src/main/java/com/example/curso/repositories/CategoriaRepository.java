package com.example.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entities.Usuario;

public interface CategoriaRepository extends JpaRepository<Usuario, Long> {

}
