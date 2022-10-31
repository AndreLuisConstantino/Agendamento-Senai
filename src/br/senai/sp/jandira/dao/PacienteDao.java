package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Endereco;
import br.senai.sp.jandira.model.Paciente;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PacienteDao {

    private static ArrayList<Paciente> pacientes = new ArrayList<>();

    public static ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public static Paciente getPaciente(String cpf) {
        for (Paciente p : pacientes) {
            if (p.getCpf() == cpf) {
                return p;
            }
        }
        return null;
    }

    public static void gravar(Paciente p) {
        pacientes.add(p);
    }

    //metodo atualizar
    public static void atualizar(Paciente pacienteAtualizado) {
        for (Paciente p : pacientes) {
            if (p.getCpf() == pacienteAtualizado.getCpf()) {
                pacientes.set(pacientes.indexOf(p), pacienteAtualizado);
            }
        }
    }

    //método excluir
    public static void excluir(String cpf) {
        for (Paciente p : pacientes) {
            if (p.getCpf() == cpf) {
                pacientes.remove(p);
                break;
            }
        }
    }
    
    //Criar banco fake
    public static void criarListaDePacientes(){
        Paciente paciente1 = new Paciente("Celso",LocalDate.of(1884, Month.SEPTEMBER, 19),"94002-8921", "00000000-1","001-002-008-02");
        Paciente paciente2 = new Paciente("Celso Furtado",LocalDate.of(1884, Month.SEPTEMBER, 19),"94002-8999", "00000000-2","001-002-008-01" );
        Paciente paciente3 = new Paciente("Celso Robado",LocalDate.of(1884, Month.SEPTEMBER, 19),"94002-8988", "00000000-3","001-002-008-03");
        Paciente paciente4 = new Paciente("Celso 157",LocalDate.of(1884, Month.SEPTEMBER, 19),"94002-8911", "00000000-4","001-002-008-04");
        Paciente paciente5 = new Paciente("Celso Furto AMãoArmada",LocalDate.of(1884, Month.SEPTEMBER, 19),"94002-8967", "00000000-5","001-002-008-05");
        
        pacientes.add(paciente1);
        pacientes.add(paciente2);
        pacientes.add(paciente3);
        pacientes.add(paciente4);
        pacientes.add(paciente5);
    }
    
//    public static DefaultTableModel getTabelaPacientes() {
//    
//        String[] titulos = {"CODIGO", "NOME0", "DATA DE NASCIMENTO", "TELEFONE"};
//        
//        String[][] dados = new String[pacientes.size()][0];
//        
//        
//        
//
//        
//    }

}
