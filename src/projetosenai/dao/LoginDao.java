package projetosenai.dao;

import java.sql.*;
import javax.swing.JOptionPane;
import projetofinalsenai.views.TelaLogin;
import projetofinalsenai.views.TelaPrincipal;

public class LoginDao {
    
    Connection conn = ConnectionFactory.conexao();
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    public void logar(javax.swing.JTextField user, javax.swing.JPasswordField senha){
        String sql = "select * from login where usuario=? and senha=?";
        try{
            ps = conn.prepareStatement(sql);
            ps.setString(1,user.getText());
            ps.setString(2, senha.getText());
            rs=ps.executeQuery();
            
            if(rs.next()){
               String usuario=user.getText();
               TelaPrincipal obj = new TelaPrincipal();
               obj.setVisible(true);
               obj.setUsuario(usuario);
               System.out.println("Teste "+usuario);
                //TelaLogin.this.dispose();
            }else{
                JOptionPane.showMessageDialog(null,"Usuário ou senha inválidos", "ERRO",JOptionPane.ERROR_MESSAGE);                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
