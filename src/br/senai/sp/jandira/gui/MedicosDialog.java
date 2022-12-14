package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.MedicoDao;
import br.senai.sp.jandira.dao.PlanoDeSaudeDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

public class MedicosDialog extends javax.swing.JDialog {

    private Medico medico;
    private OperacaoEnum operacao;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public MedicosDialog(java.awt.Frame parent, boolean modal, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
        preencherTitulo();
        preencherLista();
    }

    public MedicosDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao,
            Medico m) {
        super(parent, modal);
        initComponents();

        medico = m;
        this.operacao = operacao;
        preencherFormulario();
        preencherTitulo();
        preencherLista();
        preencherEspecialidades();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textfieldCodigo = new javax.swing.JTextField();
        textfieldCrm = new javax.swing.JTextField();
        labelCrm = new javax.swing.JLabel();
        textfieldNomeDoMedico = new javax.swing.JTextField();
        labelNomeDoMedico = new javax.swing.JLabel();
        textfieldTelefone = new javax.swing.JTextField();
        labelTelefone = new javax.swing.JLabel();
        textfieldEmail = new javax.swing.JTextField();
        labelEmail = new javax.swing.JLabel();
        textfieldDataDeNascimento = new javax.swing.JTextField();
        labelDataDeNascimento = new javax.swing.JLabel();
        scrollListaEspecialidades = new javax.swing.JScrollPane();
        jlistEspecialidadesMedico = new javax.swing.JList<>();
        scrollListaDeEspecialidadesMedico = new javax.swing.JScrollPane();
        jlisListaDeEspecialidades = new javax.swing.JList<>();
        buttonPassarParaAEsquerda = new javax.swing.JButton();
        buttonPassarParaADireita = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais (1).png"))); // NOI18N
        labelTitulo.setText("Medicos - ADICIONAR");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(40, 20, 240, 24);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 60);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes do M??dico:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setLayout(null);

        labelCodigo.setText("C??digo:");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(30, 40, 50, 16);

        textfieldCodigo.setEditable(false);
        textfieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldCodigoActionPerformed(evt);
            }
        });
        jPanel2.add(textfieldCodigo);
        textfieldCodigo.setBounds(30, 60, 90, 30);

        textfieldCrm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldCrmActionPerformed(evt);
            }
        });
        jPanel2.add(textfieldCrm);
        textfieldCrm.setBounds(140, 60, 90, 30);

        labelCrm.setText("CRM:");
        jPanel2.add(labelCrm);
        labelCrm.setBounds(140, 40, 50, 16);

        textfieldNomeDoMedico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldNomeDoMedicoActionPerformed(evt);
            }
        });
        jPanel2.add(textfieldNomeDoMedico);
        textfieldNomeDoMedico.setBounds(260, 60, 240, 30);

        labelNomeDoMedico.setText("Nome do m??dico:");
        jPanel2.add(labelNomeDoMedico);
        labelNomeDoMedico.setBounds(260, 40, 110, 16);

        textfieldTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldTelefoneActionPerformed(evt);
            }
        });
        jPanel2.add(textfieldTelefone);
        textfieldTelefone.setBounds(30, 140, 140, 30);

        labelTelefone.setText("Telefone:");
        jPanel2.add(labelTelefone);
        labelTelefone.setBounds(30, 120, 50, 16);

        textfieldEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldEmailActionPerformed(evt);
            }
        });
        jPanel2.add(textfieldEmail);
        textfieldEmail.setBounds(200, 140, 350, 30);

        labelEmail.setText("Email:");
        jPanel2.add(labelEmail);
        labelEmail.setBounds(200, 120, 50, 16);

        textfieldDataDeNascimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldDataDeNascimentoActionPerformed(evt);
            }
        });
        jPanel2.add(textfieldDataDeNascimento);
        textfieldDataDeNascimento.setBounds(570, 140, 140, 30);

        labelDataDeNascimento.setText("Data de Nascimento:");
        jPanel2.add(labelDataDeNascimento);
        labelDataDeNascimento.setBounds(570, 120, 130, 16);

        scrollListaEspecialidades.setViewportView(jlistEspecialidadesMedico);

        jPanel2.add(scrollListaEspecialidades);
        scrollListaEspecialidades.setBounds(270, 210, 150, 130);

        scrollListaDeEspecialidadesMedico.setViewportView(jlisListaDeEspecialidades);

        jPanel2.add(scrollListaDeEspecialidadesMedico);
        scrollListaDeEspecialidadesMedico.setBounds(60, 210, 150, 130);

        buttonPassarParaAEsquerda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/seta-esquerda.png"))); // NOI18N
        buttonPassarParaAEsquerda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPassarParaAEsquerdaActionPerformed(evt);
            }
        });
        jPanel2.add(buttonPassarParaAEsquerda);
        buttonPassarParaAEsquerda.setBounds(220, 290, 40, 40);

        buttonPassarParaADireita.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/seta-direita.png"))); // NOI18N
        buttonPassarParaADireita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPassarParaADireitaActionPerformed(evt);
            }
        });
        jPanel2.add(buttonPassarParaADireita);
        buttonPassarParaADireita.setBounds(220, 230, 40, 40);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(640, 320, 60, 50);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar (1).png"))); // NOI18N
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(570, 320, 60, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 90, 730, 380);

        setSize(new java.awt.Dimension(774, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void preencherLista() {
        jlisListaDeEspecialidades.setModel(EspecialidadeDAO.getListaDeEspecialidades());
    }

    private void preencherTitulo() {
        labelTitulo.setText("Planos - " + operacao);

        if (operacao == OperacaoEnum.EDITAR) {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/br/senai/sp/jandira/imagens/mais (1).png")));
        } else {
            labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                    "/br/senai/sp/jandira/imagens/ferramenta-lapis.png")));
        }
    }

    private void preencherFormulario() {
        textfieldCodigo.setText(medico.getCodigo().toString());
        textfieldCrm.setText(medico.getCrm());
        textfieldNomeDoMedico.setText(medico.getNome());
        textfieldTelefone.setText(medico.getTelefone());
        textfieldEmail.setText(medico.getEmail());
        textfieldDataDeNascimento.setText(medico.getDataDeNascimento().format(formato));
    }

    private void preencherEspecialidades() {
        System.out.println("teste");

        DefaultListModel<Especialidade> listaEspMedico = new DefaultListModel<>();
        for (Especialidade e : medico.getEspecialidades()) {
            listaEspMedico.addElement(e);
        }
        jlistEspecialidadesMedico.setModel(listaEspMedico);
    }


    private void textfieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldCodigoActionPerformed

    private void textfieldCrmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldCrmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldCrmActionPerformed

    private void textfieldNomeDoMedicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldNomeDoMedicoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldNomeDoMedicoActionPerformed

    private void textfieldTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldTelefoneActionPerformed

    private void textfieldEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldEmailActionPerformed

    private void textfieldDataDeNascimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldDataDeNascimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldDataDeNascimentoActionPerformed

    private void buttonPassarParaAEsquerdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPassarParaAEsquerdaActionPerformed
        if (jlistEspecialidadesMedico.isSelectionEmpty() == false) {

            ArrayList<Especialidade> listaAtualizada = new ArrayList<>();
            int tamanho = jlistEspecialidadesMedico.getModel().getSize();
            for (int c = 0; c < tamanho; c++) {
                listaAtualizada.add(jlistEspecialidadesMedico.getModel().getElementAt(c));
            }
            listaAtualizada.remove(jlistEspecialidadesMedico.getSelectedValue());
            DefaultListModel<Especialidade> listaDeEspecialidadesDoMedico = new DefaultListModel<>();
            for (Especialidade e : listaAtualizada) {
                listaDeEspecialidadesDoMedico.addElement(e);
            }
            jlistEspecialidadesMedico.setModel(listaDeEspecialidadesDoMedico);
        } else {
            JOptionPane.showMessageDialog(null,
                    "Uma especialidade diferente",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonPassarParaAEsquerdaActionPerformed

    private void buttonPassarParaADireitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPassarParaADireitaActionPerformed
        if (jlisListaDeEspecialidades.isSelectionEmpty() == false) {

            ArrayList<Especialidade> noListaDoMedico = new ArrayList<>();
            int tamanho = jlistEspecialidadesMedico.getModel().getSize();
            for (int c = 0; c < tamanho; c++) {
                noListaDoMedico.add(jlisListaDeEspecialidades.getModel().getElementAt(c));
            }
            if (noListaDoMedico.contains(jlisListaDeEspecialidades.getSelectedValue()) == false) {

                noListaDoMedico.add(jlisListaDeEspecialidades.getSelectedValue());
                DefaultListModel<Especialidade> listaDeEspecialidadesDoMedico = new DefaultListModel<>();

                for (Especialidade e : noListaDoMedico) {

                    listaDeEspecialidadesDoMedico.addElement(e);

                }

                jlistEspecialidadesMedico.setModel(listaDeEspecialidadesDoMedico);

            } else {
                JOptionPane.showMessageDialog(null,
                        "Selecione a especialidade que deseja mover!",
                        "AVISO",
                        JOptionPane.INFORMATION_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null,
                    "Selecione a especialidade que deseja mover",
                    "AVISO",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_buttonPassarParaADireitaActionPerformed

    public ArrayList<Especialidade> pegarEspecialidades(JList<Especialidade> lista) {
        int tamanho = lista.getModel().getSize();
        ArrayList<Especialidade> listaNova = new ArrayList<>();
        for (int contador = 0; contador < tamanho; contador++) {
            listaNova.add(lista.getModel().getElementAt(contador));
        }
        return listaNova;
    }

    private void editar() {

        if (textfieldCrm.getText().length() != 9) {
            JOptionPane.showMessageDialog(null, "O campo CRM deve ter no min??mo 9 n??meros");
        } else if (textfieldNomeDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome n??o pode ficar vazio!!!");
        } else if (textfieldTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "N??o deixe o campo telefone vazio!");
        } else if (textfieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "N??o deixe o campo email vazio!");
        } else if (textfieldDataDeNascimento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo data de nascimento n??o pode ficar vazio!");
        } else if (jlisListaDeEspecialidades.getModel().getSize() == 0) {
            JOptionPane.showMessageDialog(null, "Por favor escolha uma especialidade");
        } else {

            medico.setCrm(textfieldCrm.getText());
            medico.setNome(textfieldNomeDoMedico.getText());
            medico.setTelefone(textfieldTelefone.getText());
            medico.setEmail(textfieldEmail.getText());
            medico.setDataDeNascimento(LocalDate.parse(
                    textfieldDataDeNascimento.getText(),
                    formato));
            medico.setEspecialidade(pegarEspecialidades(jlistEspecialidadesMedico));

            MedicoDao.atualizar(medico);

            JOptionPane.showMessageDialog(null, "Edi????o conclu??da!");

            dispose();
        }
    }

    private void adicionar() {

        if (textfieldCrm.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "N??o deixe o campo CRM vazio!");
        } else if (textfieldNomeDoMedico.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O nome n??o pode ficar vazio!!!");
        } else if (textfieldTelefone.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "N??o deixe o campo telefone vazio!");
        } else if (textfieldEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "N??o deixe o campo email vazio!");
        } else if (textfieldDataDeNascimento.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "O campo data de nascimento n??o pode ficar vazio!");
        } else {

            Medico novoMedico = new Medico();
            novoMedico.setCrm(textfieldCrm.getText());
            novoMedico.setNome(textfieldNomeDoMedico.getText());
            novoMedico.setTelefone(textfieldTelefone.getText());
            novoMedico.setEmail(textfieldEmail.getText());
            novoMedico.setDataDeNascimento(
                    LocalDate.parse(textfieldDataDeNascimento.getText(),
                            formato));
            novoMedico.setEspecialidade(pegarEspecialidades(jlistEspecialidadesMedico));

            MedicoDao.gravar(novoMedico);
            JOptionPane.showMessageDialog(this,
                    "Medico gravado com sucesso!",
                    "Medico",
                    JOptionPane.INFORMATION_MESSAGE);

            dispose();
        }
    }

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        if (operacao == OperacaoEnum.ADICIONAR) {
            adicionar();
        } else {
            editar();
        }

    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonPassarParaADireita;
    private javax.swing.JButton buttonPassarParaAEsquerda;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JList<Especialidade> jlisListaDeEspecialidades;
    private javax.swing.JList<Especialidade> jlistEspecialidadesMedico;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelCrm;
    private javax.swing.JLabel labelDataDeNascimento;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNomeDoMedico;
    private javax.swing.JLabel labelTelefone;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JScrollPane scrollListaDeEspecialidadesMedico;
    private javax.swing.JScrollPane scrollListaEspecialidades;
    private javax.swing.JTextField textfieldCodigo;
    private javax.swing.JTextField textfieldCrm;
    private javax.swing.JTextField textfieldDataDeNascimento;
    private javax.swing.JTextField textfieldEmail;
    private javax.swing.JTextField textfieldNomeDoMedico;
    private javax.swing.JTextField textfieldTelefone;
    // End of variables declaration//GEN-END:variables
}
