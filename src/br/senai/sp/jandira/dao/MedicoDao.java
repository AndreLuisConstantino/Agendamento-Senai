
package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.util.ArrayList;

public class MedicoDao {
    
    private static ArrayList<Medico> medicos = new ArrayList<Medico>();
    
    //Metodos crud
    
    private static void gravar(Medico m){
        medicos.add(m);
    }
    
    private static Medico getMedico() {
        for(Medico m : medicos){
            if(m.getCodigo().equals(m)){
                return m;
            }
        }
        return null;
        
    }
    
    private static ArrayList<Medico> getMedicos(){
    
        return medicos;
    
    }
    
    
}
