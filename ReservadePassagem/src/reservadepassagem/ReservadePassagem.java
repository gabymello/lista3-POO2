
package reservadepassagem;


public class ReservadePassagem {

 
    public static void main(String[] args) {
       Passageiro p1 = new Passageiro("Ana");
        Passageiro p2 = new Passageiro("Bruno");
        Passageiro p3 = new Passageiro("Carla");

        
        Voo v1 = new Voo("AB123", 2);
        Voo v2 = new Voo("CD456", 1);

       
        v1.fazerReserva(p1);
        v1.fazerReserva(p2);
        v1.fazerReserva(p3); 

        v2.fazerReserva(p3);

       
        p1.listarReservas();
        p2.listarReservas();
        p3.listarReservas();

        // Listando reservas dos voos
        v1.listarReservas();
        v2.listarReservas();
    }
}
    
    

