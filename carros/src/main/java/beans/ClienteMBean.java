package beans;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import repository.ClienteRepository;
import entities.Cliente;

@Named
@RequestScoped
public class ClienteMBean implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private List<Cliente> listaClientes;
	
	@Inject
	private Cliente cliente;
	
	@Inject
	private ClienteRepository clienteRepository;
	
	

}
