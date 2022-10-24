package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDao {

    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

    //método gravar
    public static void gravar(PlanoDeSaude p) {
        planosDeSaude.add(p);
    }

    //método atualizar
    public static void atualizar(PlanoDeSaude planoAtualizado) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getNumero() == planoAtualizado.getNumero()) {
                planosDeSaude.set(planosDeSaude.indexOf(p), planoAtualizado);
            }
        }
    }

    //método excluir
    public static void excluir(String numero) { //delete

        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getNumero() == numero) {
                planosDeSaude.remove(p);
                break;
            }
        }
    }

    //metodo get
    public static ArrayList<PlanoDeSaude> getPlanos() { //read
        return planosDeSaude;
    }

    public static PlanoDeSaude getPlano(Integer codigo) { //delete
        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }

        return null;

    }

    //Criar lista de planos
    public static void criarListaDePlanos() {
        PlanoDeSaude plano1 = new PlanoDeSaude("Amil", "4002", "Premium", LocalDate.of(2023, Month.MARCH, 3));
        PlanoDeSaude plano2 = new PlanoDeSaude("Amil", "4002", "Premium", LocalDate.of(2023, Month.MARCH, 6));
        PlanoDeSaude plano3 = new PlanoDeSaude("Amil", "4002", "Lite", LocalDate.of(2025, Month.MARCH, 27));
        PlanoDeSaude plano4 = new PlanoDeSaude("Amil", "4002", "Lite", LocalDate.of(2024, Month.MARCH, 30));
        PlanoDeSaude plano5 = new PlanoDeSaude("Amil", "4002", "Lite", LocalDate.of(2099, Month.MARCH, 22));

        planosDeSaude.add(plano1);
        planosDeSaude.add(plano2);
        planosDeSaude.add(plano3);
        planosDeSaude.add(plano4);
        planosDeSaude.add(plano5);
    }
        
  
    public static DefaultTableModel getTabelaPlanos() {

        String[] titulo = {"CÓDIGO", "NOME DA OPERADORA", "CATEGORIA", "VALIDADE", "NUMERO"};
        String[][] dados = new String[planosDeSaude.size()][5];

        for (PlanoDeSaude p : planosDeSaude) {
            int i = planosDeSaude.indexOf(p);
            dados[i][0] = p.getCodigo().toString();
            dados[i][1] = p.getOperadora();
            dados[i][2] = p.getCategoria();
            dados[i][3] = p.getValidade().toString();
            dados[i][4] = p.getNumero();
        }

        return new DefaultTableModel(dados, titulo);

    }

}
