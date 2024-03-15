package br.com.dio.springlabsgof.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.dio.springlabsgof.model.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, String> {

}
