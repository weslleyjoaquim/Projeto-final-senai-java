package projetosenai.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

    //select c.local_chamado, c.equipamento, c.descricao, c.prioridade, f.nome, f.ramal, f.email from chamados c, funcionarios f where f.id = c.funcionarios_id
public class CadastroDao{
    
    Connection conn = ConnectionFactory.conexao();
    
    public void cadastrarChamado(javax.swing.JTextField textNome,javax.swing.JTextField textCPF, javax.swing.JTextField textMatricula, javax.swing.JTextField textSetor,
            javax.swing.JTextField textRamal, javax.swing.JTextField textEmail, javax.swing.JTextField textLocalChamado, javax.swing.JTextField textEquipamento,
            javax.swing.JTextArea textDescricao, javax.swing.JComboBox<String> textPrioridade){
        
        String funcionarios = "insert into funcionarios( nome, cpf, matricula,setor, ramal, email) values(?,?,?,?,?,?);";
        String chamados = "insert into chamados(local_chamado, equipamento, descricao, prioridade, funcionarios_id) values (?,?,?,?,last_insert_id())";
    
    try{
        
            
            
            ResultSet rs = null;
            conn.setAutoCommit(false);
            PreparedStatement psFuncionarios = conn.prepareStatement(funcionarios);
            PreparedStatement psChamados = conn.prepareStatement(chamados);
            
            
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
            //rs = psChamados.getGeneratedKeys();
            
            conn.commit();
            if(resultadoFuncionarios==1&&resultadoChamados==1){
                //int protocolo = rs.getInt(1);
                JOptionPane.showMessageDialog(null,"Chamado cadastrado com sucesso");
                
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
                psChamados.close();
                psFuncionarios.close();
            
            }else
                JOptionPane.showMessageDialog(null,"Chamado não cadastrado","ERRO",JOptionPane.ERROR_MESSAGE);
            
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void consultaChamado(){
        
    }
}
