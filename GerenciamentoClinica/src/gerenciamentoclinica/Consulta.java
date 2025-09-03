
package gerenciamentoclinica;

public class Consulta {
     private Medico medico;
    private Paciente paciente;
    private String dataHora;

    public Consulta(Medico medico, Paciente paciente, String dataHora) {
        this.medico = medico;
        this.paciente = paciente;
        this.dataHora = dataHora;
    }

    public Medico getMedico() {
        return medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public String getDataHora() {
        return dataHora;
    }

    @Override
    public String toString() {
        return "Consulta em " + dataHora + " | Médico: Dr(a). " + medico.getNome()
                + " | Paciente: " + paciente.getNome();
    }
}

