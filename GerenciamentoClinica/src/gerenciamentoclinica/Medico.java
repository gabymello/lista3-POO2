
package gerenciamentoclinica;

import java.util.ArrayList;
import java.util.List;


public class Medico {
    private String nome;
    private String especialidade;
    private List<Consulta> consultas;

    public Medico(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.consultas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    // Listar pacientes atendidos por este médico
    public void listarPacientes() {
        System.out.println("\nPacientes do Dr(a). " + nome + ":");
        if (consultas.isEmpty()) {
            System.out.println("  Nenhum paciente agendado.");
        } else {
            for (Consulta c : consultas) {
                System.out.println("  - " + c.getPaciente().getNome());
            }
        }
    }

    // Mostrar próximas consultas
    public void listarConsultas() {
        System.out.println("\nConsultas do Dr(a). " + nome + ":");
        if (consultas.isEmpty()) {
            System.out.println("  Nenhuma consulta agendada.");
        } else {
            for (Consulta c : consultas) {
                System.out.println("  - " + c);
            }
        }
    }
}

