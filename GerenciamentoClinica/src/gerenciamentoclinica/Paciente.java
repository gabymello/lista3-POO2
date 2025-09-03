
package gerenciamentoclinica;

import java.util.ArrayList;
import java.util.List;

public class Paciente {
     private String nome;
    private int idade;
    private List<Consulta> consultas;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.consultas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    // Mostrar consultas do paciente
    public void listarConsultas() {
        System.out.println("\nConsultas do paciente " + nome + ":");
        if (consultas.isEmpty()) {
            System.out.println("  Nenhuma consulta marcada.");
        } else {
            for (Consulta c : consultas) {
                System.out.println("  - " + c);
            }
        }
    }
}


