
package biblioteca;

public class Emprestimo {
    private Livro livro;
    private Usuario usuario;
    private int diasEmprestimo;
    private int diasAtraso;

    public Emprestimo(Livro livro, Usuario usuario, int diasEmprestimo) {
        this.livro = livro;
        this.usuario = usuario;
        this.diasEmprestimo = diasEmprestimo;
        this.diasAtraso = 0;
    }

    public void devolver(int diasAtraso) {
        this.diasAtraso = diasAtraso;
        livro.devolver();
        if (diasAtraso > 0) {
            System.out.println("Multa por atraso: R$" + calcularMulta());
        } else {
            System.out.println("Devolução no prazo, sem multa.");
        }
    }

    public double calcularMulta() {
        double multaDiaria = 2.0; // R$2 por dia de atraso
        return diasAtraso * multaDiaria;
    }

    public Livro getLivro() {
        return livro;
    }

    @Override
    public String toString() {
        return livro.getTitulo() + " | Dias emprestado: " + diasEmprestimo + " | Dias atraso: " + diasAtraso;
    }
}


