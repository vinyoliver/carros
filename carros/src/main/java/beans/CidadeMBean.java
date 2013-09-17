package beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import repository.CidadeRepository;
import entities.Cidade;

@Named
public class CidadeMBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private List<Cidade> listaCidade;

	@Inject
	private Cidade cidade;

	@Inject
	private CidadeRepository cidadeRepository;
	
	@PostConstruct
	public void init() {
		
	}
	
	public void gravar(){
		
		
	}
	
	public void remover(){
		
		
	}
	
	public void alterar(){
		
		
	}

	public List<Cidade> getListaCidade() {
		return listaCidade;
	}

	public void setListaCidade(List<Cidade> listaCidade) {
		this.listaCidade = listaCidade;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}

	public CidadeRepository getCidadeRepository() {
		return cidadeRepository;
	}

	public void setCidadeRepository(CidadeRepository cidadeRepository) {
		this.cidadeRepository = cidadeRepository;
	}
	
}
