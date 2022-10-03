package br.senai.sp.jandira;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.swing.JOptionPane;

import br.senai.sp.jandira.model.Agenda;
import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Estados;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.Paciente;
import br.senai.sp.jandira.model.PlanoDeSaude;

public class AgendaApp {

    public static void main(String[] args) {

        // Criar objeto plano de saúde
        PlanoDeSaude plano = new PlanoDeSaude();
        plano.setOperadora("Amil");
        plano.setCategoria("Rico");
        plano.setNumero("400028922");
        plano.setValidade(LocalDate.of(2023, 8, 20));

        PlanoDeSaude plano1 = new PlanoDeSaude();
        plano1.setOperadora("Amil");
        plano1.setCategoria("Pobre");
        plano1.setNumero("400028922");
        plano1.setValidade(LocalDate.of(2023, 8, 20));

        // Criar um objeto endereço
        Endereco endereco = new Endereco();
        endereco.setBairro("Brotinho");
        endereco.setNumero("905");
        endereco.setCidade("Jandira");
        endereco.setComplemento("Avenida Fulano");
        endereco.setLogradouro("Rua das cachorrada");
        endereco.setEstado(Estados.SAO_PAULO);
        endereco.setCep("0000000");

        // criar um onjeto cliente
        Paciente paciente = new Paciente();
        paciente.setNome("Rogério");
        paciente.setRg("40028922-8");
        paciente.setCpf("555-555-000/5");
        paciente.setDataDeNascimento(LocalDate.of(2004, 07, 17));
        paciente.setTelefone("94619-4573");
        paciente.setEndereco(endereco);
        paciente.setPlano(plano);

        Paciente paciente2 = new Paciente();
        paciente2.setNome("Patricia");
        paciente2.setRg("40028922");
        paciente2.setCpf("555-555-0");
        paciente2.setDataDeNascimento(LocalDate.of(2005, 8, 18));
        paciente2.setTelefone("946194573");
        paciente2.setEndereco(endereco);
        paciente2.setPlano(plano);

        System.out.println("***Exibir dados do Paciente");
        System.out.println("Nome do paciente:" + paciente.getNome());
        System.out.println("Telefone do paciente:" + paciente.getTelefone());
        System.out.println("Operadora do plano:" + paciente.getPlano().getOperadora());
        System.out.println("Categoria do plano:" + paciente.getPlano().getCategoria());
        System.out.println("Cidade do paciente:" + paciente.getEndereco().getCidade());
        System.out.println("Cidade:" + paciente.getEndereco().getCidade());

        Especialidade especialidade1 = new Especialidade("Cardiologia");
        //especialidade1.setNome("Cardiologista");
        especialidade1.setDescricao("Cuida do coração");

        Especialidade especialidade2 = new Especialidade("Clinico Geral");
        //especialidade2.setNome("Clinico Geral");
        especialidade2.setDescricao("Cuida de tudo um pouco");

        Especialidade especialidade3 = new Especialidade();
        especialidade3.setNome("Fisioterapeuta");
        especialidade3.setDescricao("Parte fisiológica em geral e muscular do corpo");
        
        Especialidade especialidade4 = new Especialidade();
        especialidade4.setNome("Gastro");
        especialidade4.setDescricao("não deixa ter dor de barriga");
        
        Especialidade especialidade5 = new Especialidade("Espec 5 "
                + "");
        
        
        System.out.println();
        System.out.println("Total de Especialidades: " +especialidade1.getContador());
        System.out.println(especialidade1.getCodigo() + "-" +especialidade1.getNome());
        System.out.println(especialidade2.getCodigo() + "-" +especialidade2.getNome());
        System.out.println(especialidade3.getCodigo() + "-" +especialidade3.getNome());
        System.out.println(especialidade4.getCodigo() + "-" +especialidade4.getNome());
        System.out.println(especialidade5.getCodigo() + "-" +especialidade5.getNome());

        //Criar um objeto médico
        Medico medico1 = new Medico();
        medico1.setNome("Yasmin");
        medico1.setEmail("yasmin@yasmin.com");
        medico1.setCrm("00000-5");
        medico1.setTelefone("11 97049-3172");
        Especialidade[] especialidades1 = {especialidade1, especialidade2};
        medico1.setEspecialidades(especialidades1);

        Medico medico2 = new Medico();
        medico2.setNome("André");
        medico2.setEmail("andre@gmail.com");
        medico2.setCrm("00000-5777");
        medico2.setTelefone("11 940002-8922");
        Especialidade[] especialidades2 = {especialidade1, especialidade3};
        medico2.setEspecialidades(especialidades2);

        System.out.println("***Exibir especialidades de cada médico");
        System.out.println("Nome do médico:" + medico1.getNome());

        int i = 0;
        while (i < medico1.getEspecialidades().length) {
            System.out.println("Especialidade:" + (i + 1) + medico1.getEspecialidades()[i].getNome());
            i++;
        }
        System.out.println("-------------------------------------");
        System.out.println("Nome do médico:" + medico2
                .getNome());

        i = 0;
        while (i < medico2.getEspecialidades().length) {
            System.out.println("Especialidade:" + (i + 1) + medico1.getEspecialidades()[i].getNome());
            i++;
        }

        //Fazer o agendamento do André e da yasmin
        Agenda agenda1 = new Agenda();
        agenda1.setDataDaConsulta(LocalDate.of(2022, 9, 27));
        agenda1.setEspecialidade(especialidade1);
        agenda1.setHoraDaConsulta(LocalTime.of(14, 15));
        agenda1.setMedico(medico1);
        agenda1.setPaciente(paciente);

        Agenda agenda2 = new Agenda();
        agenda2.setDataDaConsulta(LocalDate.of(2022, 10, 12));
        agenda2.setEspecialidade(especialidade3);
        agenda2.setHoraDaConsulta(LocalTime.of(9, 30));
        agenda2.setMedico(medico2);
        agenda2.setPaciente(paciente2);

        System.out.println();
        System.out.println("------------------------");
        System.out.println("Agenda do Paciente: " + agenda1.getPaciente().getNome());
        System.out.println("Especialidade: " + agenda1.getEspecialidade().getNome());
        System.out.println("Médico:" + agenda1.getMedico().getNome());
        System.out.println("Data:" + agenda1.getDataDaConsulta());
        System.out.println("Horas: " + agenda1.getHoraDaConsulta());

        System.out.println();
        System.out.println("------------------------");
        System.out.println("Agenda do Paciente: " + agenda2.getPaciente().getNome());
        System.out.println("Especialidade: " + agenda2.getEspecialidade().getNome());
        System.out.println("Médico:" + agenda2.getMedico().getNome());
        System.out.println("Data:" + agenda2.getDataDaConsulta());
        System.out.println("Horas: " + agenda2.getHoraDaConsulta());

        Especialidade xy = new Especialidade(null, null);

    }

}
