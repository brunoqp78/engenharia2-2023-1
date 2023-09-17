package view;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import model.Veterinary;

public class Programa {

	public static void main(String[] args) {
		Veterinary v = new Veterinary(null, "Amanda", "Pequenos animais");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("projeto");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		em.persist(v);
		
		em.getTransaction().commit();
		
		em.close();
		emf.close();

	}

}
