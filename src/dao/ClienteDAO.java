
package dao;

import bean.ClienteBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ClienteDAO {
    
    public static void adicionar(ClienteBean cliente){
        
        String sql = "INSERT INTO cliente (nome, cpf, telefone) VALUES (?, ?, ?)";
        
        try{
            Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setInt(3, cliente.getTelefone());
            stmt.execute();
        }catch(Exception e){

        }    
    }
    
     public static ArrayList<ClienteBean> listar(){
        
        ArrayList<ClienteBean> cliente = new ArrayList<>();
                
        String sql = "SELECT * FROM cliente";
        
        try{
            Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            ResultSet dados = stmt.executeQuery();
            
            while(dados.next()){
                ClienteBean temporario = new ClienteBean();
                temporario.setNome(dados.getString("Nome"));
                temporario.setCpf(dados.getString("Cpf"));
                temporario.setTelefone(dados.getInt("Telefone"));
                
                cliente.add(temporario);
            }
            
        }catch(Exception e){} 
        
        return cliente;
    }
}
