package projetosenai.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JOptionPane;

    
public class ChamadoDao{
    
    Connection conn = ConnectionFactory.conexao();
    
    public void cadastrarChamado(javax.swing.JTextField textNome,javax.swing.JTextField textCPF, javax.swing.JTextField textMatricula, javax.swing.JTextField textSetor,
            javax.swing.JTextField textRamal, javax.swing.JTextField textEmail, javax.swing.JTextField textLocalChamado, javax.swing.JTextField textEquipamento,
            javax.swing.JTextArea textDescricao, javax.swing.JComboBox<String> textPrioridade) {
        
        String funcionarios = "insert into funcionarios( nome, cpf, matricula,setor, ramal, email) values(?,?,?,?,?,?);";
        String chamados = "insert into chamados(local_chamado, equipamento, descricao, prioridade, funcionarios_id) values (?,?,?,?,last_insert_id())";       
    
    try{
        
            
            PreparedStatement psFuncionarios = conn.prepareStatement(funcionarios);
            PreparedStatement psChamados = conn.prepareStatement(chamados, Statement.RETURN_GENERATED_KEYS);
          
                               
                conn.setAutoCommit(false);
                
                psFuncionarios.setString(1,textNome.getText());
                psFuncionarios.setString(2,textCPF.getText());
                psFuncionarios.setString(3,textMatricula.getText());
                psFuncionarios.setString(4,textSetor.getText());
                psFuncionarios.setInt(5,Integer.parseInt(textRamal.getText()));
                psFuncionarios.setString(6,textEmail.getText());

                psChamados.setString(1, textLocalChamado.getText());
                psChamados.setString(2,textEquipamento.getText());
                psChamados.setString(3,textDescricao.getText());
                psChamados.setString(4,textPrioridade.getSelectedItem().toString());
                int resultadoFuncionarios = psFuncionarios.executeUpdate();
                int resultadoChamados = psChamados.executeUpdate();
                ResultSet rs = psChamados.getGeneratedKeys();
                int protocolo = 0;
                
                conn.commit();
                if(resultadoFuncionarios==1&&resultadoChamados==1){
                    
                    textNome.setText(null);
                    textCPF.setText(null);
                    textMatricula.setText(null);
                    textSetor.setText(null);
                    textRamal.setText(null);
                    textEmail.setText(null);
                    textLocalChamado.setText(null);
                    textEquipamento.setText(null);
                    textDescricao.setText(null);
                    textPrioridade.setSelectedItem(null);
                   

                }else{
                    JOptionPane.showMessageDialog(null,"Chamado não cadastrado","ERRO",JOptionPane.ERROR_MESSAGE);
                }
                if(rs.next()){
                    protocolo = rs.getInt(1);
                    JOptionPane.showMessageDialog(null,"Chamado cadastrado com sucesso Nº PROTOCOLO: "+ protocolo);
                }
                psFuncionarios.close();
                psChamados.close();
                rs.close();
                conn.close();
                    
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
    }
    
    
    public void consultaCPF(javax.swing.JTextField textCPF,javax.swing.JTextField textNome, javax.swing.JTextField textMatricula, javax.swing.JTextField textSetor,
            javax.swing.JTextField textRamal, javax.swing.JTextField textEmail){
        String sql = "select*from funcionarios where cpf = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, textCPF.getText());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                textNome.setText(rs.getString("NOME"));
                textMatricula.setText(rs.getString("MATRICULA"));
                textSetor.setText(rs.getString("SETOR"));
                textRamal.setText(rs.getString("RAMAL"));
                textEmail.setText(rs.getString("EMAIL"));
                
            }else{
                JOptionPane.showMessageDialog(null, "Cliente não encontrado");
            }
            ps.close();
            rs.close();
            conn.close();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e,"ERRRO",JOptionPane.ERROR_MESSAGE);
        }       
               
    }

    public void consultarChamado(javax.swing.JTextField textID, javax.swing.JTextField textLocalChamado, javax.swing.JTextField textEquipamento,
            javax.swing.JTextArea textDescricao, javax.swing.JTextArea textResolucao,javax.swing.JTextField textNome){
        String sql = "select c.local_chamado, c.equipamento, c.descricao, c.resolucao,f.nome from chamados c "
                + "inner join funcionarios f on c.funcionarios_id = f.id where c.id=?;";
        try{
            ResultSet rs = null;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, textID.getText());
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                textLocalChamado.setText(rs.getString("Local_Chamado"));
                textEquipamento.setText(rs.getString("Equipamento"));
                textDescricao.setText(rs.getString("Descricao"));
                textResolucao.setText(rs.getString("Resolucao"));
                textNome.setText(rs.getString("nome"));
                
            }else{
                JOptionPane.showMessageDialog(null, "Chamado não encontrado");
            }
            ps.close();
            rs.close();
            conn.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e,"ERRRO",JOptionPane.ERROR_MESSAGE);
        }
        
        
    }

    public void atualizarChamado(javax.swing.JTextField textLocalChamado,javax.swing.JTextField textEquipamento, javax.swing.JTextArea textDescricao, 
            javax.swing.JComboBox<String> textPrioridade,javax.swing.JTextArea textResolucao,javax.swing.JTextField textProtocolo){
       
       String sql = "update chamados set local_chamado=?,equipamento=?, descricao=?, prioridade=?,resolucao=? where id=?" ;
       try{
            PreparedStatement ps = conn.prepareStatement(sql);
            
           
            ps.setString(1, textLocalChamado.getText());
            ps.setString(2, textEquipamento.getText());
            ps.setString(3, textDescricao.getText());
            ps.setString(4,textPrioridade.getSelectedItem().toString());
            ps.setString(5, textResolucao.getText());
            ps.setString(6, textProtocolo.getText());
            
            int resultado = ps.executeUpdate();
            
            if(resultado==1){
                JOptionPane.showMessageDialog(null, "Chamado atualizado com sucesso");
                textLocalChamado.setText(null);
                textEquipamento.setText(null);
                textDescricao.setText(null);
                textPrioridade.setSelectedItem(null);
                textResolucao.setText(null);
                textProtocolo.setText(null);
            }else{
                JOptionPane.showMessageDialog(null, "Erro ao atualizar o chamado");
            }
            ps.close();
            conn.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e,"ERRRO",JOptionPane.ERROR_MESSAGE);
        }
    
        
    
    }
    
    public void deletarChamado(javax.swing.JTextField textLocalChamado,javax.swing.JTextField textEquipamento, javax.swing.JTextArea textDescricao,
            javax.swing.JComboBox<String> textPrioridade,javax.swing.JTextField textProtocolo){
        
        String sql = "delete from chamados where id=?";
            try{
                int confirma = JOptionPane.showConfirmDialog(null, "Deseja  remover ?", "ATENÇÃO", JOptionPane.YES_NO_OPTION);
                if (confirma == JOptionPane.YES_NO_OPTION){
                    PreparedStatement ps = conn.prepareStatement(sql);
                    ps.setString(1, textProtocolo.getText());
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Chamado deletado com sucesso");
                    textLocalChamado.setText(null);
                    textEquipamento.setText(null);
                    textDescricao.setText(null);
                    textProtocolo.setText(null);
                    textPrioridade.setSelectedItem(null);
                    
                    ps.close();
                
                }
                
                conn.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e,"ERRRO",JOptionPane.ERROR_MESSAGE);
            }
        }
    
    
    
    public void consultaProtocolo(javax.swing.JTextField textLocalChamado,
            javax.swing.JTextField textEquipamento, javax.swing.JTextArea textDescricao, javax.swing.JComboBox<String> textPrioridade,javax.swing.JTextField textProtocolo, 
            javax.swing.JTextArea textResolucao){
        String sql = "select*from chamados where id = ?";
        try{
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,textProtocolo.getText());
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                textLocalChamado.setText(rs.getString("local_chamado"));
                textEquipamento.setText(rs.getString("equipamento"));
                textDescricao.setText(rs.getString("descricao"));
                textPrioridade.setSelectedItem(rs.getString("prioridade"));
                textResolucao.setText(rs.getString("resolucao"));
            }else{
                JOptionPane.showMessageDialog(null, "Chamado não encontrado");
            }
            
            ps.close();
            rs.close();
            conn.close();
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e,"ERRRO",JOptionPane.ERROR_MESSAGE);
        }
        
    }
}

