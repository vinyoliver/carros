package beans;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import repository.EstadoRepository;
import utils.FacesUtil;
import entities.Estado;

@Named
@RequestScoped
public class EstadoMBeanForm implements Serializable{

	private static final long serialVersionUID = 6364848664858383906L;

	private List<Estado> listaEstados;
	
	@Inject
	private Estado estado;
	
	@Inject
	private EstadoRepository estadoRepository;
	
	@PostConstruct
	public void init() {
//		Estado estadoAlterado = (Estado) FacesUtil.getFlashScope().get("estado");
		
//		if(estadoAlterado != null){
//			estado= estadoAlterado;
//		}else{
//			estado = new Estado();
//		}
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	public void gravarEstado(){
		
		try {
			estadoRepository.salvar(estado);
		} catch (Exception e) {
			
			FacesUtil.exibirMensagemErro("Erro ao gravar");
			e.printStackTrace();
			return;	
		}
		
		FacesUtil.exibirMensagemInformacao("Estado Salvo");
		
		estado = new Estado();
		
	}
	

	public void remover(Estado estado){
		
		try {
			estadoRepository.remover(estado);
			listaEstados.remove(estado);
		} catch (Exception e) {
			FacesUtil.exibirMensagemErro("Erro ao gravar");
			e.printStackTrace();
		}
		
		FacesUtil.exibirMensagemInformacao("Excluido com sucesso!");
		
	}
	
	public String alterar(Estado estado){
		this.estado = estado;
		
		return "manterEstado?faces-redirect=true";
	}

	public List<Estado> getListaEstados() {
		
		if(listaEstados == null || listaEstados.isEmpty()){
			listaEstados = estadoRepository.buscarAll();
		}
		return listaEstados;
	}

	public void setListaEstados(List<Estado> listaEstados) {
		this.listaEstados = listaEstados;
	}

}
