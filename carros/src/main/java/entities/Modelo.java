package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class Modelo extends EntidadeBase{


	/**
	 * 
	 */
	private static final long serialVersionUID = -8031793257574059944L;
	@Id
	@SequenceGenerator(name = "SEQ_MODELO", sequenceName = "SEQ_MODELO")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator="SEQ_MODELO")
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



}
