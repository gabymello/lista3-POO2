
package gerenciamentodecarro;


public class Carro {
      private String modelo;
    private double preco;
    private Marca marca;
    private Vendedor vendedor; // null se não vendido
    private boolean vendido;

    public Carro(String modelo, double preco, Marca marca) {
        this.modelo = modelo;
        this.preco = preco;
        this.marca = marca;
        this.vendido = false;
        this.vendedor = null;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPreco() {
        return preco;
    }

    public Marca getMarca() {
        return marca;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void vender(Vendedor vendedor) {
        if (!vendido) {
            this.vendedor = vendedor;
            this.vendido = true;
            vendedor.adicionarVenda(this);
            System.out.println("Carro " + modelo + " vendido por " + vendedor.getNome());
        } else {
            System.out.println("Carro " + modelo + " já está vendido!");
        }
    }

    @Override
    public String toString() {
        String status = vendido ? "Vendido" : "Disponível";
        return modelo + " | Preço: R$" + preco + " | Marca: " + marca.getNome() + " | " + status;
    }
}

