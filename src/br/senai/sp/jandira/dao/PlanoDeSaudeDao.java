package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDao {
    
    
    private final static String URL = "C:\\Users\\22282216\\Java\\PlanoDeSaude.txt";
    private final static Path PATH = Paths.get(URL);
    
    
    
    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

    //método gravar
    public static void gravar(PlanoDeSaude ps) {
        planosDeSaude.add(ps);
        
        //Gravando em arquivo
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH, 
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            escritor.write(ps.getPlanosSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Erro");
        }
    }

    //método atualizar
    public static void atualizar(PlanoDeSaude planoAtualizado) {
        for (PlanoDeSaude ps : planosDeSaude) {
            if (ps.getNumero() == planoAtualizado.getNumero()) {
                planosDeSaude.set(planosDeSaude.indexOf(ps), planoAtualizado);
            }
        }
    }

    //método excluir
    public static void excluir(Integer codigo) { //delete

        for (PlanoDeSaude ps : planosDeSaude) {
            if (ps.getCodigo() == codigo) {
                planosDeSaude.remove(ps);
                break;
            }
        }
    }

    //metodo get
    public static ArrayList<PlanoDeSaude> getPlanos() { //read
        return planosDeSaude;
    }

    public static PlanoDeSaude getPlano(Integer codigo) { //delete
        for (PlanoDeSaude ps : planosDeSaude) {
            if (ps.getCodigo() == codigo) {
                return ps;
            }
        }

        return null;

    }

    //Criar lista de planos
    public static void criarListaDePlanos() {
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            
            String linha = leitor.readLine();
            
            while(linha != null){
                //Transformar os dados da linha em uma especialidade
                String vetor[] = linha.split(";");
                PlanoDeSaude p = new PlanoDeSaude(
                        vetor[1], 
                        vetor[2], 
                        vetor[3], 
                        LocalDate.parse(vetor[4]), 
                        Integer.valueOf(vetor[0]));
                
                
                //Guardar a especialidade na lista
                planosDeSaude.add(p);
                
                linha = leitor.readLine();

            }
            leitor.close();
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo");
        }

    }
        
  
    public static DefaultTableModel getTabelaPlanos() {

        String[] titulo = {"CÓDIGO", "NOME DA OPERADORA", "CATEGORIA", "VALIDADE", "NUMERO"};
        String[][] dados = new String[planosDeSaude.size()][5];

        for (PlanoDeSaude ps : planosDeSaude) {
            int i = planosDeSaude.indexOf(ps);
            dados[i][0] = ps.getCodigo().toString();
            dados[i][1] = ps.getOperadora();
            dados[i][2] = ps.getCategoria();
            
            
             dados[i][3] = ps.getNumero();
             DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");
             dados[i][4] = ps.getValidade().format(formatacao);
           
        }

        return new DefaultTableModel(dados, titulo);

    }

}
