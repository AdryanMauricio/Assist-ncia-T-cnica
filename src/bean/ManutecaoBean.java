
package bean;


public class ManutecaoBean {
    private String nome;
    private String Produto;
    private String Descricao;
    private double Preco;
    
    public ManutecaoBean(){}

    public void setNomeCliente(String nome) {
        this.nome = nome;
    }
    public void setProduto(String Produto) {
        this.Produto = Produto;
    }
    public void setDescricao(String Descricao) {
        this.Descricao = Descricao;
    }
    public void setPreco(double Preco) {
        this.Preco = Preco;
    }
    
     public String getNomeCliente() {
        return nome;
    }
      public String getProduto() {
        return Produto;
    }
       public String getDescricao() {
        return Descricao;
    }
        public double getPreco() {
        return Preco;
    }
    
    
}
