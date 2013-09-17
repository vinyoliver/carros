package entities;

import java.sql.Date;

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
@Table(name = "TB_CLIENTE")
@NamedQueries({
	@NamedQuery(name= "Cliente.findByAll", query= "SELECT c FROM Cliente c")
})
public class Cliente extends EntidadeBase {
	
	private static final long serialVersionUID = 3891921765104404215L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "GEN_TB_CLIENTE")
	@SequenceGenerator(name = "GEN_TB_CLIENTE", sequenceName = "SEQ_TB_CLIENTE", allocationSize = 1)
	private Long id;
	
	private String nome;
	
	private String endereco;
	
	private String bairro;
	
	private String cep;
	
	private Date dataNascimento;
	
	private String fone;
	
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "cidade")
	private Cidade cidade;

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

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Cidade getCidade() {
		return cidade;
	}

	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}
}
