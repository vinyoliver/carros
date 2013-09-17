package beans;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Named;

import lombok.Data;
import repository.MarcaRepository;
import repository.ModeloRepository;
import repository.VeiculoRepository;
import entities.Marca;
import entities.Modelo;
import entities.Veiculo;

@Named
public @Data
class VeiculoMB {

	@Inject
	private Veiculo veiculo;

	@Inject
	private VeiculoRepository veiculoRepository;

	@Inject
	private MarcaRepository marcaRepository;

	@Inject
	private ModeloRepository modeloRepository;

	public String getGreeting() {
		return "Hello World!";
	}

	public List<Marca> getMarcas() {
		return marcaRepository.findAll();
	}

	public List<Modelo> getModelos() {
		return modeloRepository.findAll();
	}


	public String salvar() {
		veiculoRepository.salvar(veiculo);
		return "buscar-veiculo";
	}
}
