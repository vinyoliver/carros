package beans;

import javax.inject.Inject;
import javax.inject.Named;

import entities.Modelo;

import repository.ModeloRepository;

@Named
public class HelloBean {

	@Inject
	private ModeloRepository modeloRepository;

	public String getGreeting() {
		Modelo m = new Modelo();
		modeloRepository.salvar(m);
		return "Hello World!";
	}
}
