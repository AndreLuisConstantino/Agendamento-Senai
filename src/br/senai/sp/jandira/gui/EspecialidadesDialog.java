/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import javax.swing.JOptionPane;

public class EspecialidadesDialog extends javax.swing.JDialog {

    Especialidade especialidade;

    public EspecialidadesDialog(
            java.awt.Frame parent,
            boolean modal) {

        super(parent, modal);
        initComponents();
    }

    public EspecialidadesDialog(
            java.awt.Frame parent,
            boolean modal,
            Especialidade e) {

        super(parent, modal);
        initComponents();

        especialidade = e;

        preencherFormulario();

    }

    private void preencherFormulario() {

        labelTitulo.setText("Especialidades - Editar");
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource(
                "/br/senai/sp/jandira/imagens/ferramenta-lapis.png")));
        textfieldCodigo.setText(especialidade.getCodigo().toString());
        textfieldNomeDaEspecialidade.setText(especialidade.getNome());
        textfieldDescricaoDaEspecialidade.setText(especialidade.getDescricao());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInicio = new javax.swing.JPanel();
        labelTitulo = new javax.swing.JLabel();
        panelDetalhes = new javax.swing.JPanel();
        labelCodigo = new javax.swing.JLabel();
        textfieldCodigo = new javax.swing.JTextField();
        labelNomeDaEspecialidade = new javax.swing.JLabel();
        textfieldNomeDaEspecialidade = new javax.swing.JTextField();
        labelDescricaoDaEspecialidade = new javax.swing.JLabel();
        textfieldDescricaoDaEspecialidade = new javax.swing.JTextField();
        buttonSalvar = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        panelInicio.setBackground(new java.awt.Color(0, 204, 204));
        panelInicio.setLayout(null);

        labelTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelTitulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais (1).png"))); // NOI18N
        labelTitulo.setText("  Especialidades - Adicionar");
        panelInicio.add(labelTitulo);
        labelTitulo.setBounds(40, 20, 280, 24);

        getContentPane().add(panelInicio);
        panelInicio.setBounds(0, 0, 760, 60);

        panelDetalhes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalhes da Especialidade", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(255, 0, 0))); // NOI18N
        panelDetalhes.setLayout(null);

        labelCodigo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelCodigo.setText("Código:");
        panelDetalhes.add(labelCodigo);
        labelCodigo.setBounds(30, 50, 50, 20);

        textfieldCodigo.setEditable(false);
        textfieldCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldCodigoActionPerformed(evt);
            }
        });
        panelDetalhes.add(textfieldCodigo);
        textfieldCodigo.setBounds(30, 70, 230, 30);

        labelNomeDaEspecialidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelNomeDaEspecialidade.setText("Nome da Especialidade:");
        panelDetalhes.add(labelNomeDaEspecialidade);
        labelNomeDaEspecialidade.setBounds(30, 130, 170, 17);

        textfieldNomeDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldNomeDaEspecialidadeActionPerformed(evt);
            }
        });
        panelDetalhes.add(textfieldNomeDaEspecialidade);
        textfieldNomeDaEspecialidade.setBounds(30, 150, 390, 30);

        labelDescricaoDaEspecialidade.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelDescricaoDaEspecialidade.setText("Descrição da especialidade:");
        panelDetalhes.add(labelDescricaoDaEspecialidade);
        labelDescricaoDaEspecialidade.setBounds(30, 200, 180, 20);

        textfieldDescricaoDaEspecialidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textfieldDescricaoDaEspecialidadeActionPerformed(evt);
            }
        });
        panelDetalhes.add(textfieldDescricaoDaEspecialidade);
        textfieldDescricaoDaEspecialidade.setBounds(30, 220, 390, 30);

        buttonSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/save32.png"))); // NOI18N
        buttonSalvar.setToolTipText("Gravar especialidade");
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonSalvar);
        buttonSalvar.setBounds(650, 310, 60, 50);

        buttonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar (1).png"))); // NOI18N
        buttonCancelar.setToolTipText("Cancelar Especialidade");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });
        panelDetalhes.add(buttonCancelar);
        buttonCancelar.setBounds(570, 310, 60, 50);

        getContentPane().add(panelDetalhes);
        panelDetalhes.setBounds(10, 90, 730, 370);

        setSize(new java.awt.Dimension(775, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void textfieldDescricaoDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldDescricaoDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldDescricaoDaEspecialidadeActionPerformed

    private void textfieldCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldCodigoActionPerformed

    private void textfieldNomeDaEspecialidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textfieldNomeDaEspecialidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textfieldNomeDaEspecialidadeActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed

        //criar um objeto especialidade
        Especialidade novaEspecialidade = new Especialidade();
        novaEspecialidade.setNome(textfieldNomeDaEspecialidade.getText());
        novaEspecialidade.setDescricao(textfieldDescricaoDaEspecialidade.getText());

        //gravar atravez do Dao
        EspecialidadeDAO.gravar(novaEspecialidade);
        JOptionPane.showMessageDialog(this,
                "Especialidade gravada com sucesso ",
                "Especialidades",
                JOptionPane.INFORMATION_MESSAGE);

        dispose();


    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCancelarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EspecialidadesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EspecialidadesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EspecialidadesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EspecialidadesDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EspecialidadesDialog dialog = new EspecialidadesDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JLabel labelCodigo;
    private javax.swing.JLabel labelDescricaoDaEspecialidade;
    private javax.swing.JLabel labelNomeDaEspecialidade;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JPanel panelDetalhes;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JTextField textfieldCodigo;
    private javax.swing.JTextField textfieldDescricaoDaEspecialidade;
    private javax.swing.JTextField textfieldNomeDaEspecialidade;
    // End of variables declaration//GEN-END:variables
}
