
package views;

import bean.ManutecaoBean;
import dao.ManutecaoDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class formularioManutecao extends JPanel implements ActionListener {
      JLabel label_nome;
      JTextField campo_nome;
      
      JLabel label_produto;
      JTextField campo_produto;
      
      JLabel label_descricao;
      JTextField campo_descricao;
      
      JLabel label_preco;
      JTextField campo_preco;
      
      JButton botao_salvar;
    
    public formularioManutecao(){
        label_nome = new JLabel("Nome Cliente: ");
        campo_nome = new JTextField(10);
        label_produto = new JLabel("Produto: ");
        campo_produto = new JTextField(10);
        label_descricao = new JLabel("Descrição: ");
        campo_descricao = new JTextField(10);
        label_preco = new JLabel("Preço: ");
        campo_preco = new JTextField(10);
        
        botao_salvar = new JButton("Salvar");
        botao_salvar.addActionListener(this);
        
        add(label_nome);
        add(campo_nome);
        add(label_produto);
        add(campo_produto);
        add(label_descricao);
        add(campo_descricao);
        add(label_preco);
        add(campo_preco);
       
        add(botao_salvar);
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String nome_digitado = campo_nome.getText();
       String produto_digitado = campo_produto.getText();
       String descricao_digitado = campo_descricao.getText();
       double preco_digitado = Double.parseDouble(campo_preco.getText());
       
       ManutecaoBean m = new ManutecaoBean();
       m.setNomeCliente(nome_digitado);
       m.setProduto(produto_digitado);
       m.setDescricao(descricao_digitado);
       m.setPreco(preco_digitado);
      
       
      
       ManutecaoDAO.adicionar(m);
       
    }

   

    
}
    

