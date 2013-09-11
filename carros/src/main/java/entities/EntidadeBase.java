package entities;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class EntidadeBase implements Serializable{

	private static final long serialVersionUID = 3825472823972114298L;


	public abstract Long getId();




}
