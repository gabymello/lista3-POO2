
package reservadepassagem;

import java.util.ArrayList;
import java.util.List;

public class Passageiro {
    private String nome;
    private List<Reserva> reservas;

    public Passageiro(String nome) {
        this.nome = nome;
        this.reservas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public void listarReservas() {
        System.out.println("\nReservas do passageiro " + nome + ":");
        if (reservas.isEmpty()) {
            System.out.println("  Nenhuma reserva encontrada.");
        } else {
            for (Reserva r : reservas) {
                System.out.println("  - Voo " + r.getVoo().getNumeroVoo());
            }
        }
    }
}

