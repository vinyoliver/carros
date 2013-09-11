package entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Veiculo extends EntidadeBase {

	/**
	 *
	 */
	private static final long serialVersionUID = -6365544988000346317L;

	@Id
	@SequenceGenerator(name = "SEQ_VEICULO", sequenceName = "SEQ_VEICULO", initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQ_VEICULO")
	private Long id;

	@Column(length=4)
	private String placa;

	@Column(length=4)
	private String anoFabricacao;

	@Column(length=4)
	private String anoModelo;

	@Column(length=20)
	private String cor;

	@ManyToOne(optional=false)
	private Modelo modelo;

	@ManyToOne(optional=false)
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public String getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(String anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}



}
