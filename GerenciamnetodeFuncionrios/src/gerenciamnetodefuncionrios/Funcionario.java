
package gerenciamnetodefuncionrios;

import java.util.ArrayList;
import java.util.List;


public class Funcionario {
   private String nome;
    private double salario;
    private Departamento departamento;
    private List<Projeto> projetos;

    public Funcionario(String nome, double salario, Departamento departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
        this.projetos = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void atribuirProjeto(Projeto projeto) {
        projetos.add(projeto);
        projeto.adicionarFuncionario(this);
    }

    public void exibirProjetos() {
        System.out.println("Projetos do funcionário " + nome + ":");
        if (projetos.isEmpty()) {
            System.out.println("Nenhum projeto atribuído.");
        } else {
            for (Projeto p : projetos) {
                System.out.println("- " + p.getNome());
            }
        }
    }

    @Override
    public String toString() {
        return nome + " | Salário: R$" + salario + " | Departamento: " + departamento.getNome();
    }
}