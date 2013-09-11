package repository;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import entities.EntidadeBase;

@Stateless
public class RepositoryBase<T extends EntidadeBase> {

	@PersistenceContext
	protected EntityManager em;

	protected T findById(Class<T> clazz, Long id){
		return em.find(clazz, id);
	}

	protected void salvar(T object){
		if(object.getId() == null){
			em.persist(object);
		}else{
			em.merge(object);
		}
	}


	protected void remover(T object){
		em.remove(object);
	}

}
