package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.util.ArrayList;

public class EspecialidadeDAO {

    /*
    Essa classe será responsável pela resistência de dados das especialidades,
    exemplo: adicionar, excluir etc...
     */
    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static void gravar(Especialidade e) { //Create
        especialidades.add(e);
    }

    public static ArrayList<Especialidade> getEspecialidades() { //read
        return especialidades;
    }

    public static Especialidade getEspecialidade(Integer codigo) { //delete
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                return e;
            }
        }

        return null;

    }

    public static void atualizar(Especialidade especialidadeAtualizada) { //update
        for (Especialidade e : especialidades) {
            if (e.getCodigo() == especialidadeAtualizada.getCodigo()) {
                especialidades.set(especialidades.indexOf(e), especialidadeAtualizada);
                break;
            }
        }
    }

    public static void excluir(Integer codigo) { //delete

        for (Especialidade e : especialidades) {
            if (e.getCodigo() == codigo) {
                especialidades.remove(e);
                break;
            }
        }
    }

}
