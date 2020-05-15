
package bean;


public class ClienteBean {
    private String nome;
    private String cpf;
    private int telefone;
    
    public ClienteBean(){}
    
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setTelefone(int telefone){
        this.telefone = telefone;
    }
    
    public String getNome(){
        return this.nome;
    }
    public String getCpf(){
        return this.cpf;
    }
    public int getTelefone(){
        return this.telefone;
    }

    
}
