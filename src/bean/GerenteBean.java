
package bean;


public class GerenteBean {
    private String usuario;
    private String senha;
    
    public GerenteBean(){}
    
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getUsuario(){
        return this.usuario;
    }
    public String getSenha(){
        return this.senha;
    }
    
}
