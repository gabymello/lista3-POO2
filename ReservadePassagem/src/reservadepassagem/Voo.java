
package reservadepassagem;

import java.util.ArrayList;
import java.util.List;

public class Voo {
     private String numeroVoo;
    private int capacidade;
    private List<Reserva> reservas;

    public Voo(String numeroVoo, int capacidade) {
        this.numeroVoo = numeroVoo;
        this.capacidade = capacidade;
        this.reservas = new ArrayList<>();
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public boolean verificarDisponibilidade() {
        return reservas.size() < capacidade;
    }

    public Reserva fazerReserva(Passageiro passageiro) {
        if (verificarDisponibilidade()) {
            Reserva reserva = new Reserva(passageiro, this);
            reservas.add(reserva);
            passageiro.adicionarReserva(reserva);
            System.out.println("Reserva confirmada para " + passageiro.getNome() + " no voo " + numeroVoo);
            return reserva;
        } else {
            System.out.println("Voo " + numeroVoo + " está lotado!");
            return null;
        }
    }

    public void listarReservas() {
        System.out.println("\nReservas do voo " + numeroVoo + ":");
        if (reservas.isEmpty()) {
            System.out.println("  Nenhuma reserva feita.");
        } else {
            for (Reserva r : reservas) {
                System.out.println("  - Passageiro: " + r.getPassageiro().getNome());
            }
        }
    }
}

