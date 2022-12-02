package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDao {

//    private final static String URL = "C:\\Users\\22282216\\Java\\Medicos.txt";
//    private final static String URL_TEMP = "C:\\Users\\22282216\\Java\\Medicos-temp.txt";
    private final static String URL = "C:\\Users\\andre\\Java\\Medicos.txt";
    private final static String URL_TEMP = "C:\\Users\\andre\\Java\\Medicos-temp.txt";
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Medico> medicos = new ArrayList<Medico>();

    //Metodos crud
    public static void gravar(Medico m) {
        medicos.add(m);

        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            escritor.write(m.getMedicosSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException error) {
            JOptionPane.showMessageDialog(null, "Erro");
        }

    }

    public static void excluir(Integer codigo) {

        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo));
            medicos.remove(m);
            break;
        }
        atualizarArquivo();
    }

    public static void atualizar(Medico medicoAtualizado) {

        for (Medico m : medicos) {
            if (m.getCodigo().equals(medicoAtualizado.getCodigo())) {
                medicos.set(medicos.indexOf(m), medicoAtualizado);
                break;
            }
        }
        atualizarArquivo();
    }

    public static void atualizarArquivo() {
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {

            arquivoTemp.createNewFile();

            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);

            for (Medico m : medicos) {

                bwTemp.write(m.getMedicosSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }

            bwTemp.close();
            arquivoAtual.delete();
            arquivoTemp.renameTo(arquivoAtual);

        } catch (Exception error) {
            error.printStackTrace();
        }
    }

    public static Medico getMedico(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        return null;

    }

    public static ArrayList<Medico> getMedicos() {

        return medicos;

    }

    public static DefaultTableModel getTabelaMedicos() {

        String[] titulos = {"CODIGO", "CRM", "NOME", "TELEFONE"};
        String dados[][] = new String[medicos.size()][4];

        for (Medico m : medicos) {
            int i = medicos.indexOf(m);
            dados[i][0] = m.getCodigo().toString();
            dados[i][1] = m.getCrm();
            dados[i][2] = m.getNome();
            dados[i][3] = m.getTelefone();
        }

        return new DefaultTableModel(dados, titulos);
    }

    public static ArrayList<Especialidade> codigosSeparadosPorPontoEVirgula(String linha) {
        String[] vetor = linha.split(";");

        int vetorDaEspecialidade = 6;

        ArrayList<Especialidade> codigosDaEspecialidade = new ArrayList<>();

        try {
            while (vetor.length > vetorDaEspecialidade) {
                codigosDaEspecialidade.add(EspecialidadeDAO.getEspecialidade(Integer.valueOf(vetor[vetorDaEspecialidade])));
                vetorDaEspecialidade++;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return codigosDaEspecialidade;
    }

    public static void criarListaDeMedicos() {
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);

            String linha = leitor.readLine();

            while (linha != null) {
                //Transformar os dados da linha em uma especialidade
                String vetor[] = linha.split(";");
                Medico m = new Medico(
                        vetor[1],
                        vetor[2],
                        vetor[3],
                        LocalDate.parse(vetor[5]),
                        Integer.valueOf(vetor[0]),
                        vetor[4],
                        codigosSeparadosPorPontoEVirgula(linha));

                //Guardar a especialidade na lista
                medicos.add(m);

                linha = leitor.readLine();

            }
            leitor.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao ler o arquivo");
        }
    }

    public static Path getPath() {
        return PATH;
    }

}
