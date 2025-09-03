
package gerenciamentodeestoque;


public class GerenciamentodeEstoque {

    public static void main(String[] args) {
        Produto produto = new Produto("Arroz", 4, 25.0);

        
        Fornecedor fornecedor = new Fornecedor("Fornecedor Gaby", "gaby@gmail.com");

       
        System.out.println("PRODUTO INICIAL");
        System.out.println(produto);

        
        Pedido pedido = new Pedido(produto, fornecedor, 10);
        pedido.realizarPedido();

       
        System.out.println("PRODUTO APÓS PEDIDO");
        System.out.println(produto);

       
        if (produto.getQuantidade() < 5) {
            System.out.println("Estoque baixo: " + produto);
        } else {
            System.out.println("nEstoque suficiente: " + produto);
        }
    }
}
    
    

