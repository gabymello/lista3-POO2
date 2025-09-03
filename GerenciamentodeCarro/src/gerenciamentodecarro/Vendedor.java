
package gerenciamentodecarro;

import java.util.ArrayList;
import java.util.List;

public class Vendedor {
     private String nome;
    private List<Carro> carrosVendidos;

    public Vendedor(String nome) {
        this.nome = nome;
        this.carrosVendidos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarVenda(Carro carro) {
        carrosVendidos.add(carro);
    }

    public void listarVendas() {
        System.out.println("\nCarros vendidos por " + nome + ":");
        if (carrosVendidos.isEmpty()) {
            System.out.println("  Nenhuma venda realizada.");
        } else {
            for (Carro c : carrosVendidos) {
                System.out.println("  - " + c);
            }
        }
    }
}

