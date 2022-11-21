
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class MedicoDao {
    
    private static ArrayList<Medico> medicos = new ArrayList<Medico>();
    
    //Metodos crud
    
    public static void gravar(Medico m){
        medicos.add(m);

    }
    
    public static void excluir(Integer codigo) {
        
        for(Medico m : medicos){
            if(m.getCodigo().equals(codigo));
            medicos.remove(m);
            break;
        }
        atualizarArquivo();
    }
    
    public static void atualizar(Medico medicoAtualizado) {
        
        for(Medico m : medicos){
            if(m.getCodigo().equals(medicoAtualizado.getCodigo())){
                medicos.set(medicos.indexOf(m), medicoAtualizado);
                break;
            }
        }
        atualizarArquivo();
    }  
    
    
    public static void atualizarArquivo(){
    
    }
    
    public static Medico getMedico(Integer codigo) {
        for(Medico m : medicos){
            if(m.getCodigo().equals(m)){
                return m;
            }
        }
        return null;
        
    }
    
    public static ArrayList<Medico> getMedicos(){
    
        return medicos;
    
    }
    
    public static DefaultTableModel getTabelaMedicos() {
        
        String[] titulos = {"CODIGO", "CRM", "NOME", "TELEFONE"};
        String dados[][] = new String[medicos.size()][4];
                
        for(Medico m: medicos){        
            int i = medicos.indexOf(m);
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
        }
        
        return new DefaultTableModel(dados, titulos);
    }

   
    
}
