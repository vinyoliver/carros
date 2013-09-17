package repository;

import java.util.List;

import javax.ejb.Stateless;

import entities.Modelo;

@Stateless
public class ModeloRepository extends RepositoryBase<Modelo> {

	@SuppressWarnings("unchecked")
	public List<Modelo> findAll(){
		return em.createQuery("select m from Modelo m").getResultList();
	}


}
