package repository;

import java.util.List;

import javax.ejb.Stateless;

import entities.Marca;

@Stateless
public class MarcaRepository extends RepositoryBase<Marca> {

	@SuppressWarnings("unchecked")
	public List<Marca> findAll(){
		return em.createQuery("select m from Marca m").getResultList();
	}


}
