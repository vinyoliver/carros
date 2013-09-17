package repository;

import java.util.List;

import javax.ejb.Stateless;

import entities.Categoria;

@Stateless
public class CategoriaRepository extends RepositoryBase<Categoria> {

	@SuppressWarnings("unchecked")
	public List<Categoria> findAll(){
		return em.createQuery("select c from Categoria c").getResultList();
	}


}
