package br.com.dio.springlabsgof.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nome;
	
	@ManyToOne
	private Endereco endereco;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", endereco=" + endereco + "]";
	}
	
	
	//Builder Class
	public static class Builder {
		private Cliente cliente;
		
		public Builder() {
			cliente = new Cliente();
		}
		
		public Builder id(Long id) {
			cliente.id = id;
			return this;
		}
		
		public Builder nome(String nome) {
			cliente.nome = nome;
			return this;
		}
		
		public Builder endereco(Endereco endereco) {
			cliente.endereco = endereco;
			return this;
		}
		
		public Cliente build() {
			return cliente;
		}
	}
}
