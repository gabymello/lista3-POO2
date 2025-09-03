
package gerenciamentodecarro;


public class GerenciamentodeCarro {

    
    public static void main(String[] args) {
      Marca m1 = new Marca("Ford");
        Marca m2 = new Marca("Honda");

        
        Vendedor v1 = new Vendedor("Gaby");
        Vendedor v2 = new Vendedor("Bruno");

       
        Carro c1 = new Carro("Corolla", 12000, m1);
        Carro c2 = new Carro("Toyota", 90000, m1);
        Carro c3 = new Carro("Civic", 110000, m2);
        Carro c4 = new Carro("Fit", 8000, m2);

        
        m1.adicionarCarro(c1);
        m1.adicionarCarro(c2);
        m2.adicionarCarro(c3);
        m2.adicionarCarro(c4);

       
        m1.listarCarros();
        m2.listarCarros();

       
        System.out.println("Média de preços da marca " + m1.getNome() + ": R$" + m1.calcularMediaPrecos());
        System.out.println("Média de preços da marca " + m2.getNome() + ": R$" + m2.calcularMediaPrecos());

        
        c1.vender(v1);
        c3.vender(v2);
        c2.vender(v1);

       
        v1.listarVendas();
        v2.listarVendas();

        
        m1.listarCarros();
        m2.listarCarros();
    }
} 
   