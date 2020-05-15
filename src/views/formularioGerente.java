
package views;

import bean.GerenteBean;
import dao.GerenteDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class formularioGerente extends JPanel implements ActionListener {
      JLabel label_usuario;
      JTextField campo_usuario;
      
      JLabel label_senha;
      JTextField campo_senha;
      
      JButton botao_salvar;
    
    public formularioGerente(){
        label_usuario = new JLabel("Usuario: ");
        campo_usuario = new JTextField(20);
        label_senha = new JLabel("Senha: ");
        campo_senha = new JTextField(20);
        
        botao_salvar = new JButton("Salvar");
        botao_salvar.addActionListener(this);
        
        add(label_usuario);
        add(campo_usuario);
        add(label_senha);
        add(campo_senha);
       
        add(botao_salvar);
        
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String usuario_digitado = campo_usuario.getText();
       String senha_digitado = campo_senha.getText();
       
       GerenteBean g = new GerenteBean();
       g.setUsuario(usuario_digitado);
       g.setSenha(senha_digitado);
       
      
       GerenteDAO.adicionar(g);
       
    }

   

    
}
    

