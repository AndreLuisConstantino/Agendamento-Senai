package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.PlanoDeSaudeDao;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class PlanoDeSaudeDialog extends javax.swing.JDialog {

    private PlanoDeSaude plano;
    private OperacaoEnum operacao;
    private DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public PlanoDeSaudeDialog(java.awt.Frame parent,
            boolean modal,
            OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();
        this.operacao = operacao;
    }

    public PlanoDeSaudeDialog(java.awt.Frame parent,
            boolean modal,
            PlanoDeSaude p, OperacaoEnum operacao) {
        super(parent, modal);
        initComponents();

        plano = p;
        this.operacao = operacao;
        preencherFormulario();
        preencherTitulo();
    }

    private void preencherFormulario() {
        textfieldCodigo.setText(plano.getCodigo().toString());
        textfieldOperadora.setText(plano.getOperadora());
        textfieldNumero.setText(plano.getNumero());
        textfieldCartegoria.setText(plano.getCategoria());
        textfieldValidade.setText(plano.getValidade().format(formato));

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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textfieldCodigo = new javax.swing.JTextField();
        labelOperadora = new javax.swing.JLabel();
        textfieldOperadora = new javax.swing.JTextField();
        labelNumero = new javax.swing.JLabel();
        textfieldNumero = new javax.swing.JTextField();
        labelCategoria = new javax.swing.JLabel();
        textfieldCartegoria = new javax.swing.JTextField();
        labelValidade = new javax.swing.JLabel();
        textfieldValidade = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais (1).png"))); // NOI18N
        labelTitulo.setText("Planos de Saúde - Adicionar");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(40, 20, 290, 24);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 760, 60);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adicionar Plano:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        jPanel2.setLayout(null);

        labelCodigo.setText("Código:");
        jPanel2.add(labelCodigo);
        labelCodigo.setBounds(30, 40, 50, 16);

        textfieldCodigo.setEditable(false);
        jPanel2.add(textfieldCodigo);
        textfieldCodigo.setBounds(30, 60, 90, 22);

        labelOperadora.setText("Operadora:");
        jPanel2.add(labelOperadora);
        labelOperadora.setBounds(30, 90, 80, 16);

        textfieldOperadora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldOperadoraActionPerformed(evt);
            }
        });
        jPanel2.add(textfieldOperadora);
        textfieldOperadora.setBounds(30, 110, 220, 22);

        labelNumero.setText("Número:");
        jPanel2.add(labelNumero);
        labelNumero.setBounds(30, 140, 70, 16);
        jPanel2.add(textfieldNumero);
        textfieldNumero.setBounds(30, 160, 150, 22);

        labelCategoria.setText("Categoria: ");
        jPanel2.add(labelCategoria);
        labelCategoria.setBounds(30, 190, 80, 16);
        jPanel2.add(textfieldCartegoria);
        textfieldCartegoria.setBounds(30, 210, 230, 22);

        labelValidade.setText("Validade: ");
        jPanel2.add(labelValidade);
        labelValidade.setBounds(30, 250, 60, 20);
        jPanel2.add(textfieldValidade);
        textfieldValidade.setBounds(30, 270, 280, 20);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonSalvar);
        buttonSalvar.setBounds(640, 330, 50, 40);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar (1).png"))); // NOI18N
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        jPanel2.add(buttonCancelar);
        buttonCancelar.setBounds(570, 330, 50, 40);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(10, 90, 730, 390);

        setSize(new java.awt.Dimension(774, 508));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

    private void textfieldOperadoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldOperadoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldOperadoraActionPerformed

    private void editar() {

        if (textfieldOperadora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não deixe o campo operação vazio!");
        } else if(textfieldNumero.getText().length() != 9) {
            JOptionPane.showMessageDialog(this, "O campo deve ter 9 dígitos!");
        } else if(textfieldCartegoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não deixe o campo categoria vazio!");
        } else if(textfieldValidade.getText().length() != 10){
            JOptionPane.showMessageDialog(this, "Veja se a data está correta!");
        } else {
        
        plano.setOperadora(textfieldOperadora.getText());
        plano.setNumero(textfieldNumero.getText());
        plano.setCategoria(textfieldCartegoria.getText());
        plano.setValidade(LocalDate.parse(textfieldValidade.getText(), formato));

        JOptionPane.showMessageDialog(null, "Edição concluída!");

        dispose();
        }
    }

    private void adicionar() {

        if (textfieldOperadora.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não deixe o campo operação vazio!");
        } else if(textfieldNumero.getText().length() != 9) {
            JOptionPane.showMessageDialog(this, "O campo deve ter 9 dígitos!");
        } else if(textfieldCartegoria.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Não deixe o campo categoria vazio!");
        } else if(textfieldValidade.getText().length() != 10){
            JOptionPane.showMessageDialog(this, "Veja se a data está correta!");
        } else {

        PlanoDeSaude novoPlano = new PlanoDeSaude();
        novoPlano.setOperadora(textfieldOperadora.getText());
        novoPlano.setNumero(textfieldNumero.getText());
        novoPlano.setCategoria(textfieldCartegoria.getText());
        novoPlano.setValidade(LocalDate.parse(textfieldValidade.getText(), formato));

        PlanoDeSaudeDao.gravar(novoPlano);
        JOptionPane.showMessageDialog(this,
                "Plano gravado com sucesso!",
                "Plano",
                JOptionPane.INFORMATION_MESSAGE);
        
        dispose();
        }
        
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelCategoria;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelOperadora;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelValidade;
    private javax.swing.JTextField textfieldCartegoria;
    private javax.swing.JTextField textfieldCodigo;
    private javax.swing.JTextField textfieldNumero;
    private javax.swing.JTextField textfieldOperadora;
    private javax.swing.JTextField textfieldValidade;
    // End of variables declaration//GEN-END:variables
}
