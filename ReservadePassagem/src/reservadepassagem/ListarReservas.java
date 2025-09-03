
package reservadepassagem;


public class ListarReservas {
      System.out.println("\nReservas do voo " + numeroVoo + ":");
        if (reservas.isEmpty()) {
            System.out.println("  Nenhuma reserva feita.");
        } else {
            for (Reserva r : reservas) {
                System.out.println("  - Passageiro: " + r.getPassageiro().getNome());
            }
        }
    }
