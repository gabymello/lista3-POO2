
package gerenciamentodeestoque;

public class Pedido {
    private Produto produto;
    private Fornecedor fornecedor;
    private int quantidade;

    public Pedido(Produto produto, Fornecedor fornecedor, int quantidade) {
        this.produto = produto;
        this.fornecedor = fornecedor;
        this.quantidade = quantidade;
    }

    public void realizarPedido() {
        produto.adicionarEstoque(quantidade);
        System.out.println("Pedido realizado: " + quantidade + " unidades de " + produto.getNome() + " ao fornecedor " + fornecedor.getNome());
    }
}

