
package biblioteca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Biblioteca {

    
    public static void main(String[] args) {
      Autor a1 = new Autor("Machado de assis");
        Autor a2 = new Autor("Coller ");

        
        Livro l1 = new Livro("Dom Casmurro", a1, 3);
        Livro l2 = new Livro("Harry Potter e verão que mudou minha vida", a2, 2);
        Livro l3 = new Livro("Memórias Póstumas de Brás Cubas", a1, 1);

        
        Usuario u1 = new Usuario("Gaby");
        Usuario u2 = new Usuario("Bruno");

       
        Emprestimo e1 = new Emprestimo(l1, u1, 7);
        l1.emprestar();
        u1.adicionarEmprestimo(e1);

        Emprestimo e2 = new Emprestimo(l2, u2, 5);
        l2.emprestar();
        u2.adicionarEmprestimo(e2);

        Emprestimo e3 = new Emprestimo(l3, u1, 10);
        l3.emprestar();
        u1.adicionarEmprestimo(e3);

        
        e1.devolver(2); 
        e2.devolver(0);
        e3.devolver(5); 

       
        u1.listarEmprestimos();
        u2.listarEmprestimos();

       
        List<Livro> todosLivros = new ArrayList<>();
        todosLivros.add(l1);
        todosLivros.add(l2);
        todosLivros.add(l3);

        todosLivros.sort(Comparator.comparingInt(Livro::getVezesEmprestado).reversed());

        System.out.println("Livros mais populares:");
        for (Livro l : todosLivros) {
            System.out.println("  - " + l);
        }
    }
}
    
    

