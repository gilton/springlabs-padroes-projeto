package br.com.dio.springlabsgof.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.dio.springlabsgof.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
