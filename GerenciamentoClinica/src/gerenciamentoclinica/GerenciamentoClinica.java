
package gerenciamentoclinica;


public class GerenciamentoClinica {

    
    public static void main(String[] args) {
       Medico m1 = new Medico("Roberto", "Cardiologista");
        Medico m2 = new Medico("Marina", "Dermatologista");

        
        Paciente p1 = new Paciente("Gaby", 17);
        Paciente p2 = new Paciente("Bruno", 18);
        Paciente p3 = new Paciente("lili", 42);

        // Agendando consultas
        Consulta c1 = new Consulta(m1, p1, "10/09/2025 09:00");
        Consulta c2 = new Consulta(m1, p2, "10/09/2025 10:00");
        Consulta c3 = new Consulta(m2, p3, "11/09/2025 14:00");

        // Relacionando consultas
        m1.adicionarConsulta(c1);
        m1.adicionarConsulta(c2);
        m2.adicionarConsulta(c3);

        p1.adicionarConsulta(c1);
        p2.adicionarConsulta(c2);
        p3.adicionarConsulta(c3);

        // Listando pacientes de um médico
        m1.listarPacientes();
        m2.listarPacientes();

        // Listando consultas de médicos
        m1.listarConsultas();
        m2.listarConsultas();

        // Listando consultas de pacientes
        p1.listarConsultas();
        p2.listarConsultas();
        p3.listarConsultas();
    }
}
    
    

