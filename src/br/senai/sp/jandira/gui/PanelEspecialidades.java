/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 22282216
 */
public class PanelEspecialidades extends javax.swing.JPanel {

    private int linha;

    public PanelEspecialidades() {
        initComponents();
        EspecialidadeDAO.criarListaDeEspecialidade();
        preencherTabela();

    }

    private int getLinha() {
        linha = tableEspecialidades.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollEspecialidades = new javax.swing.JScrollPane();
        tableEspecialidades = new javax.swing.JTable();
        buttonEspecialidadesExluir = new javax.swing.JButton();
        buttonEspecialidadesEditar = new javax.swing.JButton();
        buttonEspecialidadesNovo = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Especialidades médicas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        setPreferredSize(new java.awt.Dimension(790, 230));
        setLayout(null);

        tableEspecialidades.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollEspecialidades.setViewportView(tableEspecialidades);

        add(scrollEspecialidades);
        scrollEspecialidades.setBounds(30, 30, 720, 120);

        buttonEspecialidadesExluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar (1).png"))); // NOI18N
        buttonEspecialidadesExluir.setToolTipText("Excluir um agendamento");
        buttonEspecialidadesExluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesExluirActionPerformed(evt);
            }
        });
        add(buttonEspecialidadesExluir);
        buttonEspecialidadesExluir.setBounds(610, 180, 50, 40);

        buttonEspecialidadesEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/ferramenta-lapis.png"))); // NOI18N
        buttonEspecialidadesEditar.setToolTipText("Editar uma especialidade");
        buttonEspecialidadesEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesEditarActionPerformed(evt);
            }
        });
        add(buttonEspecialidadesEditar);
        buttonEspecialidadesEditar.setBounds(670, 180, 50, 40);

        buttonEspecialidadesNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais (1).png"))); // NOI18N
        buttonEspecialidadesNovo.setToolTipText("adicionar uma especialidades");
        buttonEspecialidadesNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEspecialidadesNovoActionPerformed(evt);
            }
        });
        add(buttonEspecialidadesNovo);
        buttonEspecialidadesNovo.setBounds(730, 180, 50, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonEspecialidadesEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesEditarActionPerformed

        if (getLinha() != -1) {
            editarEspecialidade();
        } else {
            JOptionPane.showMessageDialog(this, 
                    "Selecione a especialidade que deseja editar!", 
                    "EDITAR", 
                    JOptionPane.INFORMATION_MESSAGE);
        }


    }//GEN-LAST:event_buttonEspecialidadesEditarActionPerformed

    private void editarEspecialidade() {

        Especialidade especialidade = EspecialidadeDAO.getEspecialidade(getCodigo());
        
        
        EspecialidadesDialog especialidadeDialog = new EspecialidadesDialog(null, 
                true, 
                especialidade, OperacaoEnum.EDITAR);
        
        especialidadeDialog.setVisible(true);
        preencherTabela();

    }


    private void buttonEspecialidadesNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesNovoActionPerformed
        EspecialidadesDialog especialidadeDialog =
                new EspecialidadesDialog(null, true, OperacaoEnum.ADICIONAR);
        especialidadeDialog.setVisible(true);
        preencherTabela();

    }//GEN-LAST:event_buttonEspecialidadesNovoActionPerformed

    private void buttonEspecialidadesExluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEspecialidadesExluirActionPerformed

        if (getLinha() != -1) {
            excluirEspecialidade();
        } else {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione a especialidade que você deseja excluir",
                    "Atenção", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_buttonEspecialidadesExluirActionPerformed

    private void excluirEspecialidade() {

        int resposta = JOptionPane.showConfirmDialog(this,
                "Você confirma a exclusão?",
                "Atenção",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resposta == 0) {
            EspecialidadeDAO.excluir(getCodigo());
            preencherTabela();
        }

    }

    private Integer getCodigo() {
        
        String codigoStr = tableEspecialidades.getValueAt(getLinha(), 0).toString();
        
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;
    }
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonEspecialidadesEditar;
    private javax.swing.JButton buttonEspecialidadesExluir;
    private javax.swing.JButton buttonEspecialidadesNovo;
    private javax.swing.JScrollPane scrollEspecialidades;
    private javax.swing.JTable tableEspecialidades;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        tableEspecialidades.setModel(EspecialidadeDAO.getTabelaEspecialidades());
        ajustarTabela();

    }

    private void ajustarTabela() {

        //Impedir que o user mecha nas colunas
        tableEspecialidades.getTableHeader().setReorderingAllowed(false);

        //bloqueiar a edição de células da tabela
        tableEspecialidades.setDefaultEditor(Object.class, null);

        //definir a largura das colunas
        tableEspecialidades.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableEspecialidades.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableEspecialidades.getColumnModel().getColumn(1).setPreferredWidth(300);
        tableEspecialidades.getColumnModel().getColumn(2).setPreferredWidth(310);

    }

}
