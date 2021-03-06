/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import dao.EscolaDao;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.*;
import javax.swing.table.DefaultTableModel;
import modelo.Escola;

/**
 *
 * @author João Marcos
 */
public class JanelaEscola extends javax.swing.JInternalFrame {

    /**
     * Creates new form JanelaEscola
     */
    public JanelaEscola() {
        initComponents();
        
        limparDesabilitarCampos(); //inicializa a tela com os campos vazios e desabilitados
        atualizaTabela(new EscolaDao()); //
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelJanelaEscola = new javax.swing.JPanel();
        lblNome = new javax.swing.JLabel();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();
        btnRemover = new javax.swing.JButton();
        lblDiretor = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        painelCampos = new javax.swing.JPanel();
        txtRua = new javax.swing.JTextField();
        lblRua = new javax.swing.JLabel();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        lblCEP = new javax.swing.JLabel();
        txtCEP = new javax.swing.JTextField();
        lblBairro = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        lblTelefone = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JTextField();
        txtDiretor = new javax.swing.JTextField();
        btnSalvar = new javax.swing.JButton();
        painelTabela = new javax.swing.JScrollPane();
        tabelaEscola = new javax.swing.JTable();
        txtIdEscola = new javax.swing.JTextField();

        setClosable(true);
        setTitle("Escolas");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        lblNome.setText("Nome:");

        btnNovo.setText("Novo");
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnRemover.setText("Remover");
        btnRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoverActionPerformed(evt);
            }
        });

        lblDiretor.setText("Diretor(a):");

        painelCampos.setBorder(javax.swing.BorderFactory.createTitledBorder("Endereço"));

        lblRua.setText("Rua:");

        lblNumero.setText("Numero:");

        lblCEP.setText("CEP:");

        lblBairro.setText("Bairro:");

        lblTelefone.setText("Telefone:");

        javax.swing.GroupLayout painelCamposLayout = new javax.swing.GroupLayout(painelCampos);
        painelCampos.setLayout(painelCamposLayout);
        painelCamposLayout.setHorizontalGroup(
            painelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCamposLayout.createSequentialGroup()
                        .addGroup(painelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(painelCamposLayout.createSequentialGroup()
                                .addComponent(lblNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNumero))
                            .addGroup(painelCamposLayout.createSequentialGroup()
                                .addComponent(lblCEP)
                                .addGap(28, 28, 28)
                                .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(painelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblTelefone)
                            .addComponent(lblBairro))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(painelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelCamposLayout.createSequentialGroup()
                                .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 104, Short.MAX_VALUE))
                            .addComponent(txtBairro)))
                    .addGroup(painelCamposLayout.createSequentialGroup()
                        .addComponent(lblRua)
                        .addGap(28, 28, 28)
                        .addComponent(txtRua)))
                .addContainerGap())
        );
        painelCamposLayout.setVerticalGroup(
            painelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCamposLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(painelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRua))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblBairro)
                        .addComponent(txtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(painelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblNumero)
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(painelCamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCEP)
                    .addComponent(txtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefone)
                    .addComponent(txtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        tabelaEscola.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Diretor", "Rua", "Número", "Bairro", "CEP", "Telefone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        painelTabela.setViewportView(tabelaEscola);

        txtIdEscola.setText("0");
        txtIdEscola.setEnabled(false);

        javax.swing.GroupLayout painelJanelaEscolaLayout = new javax.swing.GroupLayout(painelJanelaEscola);
        painelJanelaEscola.setLayout(painelJanelaEscolaLayout);
        painelJanelaEscolaLayout.setHorizontalGroup(
            painelJanelaEscolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelJanelaEscolaLayout.createSequentialGroup()
                .addGroup(painelJanelaEscolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelJanelaEscolaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnNovo)
                        .addGap(13, 13, 13)
                        .addComponent(btnEditar)
                        .addGap(9, 9, 9)
                        .addComponent(btnRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(painelJanelaEscolaLayout.createSequentialGroup()
                        .addGroup(painelJanelaEscolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(painelJanelaEscolaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnSalvar))
                            .addGroup(painelJanelaEscolaLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(painelJanelaEscolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(painelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(painelJanelaEscolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtIdEscola, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(painelJanelaEscolaLayout.createSequentialGroup()
                                            .addGroup(painelJanelaEscolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(lblDiretor)
                                                .addComponent(lblNome))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(painelJanelaEscolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtDiretor, javax.swing.GroupLayout.DEFAULT_SIZE, 356, Short.MAX_VALUE)
                                                .addComponent(txtNome)))))))
                        .addGap(18, 18, 18)
                        .addComponent(painelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelJanelaEscolaLayout.setVerticalGroup(
            painelJanelaEscolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelJanelaEscolaLayout.createSequentialGroup()
                .addGroup(painelJanelaEscolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelJanelaEscolaLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(painelJanelaEscolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNovo)
                            .addComponent(btnEditar)
                            .addComponent(btnRemover))
                        .addGap(10, 10, 10))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelJanelaEscolaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtIdEscola, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(painelJanelaEscolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelJanelaEscolaLayout.createSequentialGroup()
                        .addGroup(painelJanelaEscolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNome)
                            .addComponent(txtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(painelJanelaEscolaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDiretor)
                            .addComponent(txtDiretor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(painelCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnSalvar))
                    .addComponent(painelTabela, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelJanelaEscola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelJanelaEscola, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        //Anula a janelaEscola
        JanelaPrincipal.jEscola = null;
        this.dispose();
    }//GEN-LAST:event_formInternalFrameClosing

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        //Habilita todos os campos de texto
        this.txtNome.setEnabled(true);
        this.txtDiretor.setEnabled(true);
        this.txtRua.setEnabled(true);
        this.txtNumero.setEnabled(true);
        this.txtCEP.setEnabled(true);
        this.txtBairro.setEnabled(true);
        this.txtTelefone.setEnabled(true);
        this.btnSalvar.setEnabled(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        try
        {
            //instancia um objeto escola
            Escola escola = new Escola();
            
            //faz a atribuição dos campos da tela para o objeto
            escola.setIdEscola(Integer.parseInt(txtIdEscola.getText()));
            escola.setNome(txtNome.getText());
            escola.setDiretor(txtDiretor.getText());
            escola.setRua(txtRua.getText());
            escola.setNumero(Integer.parseInt(txtNumero.getText()));
            escola.setCEP(txtCEP.getText());
            escola.setBairro(txtBairro.getText());
            escola.setTelefone(txtTelefone.getText());

            //instancia um objeto EscolaDao que será usado para comunicar com o banco
            EscolaDao escolaDao = new EscolaDao();
            
            //se o campo do IdEscola da tela for 0, significa que está criando um novo registro
            //se não, significa que está alterando um novo registro
            if(escola.getIdEscola() == 0)
            {
                //envia o objeto escola para o método inserir, onde será feito a inserção no banco
                escolaDao.inserir(escola);
                JOptionPane.showMessageDialog(null, "Escola salva com sucesso!", "", INFORMATION_MESSAGE);
            }
            else
            {
                //envia o objeto escola para o método alterar, onde será feito a alteração no banco
                escolaDao.alterar(escola);
                JOptionPane.showMessageDialog(null, "Escola alterada com sucesso!", "", INFORMATION_MESSAGE);
            }
            
            limparDesabilitarCampos(); //chama método para voltar os campos para não edição
            btnSalvar.setEnabled(false); //desabilita o botão Salvar
            
            atualizaTabela(escolaDao); //atualiza todos os dados da tabela novamente
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoverActionPerformed
        
        try
        {
            int linhaSelecionada = tabelaEscola.getSelectedRow(); //resgata o número da linha selecionada na tabela

            if(linhaSelecionada == -1)
            {
                JOptionPane.showMessageDialog(null, "Selecione uma Escola para remoção!", "ATENÇÃO!", WARNING_MESSAGE);
            }
            else
            {
                //resgata o conteúdo da primeira coluna da linha selecioanda
                this.txtIdEscola.setText(tabelaEscola.getValueAt(linhaSelecionada, 0).toString());
                
                //pergunda de confirmação antes de excluir o registro
                int opcao = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover?");
                
                //se for igual a 0 siginifica que clicou em SIM
                if(opcao == 0)
                {
                    EscolaDao escolaDao = new EscolaDao(); 
                    //chama o metodo excuirID passando o identificador do registro selecionado anteriormente
                    escolaDao.excluirID(Integer.parseInt(this.txtIdEscola.getText()));

                    atualizaTabela(escolaDao);
                }
             }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnRemoverActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        int linhaSelecionada = tabelaEscola.getSelectedRow(); //resgata o número da linha selecionada na tabela
        
        if(linhaSelecionada == -1)
        {
            JOptionPane.showMessageDialog(null, "Selecione uma Escola para edição!", "ATENÇÃO!", WARNING_MESSAGE);
        }
        else
        {
            //colocando nos campos textos todos os dados da linha selecionada na tabela, para que possa ser editado
            this.txtIdEscola.setText(tabelaEscola.getValueAt(linhaSelecionada, 0).toString());
            this.txtNome.setText(tabelaEscola.getValueAt(linhaSelecionada, 1).toString());
            this.txtDiretor.setText(tabelaEscola.getValueAt(linhaSelecionada, 2).toString());
            this.txtRua.setText(tabelaEscola.getValueAt(linhaSelecionada, 3).toString());
            this.txtNumero.setText(tabelaEscola.getValueAt(linhaSelecionada, 4).toString());
            this.txtBairro.setText(tabelaEscola.getValueAt(linhaSelecionada, 5).toString());
            this.txtCEP.setText(tabelaEscola.getValueAt(linhaSelecionada, 6).toString());
            this.txtTelefone.setText(tabelaEscola.getValueAt(linhaSelecionada, 7).toString());
            
            habilitarCampos(); //habilita os campos para edição
            btnSalvar.setEnabled(true); //habilita o botão salvar
        }
    }//GEN-LAST:event_btnEditarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnRemover;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel lblBairro;
    private javax.swing.JLabel lblCEP;
    private javax.swing.JLabel lblDiretor;
    private javax.swing.JLabel lblNome;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblRua;
    private javax.swing.JLabel lblTelefone;
    private javax.swing.JPanel painelCampos;
    private javax.swing.JPanel painelJanelaEscola;
    private javax.swing.JScrollPane painelTabela;
    private javax.swing.JTable tabelaEscola;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCEP;
    private javax.swing.JTextField txtDiretor;
    private javax.swing.JTextField txtIdEscola;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtTelefone;
    // End of variables declaration//GEN-END:variables

    /**
     * Método para reescrever todas as linhas da tabela
     * @param escolaDao 
     */
    private void atualizaTabela(EscolaDao escolaDao)
    {
        try
        {
            
            this.txtIdEscola.setText("0");
            limparTabela();
            
            ArrayList<Escola> listaEscolas;
            listaEscolas = escolaDao.consultar(); //consulta todos os registros da tabela Escola
            
            //Resgata o modelo da tabela            
            DefaultTableModel modeloTabela = (DefaultTableModel) tabelaEscola.getModel();

            for(Escola escola : listaEscolas)
            {
                //adiciona em cada linha da tabela da tela o conteúdo de cada posição da listaEscolas
                modeloTabela.addRow(new String[]{Integer.toString(escola.getIdEscola()), escola.getNome(), escola.getDiretor(), escola.getRua(),
                Integer.toString(escola.getNumero()), escola.getBairro(), escola.getCEP(), escola.getTelefone()});
            }
            
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inesperado:\n" + ex.getMessage(), "ERRO!", ERROR_MESSAGE);
        }
    }
    
    /**
     * Méotodo para limpar o conteúdo dos campos textos e desabilitar para edição
     */
    private void limparDesabilitarCampos()
    {
        //limpando todos os campos textos
        this.txtIdEscola.setText("0");
        this.txtNome.setText("");
        this.txtDiretor.setText("");
        this.txtRua.setText("");
        this.txtNumero.setText("");
        this.txtCEP.setText("");
        this.txtBairro.setText("");
        this.txtTelefone.setText("");
        
        //desabilitando para edição os campos textos
        this.txtNome.setEnabled(false);
        this.txtDiretor.setEnabled(false);
        this.txtRua.setEnabled(false);
        this.txtNumero.setEnabled(false);
        this.txtCEP.setEnabled(false);
        this.txtBairro.setEnabled(false);
        this.txtTelefone.setEnabled(false);
    }
    
    /**
     * Método para habilitar para edição os campos textos
     */
    private void habilitarCampos()
    {
        //habilitando para edição os campos textos
        this.txtNome.setEnabled(true);
        this.txtDiretor.setEnabled(true);
        this.txtRua.setEnabled(true);
        this.txtNumero.setEnabled(true);
        this.txtCEP.setEnabled(true);
        this.txtBairro.setEnabled(true);
        this.txtTelefone.setEnabled(true);
    }
    
    /**
     * Método para percorrer cada linha da tabela e realizar a exclusão
     */
    private void limparTabela()
    {
        //percorre a tabela e exclui todas as linhas
        while(tabelaEscola.getRowCount() > 0) 
        {
            DefaultTableModel dm = (DefaultTableModel) tabelaEscola.getModel();
            dm.getDataVector().removeAllElements();
        }
    }
            
}
