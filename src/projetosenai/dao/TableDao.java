package projetosenai.dao;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class TableDao {
  
    Connection conn = ConnectionFactory.conexao();
    
    public void carregaTabela(javax.swing.JTable tabelaChamados){
        String sql = "select * from chamados";
        DefaultTableModel modelo = (DefaultTableModel) tabelaChamados.getModel();
        
        try{
            Connection conn = ConnectionFactory.conexao();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
           
            while(rs.next()){
                modelo.addRow(new Object[]{
                    rs.getInt(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                });
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
