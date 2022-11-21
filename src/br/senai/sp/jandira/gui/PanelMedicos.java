/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.MedicoDao;
import br.senai.sp.jandira.dao.PlanoDeSaudeDao;
import br.senai.sp.jandira.model.Medico;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author 22282216
 */
public class PanelMedicos extends javax.swing.JPanel {

    private int linha;

    public PanelMedicos() {
        initComponents();
        preencherTabela();
        ajustarTabela();
    }

    private int getLinha() {
        linha = tableMedicos.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollMedicos = new javax.swing.JScrollPane();
        tableMedicos = new javax.swing.JTable();
        buttonMedicosNovo = new javax.swing.JButton();
        buttonMedicosExcuir = new javax.swing.JButton();
        buttonMedicosEditar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Médicos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        setPreferredSize(new java.awt.Dimension(720, 230));
        setLayout(null);

        scrollMedicos.setPreferredSize(new java.awt.Dimension(400, 800));

        tableMedicos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        scrollMedicos.setViewportView(tableMedicos);

        add(scrollMedicos);
        scrollMedicos.setBounds(30, 30, 720, 120);

        buttonMedicosNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais (1).png"))); // NOI18N
        buttonMedicosNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosNovoActionPerformed(evt);
            }
        });
        add(buttonMedicosNovo);
        buttonMedicosNovo.setBounds(730, 180, 50, 40);

        buttonMedicosExcuir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar (1).png"))); // NOI18N
        add(buttonMedicosExcuir);
        buttonMedicosExcuir.setBounds(610, 180, 50, 40);

        buttonMedicosEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/ferramenta-lapis.png"))); // NOI18N
        buttonMedicosEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMedicosEditarActionPerformed(evt);
            }
        });
        add(buttonMedicosEditar);
        buttonMedicosEditar.setBounds(670, 180, 50, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonMedicosNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosNovoActionPerformed

        MedicosDialog medicoDialog = new MedicosDialog(null, true, OperacaoEnum.ADICIONAR);
        medicoDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonMedicosNovoActionPerformed

    private void buttonMedicosEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMedicosEditarActionPerformed
        
        if (getLinha() != -1) {
            editarMedico();
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Selecione o plano que deseja editar!", 
                    "EDITAR", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
        

    }//GEN-LAST:event_buttonMedicosEditarActionPerformed

    private void editarMedico() {
        Medico medico = MedicoDao.getMedico(getCodigo());
        
        MedicosDialog medicoDialog = new MedicosDialog(null, 
                true, 
                medico, 
                OperacaoEnum.EDITAR);
        
        medicoDialog.setVisible(true);
        preencherTabela();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonMedicosEditar;
    private javax.swing.JButton buttonMedicosExcuir;
    private javax.swing.JButton buttonMedicosNovo;
    private javax.swing.JScrollPane scrollMedicos;
    private javax.swing.JTable tableMedicos;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        tableMedicos.setModel(MedicoDao.getTabelaMedicos());
        ajustarTabela();

    }

    private void ajustarTabela() {

        //Impedir que o user mecha nas colunas
        tableMedicos.getTableHeader().setReorderingAllowed(false);

        //bloqueiar a edição de células da tabela
        tableMedicos.setDefaultEditor(Object.class, null);

        //definir a largura das colunas
        tableMedicos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableMedicos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableMedicos.getColumnModel().getColumn(1).setPreferredWidth(203);
        tableMedicos.getColumnModel().getColumn(2).setPreferredWidth(203);
        tableMedicos.getColumnModel().getColumn(3).setPreferredWidth(203);

    }

    private Integer getCodigo() {
        String codigoStr = tableMedicos.getValueAt(getLinha(), 0).toString();
        
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;

    }
    
}
