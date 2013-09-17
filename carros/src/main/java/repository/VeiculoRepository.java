package repository;

import java.util.List;

import javax.ejb.Stateless;

import entities.Veiculo;

@Stateless
public class VeiculoRepository extends RepositoryBase<Veiculo> {

	@SuppressWarnings("unchecked")
	public List<Veiculo> findAll(){
		return em.createQuery("select v from Veiculo v").getResultList();
	}


}
