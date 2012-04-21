package br.com.dedurando.util;

import java.util.List;

import javax.persistence.EntityManager;

public class DAO<T> {
	
	private final Class<T> classe;

	public DAO(Class<T> classe) {
			this.classe = classe;
	}

	public T buscaPorId(int id) {
			EntityManager em = new JPAUtil().getEntityManager();
			return em.find(this.classe, id);
	}

	public T buscaPorNome(String nome) {
		EntityManager em = new JPAUtil().getEntityManager();
		return em.find(this.classe, nome);
	}
	
	
	public void adiciona(T classe) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.persist(classe);
	}
	
	public void remove(T classe){
		EntityManager em = new JPAUtil().getEntityManager();
		em.remove(classe);
	}
	
	
	//Lista tudo 
	 public List<T> lista(){
		  EntityManager em = new JPAUtil().getEntityManager();
		  return em.createQuery("select e from " + classe.getName() + " e").getResultList();
	
	
	
	 }
}
