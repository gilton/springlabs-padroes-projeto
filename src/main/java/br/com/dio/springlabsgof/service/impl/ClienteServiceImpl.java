package br.com.dio.springlabsgof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.dio.springlabsgof.model.Cliente;
import br.com.dio.springlabsgof.model.ClienteRepository;
import br.com.dio.springlabsgof.model.Endereco;
import br.com.dio.springlabsgof.model.EnderecoRepository;
import br.com.dio.springlabsgof.service.ClienteService;
import br.com.dio.springlabsgof.service.ViaCepService;


/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 * 
 */

@Service
public class ClienteServiceImpl implements ClienteService {

	// Singleton: Injetar os componentes do Spring com @Autowired.
	
	@Autowired
	private ClienteRepository clienteRepository;
	@Autowired
	private EnderecoRepository enderecoRepository;
	@Autowired
	private ViaCepService viaCepService;
	
	// Strategy:	Implementar os métodos definidos na interface.
	// Facade: 		Abstrair integrações com subsistemas, provendo uma interface simples.
	
	@Override
	public Iterable<Cliente> buscarTodos() {
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		Optional<Cliente> clienteEncontrado = clienteRepository.findById(id);
		return clienteEncontrado.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		clienteRepository.save(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		Optional<Cliente> clienteEncontrado = clienteRepository.findById(id);
		if(clienteEncontrado.isPresent()) {
			salvarClienteECep(cliente);
		}
	}

	@Override
	public void deletar(Long id) {
		clienteRepository.deleteById(id);
	}


	private void salvarClienteECep(Cliente cliente) {
		
		String cep = cliente.getEndereco().getCep();
		
		Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
			// Caso não exista, integrar com o ViaCEP e persistir o retorno.
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
		cliente.setEndereco(endereco);
		clienteRepository.save(cliente);
	}	
	
}
