
package biblioteca;

import java.util.ArrayList;
import java.util.List;


public class Usuario {
    private String nome;
    private List<Emprestimo> emprestimos;

    public Usuario(String nome) {
        this.nome = nome;
        this.emprestimos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarEmprestimo(Emprestimo e) {
        emprestimos.add(e);
    }

    public void listarEmprestimos() {
        System.out.println("\nEmpréstimos do usuário " + nome + ":");
        if (emprestimos.isEmpty()) {
            System.out.println("  Nenhum empréstimo realizado.");
        } else {
            for (Emprestimo e : emprestimos) {
                System.out.println("  - " + e);
            }
        }
    }
}


