package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Categoria extends EntidadeBase{


	/**
	 *
	 */
	private static final long serialVersionUID = -4680239426589830146L;
	@Id
	@SequenceGenerator(name = "SEQ_CATEGORIA", sequenceName = "SEQ_CATEGORIA")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQ_CATEGORIA")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



}
