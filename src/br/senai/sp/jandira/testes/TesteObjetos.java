package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class TesteObjetos {

	public static void main(String[] args) {

		Especialidade especialidade1 = new Especialidade("Cardiologia");
		// especialidade1.setNome("Cardiologia");
		especialidade1.setDescricao("Não deixa ter um ataque");

		Especialidade especialidade4 = new Especialidade("Clinico", "De tudo um pouco");

		Especialidade especialidade2 = new Especialidade();
		especialidade2.setNome("Gatroemtrologia");
		especialidade2.setDescricao("Não deixa ter dor de barriga");

		ArrayList<Especialidade> especialidadades = new ArrayList<>();
		especialidadades.add(especialidade1);
		especialidadades.add(especialidade2);
		especialidadades.add(especialidade4);
		System.out.println(especialidadades.size());

		// Imprimir no console o nome das especialidades que estão armazenadas no
		// arraylist
		int i = 0;
		while (i < especialidadades.size()) {
			System.out.println(especialidadades.get(i).getNome());
			i++;
		}

		// Utilizando o for para iteração no arraylist
		System.out.println("--------------------FOR-------------------");
		for (int x = 0; x < especialidadades.size(); x++) {
			System.out.println(especialidadades.get(x).getNome());
		}

		// FOR EACH
		System.out.println("----------------FOR EACH-----------------");
		for (Especialidade e : especialidadades) {
			System.out.println(e.getNome());
		}

		// Criar 3 planos de saude , e armazenar em um arraylist e exibir o nome de cada
		// um deles
		ArrayList<PlanoDeSaude> planos = new ArrayList<>();

		PlanoDeSaude plano1 = new PlanoDeSaude("Operadora de rico");

		PlanoDeSaude plano2 = new PlanoDeSaude();
		plano2.setOperadora("Operadora de pobre");

		PlanoDeSaude plano3 = new PlanoDeSaude();
		plano3.setOperadora("Operadora de classe média");

		planos.add(plano1);
		planos.add(plano2);
		planos.add(plano3);

		System.out.println("------------Planos de Saude----------------");
		for (PlanoDeSaude p : planos) {
			System.out.println(p.getOperadora());
			System.out.println(p.getQuantidade());
		}

		System.out.println("--------"+ PlanoDeSaude.getQuantidade());
		
		AgendaApp.main(args);
		System.out.println("--------"+ PlanoDeSaude.getQuantidade());

		
		
		
		
	}

}
