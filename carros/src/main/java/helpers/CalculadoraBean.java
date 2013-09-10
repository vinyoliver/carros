package helpers;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;



@Stateless
public class CalculadoraBean {

	@PersistenceContext
	private EntityManager manager;
}