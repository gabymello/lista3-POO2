
package gerenciamnetodefuncionrios;

import java.util.ArrayList;
import java.util.List;


public class Departamento {
  private String nome;
    private List<Funcionario> funcionarios;

    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarFuncionario(Funcionario f) {
        funcionarios.add(f);
    }

    public double calcularMediaSalarial() {
        if (funcionarios.isEmpty()) return 0.0;
        double soma = 0;
        for (Funcionario f : funcionarios) {
            soma += f.getSalario();
        }
        return soma / funcionarios.size();
    }

    public void exibirFuncionarios() {
        System.out.println("Funcionários do departamento " + nome + ":");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }
    }
}   

