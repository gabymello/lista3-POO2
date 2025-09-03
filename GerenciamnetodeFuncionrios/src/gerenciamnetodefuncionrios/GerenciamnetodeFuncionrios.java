
package gerenciamnetodefuncionrios;


public class GerenciamnetodeFuncionrios {

    
    public static void main(String[] args) {
   Departamento d1 = new Departamento("TI");
        Departamento d2 = new Departamento("RH");

        // Criando funcionários
        Funcionario f1 = new Funcionario("Gaby", 2500, d1);
        Funcionario f2 = new Funcionario("Bruno", 3500, d1);
        Funcionario f3 = new Funcionario("Lili", 2500, d2);

        
        d1.adicionarFuncionario(f1);
        d1.adicionarFuncionario(f2);
        d2.adicionarFuncionario(f3);

        
        Projeto p1 = new Projeto("Sistema Web");
        Projeto p2 = new Projeto("Recrutamento Online");

     
        f1.atribuirProjeto(p1);
        f2.atribuirProjeto(p1);
        f3.atribuirProjeto(p2);

        
        d1.exibirFuncionarios();
        d2.exibirFuncionarios();

        System.out.println("\nMédia salarial do depto " + d1.getNome() + ": R$" + d1.calcularMediaSalarial());

       
        System.out.println();
        f1.exibirProjetos();

        
        System.out.println();
        p1.exibirFuncionarios();
    }
}
    

    

