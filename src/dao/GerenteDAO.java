
package dao;

import bean.GerenteBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class GerenteDAO {
    public static void adicionar(GerenteBean gerente){
        
        String sql = "INSERT INTO gerente (usuario, senha) VALUES (?, ?)";
        
        try{
            Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, gerente.getUsuario());
            stmt.setString(2, gerente.getSenha());
            stmt.execute();
        }catch(Exception e){

        }    
    }

    public static ArrayList<GerenteBean> listar(){
        
        ArrayList<GerenteBean> gerente = new ArrayList<>();
                
        String sql = "SELECT * FROM gerente";
        
        try{
            Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            ResultSet dados = stmt.executeQuery();
            
            while(dados.next()){
                GerenteBean temporario = new GerenteBean();
                temporario.setUsuario(dados.getString("usuario"));
                temporario.setSenha(dados.getString("senha"));
                
                gerente.add(temporario);
            }
            
        }catch(Exception e){} 
        
        return gerente;
    }   
    
}
