package projetofinalsenai.views;

import javax.swing.ImageIcon;
import java.sql.*;
import javax.swing.JOptionPane;
import projetosenai.dao.ConnectionFactory;

public class CadastroChamados extends javax.swing.JInternalFrame {

    
    public CadastroChamados() {
        initComponents();
        carregaImagem();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textCPF = new javax.swing.JTextField();
        textNome = new javax.swing.JTextField();
        textMatricula = new javax.swing.JTextField();
        textSetor = new javax.swing.JTextField();
        textRamal = new javax.swing.JTextField();
        textEmail = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        textLocalChamado = new javax.swing.JTextField();
        textEquipamento = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        textDescricao = new javax.swing.JTextArea();
        statusAberto = new javax.swing.JRadioButton();
        statusAtendimento = new javax.swing.JRadioButton();
        statusEncerrado = new javax.swing.JRadioButton();
        btnSalvar = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 153, 255));
        setBorder(null);
        setClosable(true);
        setMaximizable(true);
        setAutoscrolls(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setName("Cadastro de chamados"); // NOI18N

        jLabel1.setText("Nome:");

        jLabel2.setText("CPF:");

        jLabel3.setText("Matricula");

        jLabel4.setText("Setor:");

        jLabel5.setText("Ramal:");

        jLabel6.setText("E-mail:");

        jLabel7.setText("Local do incidente:");

        jLabel8.setText("Equipamento:");

        jLabel9.setText("Descrição:");

        jLabel10.setText("Status:");

        textNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textNomeActionPerformed(evt);
            }
        });

        textSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSetorActionPerformed(evt);
            }
        });

        textEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEmailActionPerformed(evt);
            }
        });

        jLabel11.setText("Chamado");

        textDescricao.setColumns(20);
        textDescricao.setRows(5);
        jScrollPane1.setViewportView(textDescricao);

        statusAberto.setText("Aberto");
        statusAberto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statusAbertoActionPerformed(evt);
            }
        });

        statusAtendimento.setText("Em atendimento");

        statusEncerrado.setText("Encerrado");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jButton3.setText("Editar");

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(statusAberto)
                                .addGap(29, 29, 29)
                                .addComponent(statusAtendimento)
                                .addGap(18, 18, 18)
                                .addComponent(statusEncerrado))
                            .addComponent(jLabel10)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textLocalChamado)
                                    .addComponent(textEquipamento, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textSetor, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, 666, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(20, 20, 20)
                                .addComponent(textRamal, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9))
                        .addGap(0, 27, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(278, 278, 278)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(textCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(textNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(textMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(textSetor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(textRamal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(textEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addGap(14, 14, 14)
                        .addComponent(jLabel7))
                    .addComponent(textLocalChamado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(textEquipamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(statusAberto)
                    .addComponent(statusAtendimento)
                    .addComponent(statusEncerrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalvar)
                    .addComponent(jButton3))
                .addGap(53, 53, 53))
        );

        setBounds(50, 50, 780, 583);
    }// </editor-fold>//GEN-END:initComponents

    private void textNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textNomeActionPerformed

    private void statusAbertoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statusAbertoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statusAbertoActionPerformed

    private void textSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSetorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSetorActionPerformed

    private void textEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEmailActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        cadastraChamado();
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        consultaCPF();
    }//GEN-LAST:event_btnPesquisarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton statusAberto;
    private javax.swing.JRadioButton statusAtendimento;
    private javax.swing.JRadioButton statusEncerrado;
    private javax.swing.JTextField textCPF;
    private javax.swing.JTextArea textDescricao;
    private javax.swing.JTextField textEmail;
    private javax.swing.JTextField textEquipamento;
    private javax.swing.JTextField textLocalChamado;
    private javax.swing.JTextField textMatricula;
    private javax.swing.JTextField textNome;
    private javax.swing.JTextField textRamal;
    private javax.swing.JTextField textSetor;
    // End of variables declaration//GEN-END:variables
    
    private void carregaImagem(){
        String salvar = "src/imagens/disquete.png";
        
        try{
        ImageIcon iconSalvar = new ImageIcon(salvar);       
        
        iconSalvar.setImage(iconSalvar.getImage().getScaledInstance(20,20, 1));
              
        btnSalvar.setIcon(iconSalvar);
                

        }catch(Exception e){
            System.out.println(e);
        }
    }
    
    private void cadastraChamado(){
        String sql = "insert into solicitantes(nome, cpf, matricula, setor, ramal, email) values(?,?,?,?,?,?)";
        try{
        
            Connection conn = ConnectionFactory.conexao();
            PreparedStatement ps = ps = conn.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = null;
            
            ps.setString(1,textNome.getText());
            ps.setString(2,textCPF.getText());
            ps.setString(3,textMatricula.getText());
            ps.setString(4,textSetor.getText());
            ps.setInt(5,Integer.parseInt(textRamal.getText()));
            ps.setString(6,textEmail.getText());
            
            int resultado = ps.executeUpdate();
            rs = ps.getGeneratedKeys();
            //int protocolo = rs.getInt(1);
            
            int protocolo = 0;
            //ps.close();
            //conn.close();
            if(resultado==1){
                textNome.setText(null);
                textCPF.setText(null);
                textMatricula.setText(null);
                textSetor.setText(null);
                textRamal.setText(null);
                textEmail.setText(null);
                
                cadastraSolicitacao();
                
            }else
                JOptionPane.showMessageDialog(null,"Usuário não cadastrado");
            
            if(rs.next())
                protocolo = rs.getInt(1);
                JOptionPane.showMessageDialog(null,"Usuário cadastrado - Nº Chamado: "+ protocolo,"ERRO",JOptionPane.ERROR_MESSAGE);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void cadastraSolicitacao(){
        String sql = "insert into chamados(localChamado, descricao, statusChamado, equipamento) values(?,?,?,?)";
        try{
            Connection conn = ConnectionFactory.conexao();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,textLocalChamado.getText());
            ps.setString(2, textDescricao.getText());
            ps.setString(3,statusAberto.getText());
            ps.setString(4,textEquipamento.getText());
            int resultado = ps.executeUpdate();
            ps.close();
            conn.close();
            if(resultado == 1){
                textLocalChamado.setText(null);
                textDescricao.setText(null);
                statusAberto.setText(null);
                textEquipamento.setText(null);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }

    private void consultaCPF(){
        String sql = "select * from solicitantes where cpf=?";
        try{
            Connection conn = ConnectionFactory.conexao();
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,textCPF.getText());
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                textNome.setText(rs.getString("nome"));
                textCPF.setText(rs.getString("cpf"));
                textMatricula.setText(rs.getString("matricula"));
                textSetor.setText(rs.getString("setor"));
                textRamal.setText(rs.getString("ramal"));
                textEmail.setText(rs.getString("email"));
            }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Usuário não cadastradro "+ e,"ERRO", JOptionPane.ERROR_MESSAGE);
            }
        }
    }


