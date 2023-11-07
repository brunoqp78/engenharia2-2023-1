package control;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Veterinario;


public class VeterinarioControle {
	//atributos
	private EntityManager em;
	
	//construtor	
	public VeterinarioControle() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		em = emf.createEntityManager();
	}
	
	//getter and setters
	
	//métodos da classe
	
	public void inserir(Veterinario obj) {
		try {
			em.getTransaction().begin();
			em.persist(obj);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();			
		}
	}
	
	public void alterar(Veterinario obj) {
		try {
			em.getTransaction().begin();
			em.merge(obj);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();			
		}
	}
	
	public void excluir(Veterinario obj) {
		try {
			em.getTransaction().begin();
			em.remove(obj);
			em.getTransaction().commit();
		}catch(Exception e) {
			e.printStackTrace();
			em.getTransaction().rollback();			
		}
	}
	
	public void excluirPorId(Integer id) {
		try {
			Veterinario temp = buscarPorId(id);
			excluir(temp);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public Veterinario buscarPorId(Integer id) {
		return em.find(Veterinario.class, id);
	}
	
	public List<Veterinario> buscarTodos() {
		String nomeClasse = Veterinario.class.getName();		
		return em.createQuery("FROM " + nomeClasse).getResultList();
	}

}
