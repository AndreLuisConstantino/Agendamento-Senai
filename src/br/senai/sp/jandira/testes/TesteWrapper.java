package br.senai.sp.jandira.testes;

import java.lang.reflect.Array;
import java.util.ArrayList;

import br.senai.sp.jandira.model.Especialidade;

public class TesteWrapper {

    public static void main(String[] args) {

        int a = 5;

        Integer b = 5; //wrap = embrulhar, impacotar, envolver.

        Double x = 7.7;

        ArrayList<Especialidade> especialidades = new ArrayList<>();

        Especialidade especialidade1 = new Especialidade();
        especialidade1.setNome("Cardiologia");
        especialidade1.setDescricao("Não deixa ter um ataque");

        Especialidade especialidade2 = new Especialidade();
        especialidade2.setNome("Gatroemtrologia");
        especialidade2.setDescricao("Não deixa ter dor de barriga");

        especialidades.add(especialidade1);
        especialidades.add(especialidade2);

        Especialidade especialidade3 = new Especialidade();
        especialidade3.setNome("Fisioterapia");
        especialidade3.setDescricao("Não deixa ficar com dor nas costas");

        especialidades.add(especialidade3);

        Especialidade especialidade4 = new Especialidade();
        especialidade4.setNome("Clinico geral");
        especialidade4.setDescricao("De tudo um pouco");

        // Especialidade[] especialidades = {especialidade1, especialidade2,
        // especialidade3, especialidade4};
        Especialidade especialidade5 = new Especialidade();
        especialidade5.setNome("Pediatria");
        especialidade5.setDescricao("Sabe cuidar das crianças/diabinhos");

        especialidades.add(especialidade4);
        especialidades.add(especialidade5);

        System.out.println(especialidades.size());

        ArrayList<Integer> notas = new ArrayList<>();
        notas.add(50);
        notas.add(12);
        notas.add(25);
        notas.add(13);
        System.out.println(notas.size());

        notas.add(28);
        notas.add(9);
        System.out.println(notas.size());

        System.out.println(especialidades.get(3).getNome());

        especialidades.get(1).setNome("teste");
        System.out.println(especialidades.get(1).getNome());

        Especialidade nova = especialidades.get(2);
        System.out.println(nova.getNome());
        nova.setNome("Ata");

        Especialidade xy = new Especialidade();

    }

}
