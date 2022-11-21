package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import java.awt.Toolkit;

public class HomeFrame extends javax.swing.JFrame {

    public HomeFrame() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/br/senai/sp/jandira/imagens/agenda_1.png")));
        initPanels();
    }
    // Atributos da classe
    PanelEspecialidades panelEspecialidades;
    PanelPlanoDeSaude panelPlanoDeSaude;
    PanelMedicos panelMedicos;

    //Constantes da classe
    private final int POS_X = 30;
    private final int POS_Y = 190;
    private final int LARGURA = 790;
    private final int ALTURA = 230;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        iconAgenda = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        buttonHome = new javax.swing.JButton();
        buttonPacientes = new javax.swing.JButton();
        buttonMedicos = new javax.swing.JButton();
        buttonsEspecialidades = new javax.swing.JButton();
        buttonPlanoDeSaude = new javax.swing.JButton();
        buttonSair = new javax.swing.JButton();
        panelHome = new javax.swing.JPanel();
        labelTituloPanel = new javax.swing.JLabel();
        labelSubtitulo = new javax.swing.JLabel();
        labelDadosDeContato = new javax.swing.JLabel();
        labelEmail = new javax.swing.JLabel();
        labelNumero = new javax.swing.JLabel();
        labelSite = new javax.swing.JLabel();
        panelDivisoria = new javax.swing.JPanel();
        buttonAgenda1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Agendamento");
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));
        jPanel1.setLayout(null);

        iconAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda.png"))); // NOI18N
        jPanel1.add(iconAgenda);
        iconAgenda.setBounds(20, 10, 40, 40);

        labelTitulo.setFont(new java.awt.Font("Arial", 2, 24)); // NOI18N
        labelTitulo.setText("Sistema para Agendamento de Consultas");
        jPanel1.add(labelTitulo);
        labelTitulo.setBounds(60, 20, 460, 28);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 850, 70);

        buttonHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/botao-home (1).png"))); // NOI18N
        buttonHome.setToolTipText("Botão para voltar no Home");
        buttonHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHomeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonHome);
        buttonHome.setBounds(690, 90, 50, 50);

        buttonPacientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/paciente.png"))); // NOI18N
        buttonPacientes.setToolTipText("Botão para ver os pacientes");
        buttonPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPacientesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPacientes);
        buttonPacientes.setBounds(140, 90, 100, 50);

        buttonMedicos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/medico.png"))); // NOI18N
        buttonMedicos.setToolTipText("Botão para ver os médicos");
        buttonMedicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosActionPerformed(evt);
            }
        });
        getContentPane().add(buttonMedicos);
        buttonMedicos.setBounds(250, 90, 90, 50);

        buttonsEspecialidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/distintivo.png"))); // NOI18N
        buttonsEspecialidades.setToolTipText("Botão para ver as especialidades");
        buttonsEspecialidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonsEspecialidadesActionPerformed(evt);
            }
        });
        getContentPane().add(buttonsEspecialidades);
        buttonsEspecialidades.setBounds(350, 90, 90, 50);

        buttonPlanoDeSaude.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/farmacia.png"))); // NOI18N
        buttonPlanoDeSaude.setToolTipText("Botão para ver os planos de saúde");
        buttonPlanoDeSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanoDeSaudeActionPerformed(evt);
            }
        });
        getContentPane().add(buttonPlanoDeSaude);
        buttonPlanoDeSaude.setBounds(450, 90, 80, 50);

        buttonSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/logout.png"))); // NOI18N
        buttonSair.setToolTipText("Sair do programa");
        buttonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSairActionPerformed(evt);
            }
        });
        getContentPane().add(buttonSair);
        buttonSair.setBounds(760, 90, 50, 50);

        panelHome.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelHome.setLayout(null);

        labelTituloPanel.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        labelTituloPanel.setText("HYPEReps");
        panelHome.add(labelTituloPanel);
        labelTituloPanel.setBounds(20, 0, 170, 35);

        labelSubtitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labelSubtitulo.setText("Sistema de Agendamento de Consultas");
        panelHome.add(labelSubtitulo);
        labelSubtitulo.setBounds(20, 40, 370, 22);

        labelDadosDeContato.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        labelDadosDeContato.setText("Dados de Contato:");
        panelHome.add(labelDadosDeContato);
        labelDadosDeContato.setBounds(30, 150, 130, 17);

        labelEmail.setText("E-mail: hypereps@gmail.com");
        panelHome.add(labelEmail);
        labelEmail.setBounds(30, 170, 200, 16);

        labelNumero.setText("Número: 11 93045-1122");
        panelHome.add(labelNumero);
        labelNumero.setBounds(30, 190, 160, 16);

        labelSite.setText("Site: www.hypereps.com.br");
        panelHome.add(labelSite);
        labelSite.setBounds(30, 210, 180, 16);

        panelDivisoria.setBackground(new java.awt.Color(255, 0, 51));
        panelDivisoria.setForeground(new java.awt.Color(255, 51, 51));
        panelDivisoria.setPreferredSize(new java.awt.Dimension(100, 2));
        panelDivisoria.setLayout(null);
        panelHome.add(panelDivisoria);
        panelDivisoria.setBounds(20, 62, 680, 2);

        getContentPane().add(panelHome);
        panelHome.setBounds(30, 190, 790, 230);

        buttonAgenda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/agenda_1.png"))); // NOI18N
        buttonAgenda1.setToolTipText("Botão agenda");
        buttonAgenda1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgenda1ActionPerformed(evt);
            }
        });
        getContentPane().add(buttonAgenda1);
        buttonAgenda1.setBounds(40, 90, 90, 50);

        setSize(new java.awt.Dimension(862, 500));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHomeActionPerformed
        panelHome.setVisible(true);
        panelEspecialidades.setVisible(false);
        panelPlanoDeSaude.setVisible(false);
        panelMedicos.setVisible(false);

    }//GEN-LAST:event_buttonHomeActionPerformed

    private void buttonsEspecialidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonsEspecialidadesActionPerformed

        panelEspecialidades.setVisible(true);
        panelHome.setVisible(false);
        panelPlanoDeSaude.setVisible(false);
        panelMedicos.setVisible(false);

    }//GEN-LAST:event_buttonsEspecialidadesActionPerformed

    private void buttonAgenda1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgenda1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonAgenda1ActionPerformed

    private void buttonMedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosActionPerformed
        panelMedicos.setVisible(true);
        panelHome.setVisible(false);
        panelPlanoDeSaude.setVisible(false);
        panelEspecialidades.setVisible(false);
    }//GEN-LAST:event_buttonMedicosActionPerformed

    private void buttonPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPacientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonPacientesActionPerformed

    private void buttonPlanoDeSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanoDeSaudeActionPerformed
        panelPlanoDeSaude.setVisible(true);
        panelHome.setVisible(false);
        panelEspecialidades.setVisible(false);
        panelMedicos.setVisible(false);
    }//GEN-LAST:event_buttonPlanoDeSaudeActionPerformed

    private void buttonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSairActionPerformed
        dispose();
    }//GEN-LAST:event_buttonSairActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAgenda1;
    private javax.swing.JButton buttonHome;
    private javax.swing.JButton buttonMedicos;
    private javax.swing.JButton buttonPacientes;
    private javax.swing.JButton buttonPlanoDeSaude;
    private javax.swing.JButton buttonSair;
    private javax.swing.JButton buttonsEspecialidades;
    private javax.swing.JLabel iconAgenda;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDadosDeContato;
    private javax.swing.JLabel labelEmail;
    private javax.swing.JLabel labelNumero;
    private javax.swing.JLabel labelSite;
    private javax.swing.JLabel labelSubtitulo;
    private javax.swing.JLabel labelTitulo;
    private javax.swing.JLabel labelTituloPanel;
    private javax.swing.JPanel panelDivisoria;
    private javax.swing.JPanel panelHome;
    // End of variables declaration//GEN-END:variables

    private void initPanels() {

        panelEspecialidades = new PanelEspecialidades();
        panelEspecialidades.setBounds(
                POS_X,
                POS_Y,
                LARGURA,
                ALTURA);
        getContentPane().add(panelEspecialidades);
        panelEspecialidades.setVisible(false);

        panelPlanoDeSaude = new PanelPlanoDeSaude();
        panelPlanoDeSaude.setBounds(
                POS_X,
                POS_Y,
                LARGURA,
                ALTURA);
        getContentPane().add(panelPlanoDeSaude);
        panelPlanoDeSaude.setVisible(false);

        panelMedicos = new PanelMedicos();
        panelMedicos.setBounds(POS_X, POS_Y, LARGURA, ALTURA);
        getContentPane().add(panelMedicos);
        panelMedicos.setVisible(false);

    }

}
