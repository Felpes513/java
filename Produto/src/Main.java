public class Main
{
    public static void main(String[] args) {
        Produto p0 = new Produto();
        Produto p1 = new Produto("sabão em pó....", 200,
                32.50);
        Produto p2 = new Produto("Garrafa de 1 litro");
        p2.setQuantidade(501);
        p2.setPreco(20.01);

        p0.imprime();
        p1.imprime();
        System.out.println("Descrição: "+p2.getDescricao());
        System.out.println("Quantidade: "+p2.getQuantidade());
        System.out.println("Preço: "+p2.getPreco());

    }
}