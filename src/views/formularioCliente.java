
package views;

import bean.ClienteBean;
import dao.ClienteDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class formularioCliente extends JPanel implements ActionListener {
      JLabel label_nome;
      JTextField campo_nome;
      
      JLabel label_cpf;
      JTextField campo_cpf;
      
      JLabel label_telefone;
      JTextField campo_telefone;
      
      JButton botao_salvar;
    
    public formularioCliente(){
        label_nome = new JLabel("Nome: ");
        campo_nome = new JTextField(20);
        label_cpf = new JLabel("CPF: ");
        campo_cpf = new JTextField(20);
        label_telefone = new JLabel("Telefone:");
        campo_telefone = new JTextField(20);
        
        botao_salvar = new JButton("Salvar");
        botao_salvar.addActionListener(this);
        
        add(label_nome);
        add(campo_nome);
        add(label_cpf);
        add(campo_cpf);
        add(label_telefone);
        add(campo_telefone);
        add(botao_salvar);
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String nome_digitado = campo_nome.getText();
       String cpf_digitado = campo_cpf.getText();
       int telefone_digitada  = Integer.parseInt(campo_telefone.getText());
       
       ClienteBean c = new ClienteBean();
       c.setNome(nome_digitado);
       c.setCpf(cpf_digitado);
       c.setTelefone(telefone_digitada);
       
      
       ClienteDAO.adicionar(c);
       
    }

   

    
}

    

