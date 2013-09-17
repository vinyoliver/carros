package repository;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.Query;

import entities.Estado;

@Stateless
public class EstadoRepository extends RepositoryBase<Estado>{

	@SuppressWarnings("unchecked")
	public List<Estado> buscarAll() {
		Query query = em.createQuery("SELECT e FROM Estado e");
		
		return query.getResultList();
	}

}
