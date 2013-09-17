package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_CIDADE")
@NamedQueries({
	@NamedQuery(name= "Cidade.findByNomeEstado", query= "SELECT c FROM Cidade c WHERE UPPER(c.nome) like UPPER(:nome) AND c.estado.id = (:idEstado)"),
	@NamedQuery(name= "Cidade.findByAll", query= "SELECT c FROM Cidade c")
})
public class Cidade extends EntidadeBase {
	
	private static final long serialVersionUID = 5386386680833860718L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "GEN_TB_CIDADE")
	@SequenceGenerator(name = "GEN_TB_CIDADE", sequenceName = "SEQ_TB_CIDADE", allocationSize = 1)
	private Long id;
	
	private String nome;
	
	@ManyToOne
	@JoinColumn(name = "estado")
	private Estado estado;

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

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

}
