package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TB_ESTADO", uniqueConstraints=@UniqueConstraint(columnNames={"nome"}))
@NamedQueries({
			@NamedQuery(name= "Estado.findByNomeSigla", query= "SELECT e FROM Estado e WHERE UPPER(e.nome) like UPPER(:nome) AND UPPER(e.sigla) like UPPER(:sigla)")
})
public class Estado extends EntidadeBase {
	
	private static final long serialVersionUID = 8997376468957199237L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "GEN_TB_ESTADO")
	@SequenceGenerator(name = "GEN_TB_ESTADO", sequenceName = "SEQ_TB_ESTADO", allocationSize = 1)
	private Long id;
	
	@Column(name= "nome", unique = true)
	private String nome;
	
	@Column(name ="sigla",length =2)
	@Size(max = 2, min =2, message= "Sigla deve conter 2 caracteres")
	private String sigla;

	public Estado() {
	}

	public Estado(Long id, String nome, String sigla) {
		this.id = id;
		this.nome = nome;
		this.sigla = sigla;
	}

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

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
