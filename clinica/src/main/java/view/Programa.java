package view;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import control.VeterinarioControle;
import model.Veterinario;

public class Programa {

	public static void main(String[] args) {
		Veterinario v = new Veterinario(null, "Ramiro", "Pequenos animais");
		
		VeterinarioControle controle = new VeterinarioControle();
		
		controle.inserir(v);
		
		
		
		List<Veterinario> vets = controle.buscarTodos();
		for (Veterinario veterinario : vets) {
			System.out.println(veterinario.getNome());
		}
		
		controle.excluir(v);

	}

}
