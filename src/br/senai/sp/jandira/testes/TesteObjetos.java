package br.senai.sp.jandira.testes;

import java.util.ArrayList;

import br.senai.sp.jandira.AgendaApp;
import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.SpringLayout;

public class TesteObjetos {

    public static void main(String[] args) {

        int[] a = {6, 9, 87, 35, 96};
        int[] b = new int[2];
        b[0] = 55;
        b[1] = 44;

        int c[][] = {
            {4, 5, 7}, {9, 4, 8}, {10, 999, 1000}
        };

        String[][] quitanda = {
            {"banana", "maça", "morango", "uva"},
            {"Alface", "Couve", "Pepino", "Salsinha", "Pimentão"},
            {"Abacate", "Limão", "Jiló"}
        };

        System.out.println(quitanda[1][4]);

        System.out.println(c[2][1]);//para imprimir o 999
        
        int[][][] testeAvassalador = {
            {
                {1,2,3},
                {3,3,3}
            },{
                {4,5,6},
                {8,9,0}
            },{
                {7,8,9},
                {1,44,4}
            }
        };

        System.out.println(testeAvassalador[0][0][0]);//Para imprimir 1
        
        
        System.out.println("************************************************");

        Especialidade especialidade1 = new Especialidade("Cardiologia");
        // especialidade1.setNome("Cardiologia");
        especialidade1.setDescricao("Não deixa ter um ataque");

        EspecialidadeDAO.gravar(especialidade1);

        Especialidade especialidade2 = new Especialidade("Clinico", "De tudo um pouco");

        EspecialidadeDAO.gravar(especialidade2);

        System.out.println("Especialidades em: " + EspecialidadeDAO.getEspecialidades());

        Especialidade especialidade3 = new Especialidade();
        especialidade3.setNome("Gatroemtrologia");
        especialidade3.setDescricao("Não deixa ter dor de barriga");

        EspecialidadeDAO.gravar(especialidade3);

        for (Especialidade ee : EspecialidadeDAO.getEspecialidades()) {
            System.out.println(ee.getNome() + " - " + ee.getCodigo());
        }

        EspecialidadeDAO.excluir(101);
        System.out.println("--------------------------------------");
        for (Especialidade ee : EspecialidadeDAO.getEspecialidades()) {
            System.out.println(ee.getNome() + " - " + ee.getCodigo());
        }
        System.out.println("----------------------------------");

        System.out.println("----------------------------------");
        Especialidade procurada = EspecialidadeDAO.getEspecialidade(102);
        System.out.println(procurada.getNome());

        System.out.println("-------UPDATE--------");
        Especialidade especialidadeAtualizada = new Especialidade();
        especialidadeAtualizada.setCodigo(102);
        especialidadeAtualizada.setNome("Otorrinolaringologia");
        especialidadeAtualizada.setDescricao("Nova descrição");
        EspecialidadeDAO.atualizar(especialidadeAtualizada);

        System.out.println("---------------------Novo Resultado------------------");
        for (Especialidade ee : EspecialidadeDAO.getEspecialidades()) {
            System.out.println(ee.getNome() + " - " + ee.getCodigo());
        }
        System.out.println("----------------------------------------------");

        ArrayList<Especialidade> especialidadades = new ArrayList<>();
        especialidadades.add(especialidade1);
        especialidadades.add(especialidade2);
        especialidadades.add(especialidade3);
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

        System.out.println("--------" + PlanoDeSaude.getQuantidade());

        AgendaApp.main(args);
        System.out.println("--------" + PlanoDeSaude.getQuantidade());

    }

}
