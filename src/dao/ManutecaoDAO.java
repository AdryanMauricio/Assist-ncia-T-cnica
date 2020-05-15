
package dao;

import bean.ManutecaoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;


public class ManutecaoDAO {
    public static void adicionar(ManutecaoBean manutecao){
        
        String sql = "INSERT INTO manutecao (nome, produto, descricao, preco) VALUES (?, ?, ?, ?)";
        
        try{
            Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            stmt.setString(1, manutecao.getNomeCliente());
            stmt.setString(2, manutecao.getProduto());
            stmt.setString(3, manutecao.getDescricao());
            stmt.setDouble(4, manutecao.getPreco());
            stmt.execute();
        }catch(Exception e){

        }    
    }

    public static ArrayList<ManutecaoBean> listar(){
        
        ArrayList<ManutecaoBean> manutecao = new ArrayList<>();
                
        String sql = "SELECT * FROM manutecao";
        
        try{
            Connection conexao = ConexaoDB.retornaConexao();
            PreparedStatement stmt = conexao.prepareStatement(sql);
            
            ResultSet dados = stmt.executeQuery();
            
            while(dados.next()){
                ManutecaoBean temporario = new ManutecaoBean();
                temporario.setNomeCliente(dados.getString("nome"));
                temporario.setProduto(dados.getString("Produto"));
                temporario.setDescricao(dados.getString("Descricao"));
                temporario.setPreco(dados.getDouble("Preco"));
                
                manutecao.add(temporario);
            }
            
        }catch(Exception e){} 
        
        return manutecao;
    }   
    
    
}
