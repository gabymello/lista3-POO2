
package gerenciamentodecarro;

import java.util.ArrayList;
import java.util.List;


public class Marca {
     private String nome;
    private List<Carro> carros;

    public Marca(String nome) {
        this.nome = nome;
        this.carros = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarCarro(Carro carro) {
        carros.add(carro);
    }

    public double calcularMediaPrecos() {
        if (carros.isEmpty()) return 0.0;
        double soma = 0;
        for (Carro c : carros) {
            soma += c.getPreco();
        }
        return soma / carros.size();
    }

    public void listarCarros() {
        System.out.println("\nCarros da marca " + nome + ":");
        if (carros.isEmpty()) {
            System.out.println("  Nenhum carro cadastrado.");
        } else {
            for (Carro c : carros) {
                System.out.println("  - " + c);
            }
        }
    } 
}
