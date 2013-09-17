package beans;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import repository.CategoriaRepository;
import repository.MarcaRepository;
import repository.ModeloRepository;
import repository.VeiculoRepository;
import entities.Categoria;
import entities.Marca;
import entities.Modelo;
import entities.Veiculo;

@Named
@RequestScoped
public class VeiculoMB implements Serializable {

	private static final long serialVersionUID = 6022007118177456291L;

	@Inject
	private Veiculo veiculo;

	@Inject
	private VeiculoRepository veiculoRepository;

	@Inject
	private MarcaRepository marcaRepository;

	@Inject
	private ModeloRepository modeloRepository;

	@Inject
	private CategoriaRepository categoriaRepository;

	public String getGreeting() {
		return "Hello World!";
	}

	public List<Marca> getMarcas() {
		return marcaRepository.findAll();
	}

	public List<Modelo> getModelos() {
		return modeloRepository.findAll();
	}

	public List<Categoria> getCategorias() {
		return categoriaRepository.findAll();
	}

	public List<Veiculo> getVeiculos() {
		return veiculoRepository.findAll();
	}

	public String salvar() {
		veiculoRepository.salvar(veiculo);
		return "buscar-veiculo";
	}

	public String remover(Veiculo veiculo) {
		veiculoRepository.remover(veiculo);
		return "buscar-veiculo";
	}

	public String alterar(Veiculo veiculo) {
		this.veiculo = veiculo;
		return "cadastrar-veiculo";
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}
}
