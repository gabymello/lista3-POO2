
package gerenciamnetodefuncionrios;

import java.util.ArrayList;
import java.util.List;


public class Projeto {
   private String nome;
    private List<Funcionario> funcionarios;

    public Projeto(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFuncionario(Funcionario f) {
        if (!funcionarios.contains(f)) {
            funcionarios.add(f);
        }
    }

    public void exibirFuncionarios() {
        System.out.println("Funcionários no projeto " + nome + ":");
        for (Funcionario f : funcionarios) {
            System.out.println("- " + f.getNome());
        }
    }
}
 

