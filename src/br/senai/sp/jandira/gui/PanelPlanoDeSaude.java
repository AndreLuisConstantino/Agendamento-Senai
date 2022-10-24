package br.senai.sp.jandira.gui;

import br.senai.sp.jandira.dao.EspecialidadeDAO;
import br.senai.sp.jandira.dao.PlanoDeSaudeDao;
import br.senai.sp.jandira.model.Especialidade;
import br.senai.sp.jandira.model.OperacaoEnum;
import br.senai.sp.jandira.model.PlanoDeSaude;
import javax.swing.JOptionPane;
import javax.swing.JTable;

public class PanelPlanoDeSaude extends javax.swing.JPanel {

    private int linha;

    public PanelPlanoDeSaude() {
        initComponents();
        PlanoDeSaudeDao.criarListaDePlanos();
        preencherTabela();
    }

    private int getLinha() {
        linha = tablePlanos.getSelectedRow();
        return linha;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scrollPlanosDeSaude = new javax.swing.JScrollPane();
        tablePlanos = new javax.swing.JTable();
        buttonPlanosNovo = new javax.swing.JButton();
        buttonPlanosEditar = new javax.swing.JButton();
        buttonPlanosExcluir = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Lista de Planos:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 0, 14), new java.awt.Color(255, 0, 0))); // NOI18N
        setPreferredSize(new java.awt.Dimension(790, 230));
        setVerifyInputWhenFocusTarget(false);
        setLayout(null);

        scrollPlanosDeSaude.setMinimumSize(new java.awt.Dimension(60, 80));
        scrollPlanosDeSaude.setPreferredSize(new java.awt.Dimension(300, 80));

        tablePlanos.setModel(new javax.swing.table.DefaultTableModel(
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
        scrollPlanosDeSaude.setViewportView(tablePlanos);

        add(scrollPlanosDeSaude);
        scrollPlanosDeSaude.setBounds(30, 30, 720, 120);

        buttonPlanosNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/mais (1).png"))); // NOI18N
        buttonPlanosNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanosNovoActionPerformed(evt);
            }
        });
        add(buttonPlanosNovo);
        buttonPlanosNovo.setBounds(730, 180, 50, 40);

        buttonPlanosEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/ferramenta-lapis.png"))); // NOI18N
        buttonPlanosEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonPlanosEditarActionPerformed(evt);
            }
        });
        add(buttonPlanosEditar);
        buttonPlanosEditar.setBounds(670, 180, 50, 40);

        buttonPlanosExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/senai/sp/jandira/imagens/cancelar (1).png"))); // NOI18N
        add(buttonPlanosExcluir);
        buttonPlanosExcluir.setBounds(610, 180, 50, 40);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonPlanosNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanosNovoActionPerformed
        PlanoDeSaudeDialog planoDeSaudeDialog = new PlanoDeSaudeDialog(null, true, OperacaoEnum.ADICIONAR);
        planoDeSaudeDialog.setVisible(true);
        preencherTabela();
    }//GEN-LAST:event_buttonPlanosNovoActionPerformed

    private void buttonPlanosEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonPlanosEditarActionPerformed

        if (getLinha() != -1) {
            editarPlano();
        } else {
            JOptionPane.showConfirmDialog(this,
                    "Por favor, selecione a especialidade que você deseja editar",
                    "Especialidades",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_buttonPlanosEditarActionPerformed

    private void editarPlano() {
        PlanoDeSaude plano = PlanoDeSaudeDao.getPlano(getCodigo());

        PlanoDeSaudeDialog planoDialog = new PlanoDeSaudeDialog(null,
                true,
                plano, 
                OperacaoEnum.EDITAR);

        planoDialog.setVisible(true);
        preencherTabela();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonPlanosEditar;
    private javax.swing.JButton buttonPlanosExcluir;
    private javax.swing.JButton buttonPlanosNovo;
    private javax.swing.JScrollPane scrollPlanosDeSaude;
    private javax.swing.JTable tablePlanos;
    // End of variables declaration//GEN-END:variables

    private void preencherTabela() {

        tablePlanos.setModel(PlanoDeSaudeDao.getTabelaPlanos());
        ajustarTabela();

    }

    private void ajustarTabela() {

        //Impedir que o user mecha nas colunas
        tablePlanos.getTableHeader().setReorderingAllowed(false);

        //bloqueiar a edição de células da tabela
        tablePlanos.setDefaultEditor(Object.class, null);

        //definir a largura das colunas
        tablePlanos.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tablePlanos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablePlanos.getColumnModel().getColumn(1).setPreferredWidth(154);
        tablePlanos.getColumnModel().getColumn(2).setPreferredWidth(154);
        tablePlanos.getColumnModel().getColumn(3).setPreferredWidth(154);
        tablePlanos.getColumnModel().getColumn(4).setPreferredWidth(154);

    }

    private Integer getCodigo() {
        String codigoStr = tablePlanos.getValueAt(getLinha(), 0).toString();
        
        Integer codigo = Integer.valueOf(codigoStr);
        return codigo;

    }

}
