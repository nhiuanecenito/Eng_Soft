package DAO;

import DTO.ClienteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ClienteDAO {
    
    Connection con;
    PreparedStatement pstm;
    
    public void adicionarCliente(ClienteDTO objClienteDTO) throws ClassNotFoundException{
        
        String sql = "insert into Cliente (ID, Nome, Provincia, Bairro, Email, Contacto) values (?, ?, ?, ?, ?, ?)";
        
        // Falta criar a conexao DAO para conectar com BD
       // con = new ConexaoDAO().ConexaoBD();
       
        try {
           
            pstm = con.prepareStatement(sql);
            pstm.setInt(1, objClienteDTO.getID());
            pstm.setString(2, objClienteDTO.getNome());
            pstm.setString(3, objClienteDTO.getProvincia());
            pstm.setString(4, objClienteDTO.getBairro());
            pstm.setString(5, objClienteDTO.getEmail());
            pstm.setString(6, objClienteDTO.getContacto());
            
            pstm.execute();
            pstm.close();
            
        } catch (SQLException e) {
        }
        
    }
    
}
