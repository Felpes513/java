public class Produto {
    private String descricao;
    private int quantidade;
    private double preco;

    public Produto(){

    }

    public Produto(String descricao, int quantidade,
                   double preco){
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Produto(String descricao){
        this.descricao = descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
    public int getQuantidade(){
        return quantidade;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    public double getPreco(){
        return preco;
    }
    public void imprime(){
        if (descricao != null)
            System.out.println("Descrição " + descricao);
        if(quantidade>0)
            System.out.println("Quantidade " +quantidade);
        if(preco>0)
            System.out.println("Preço " + preco);
    }
}