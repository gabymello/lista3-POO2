
package biblioteca;


public class Livro {
     private String titulo;
    private Autor autor;
    private int quantidadeDisponivel;
    private int vezesEmprestado;

    public Livro(String titulo, Autor autor, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeDisponivel = quantidadeDisponivel;
        this.vezesEmprestado = 0;
        autor.adicionarLivro(this);
    }

    public String getTitulo() {
        return titulo;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void emprestar() {
        if (quantidadeDisponivel > 0) {
            quantidadeDisponivel--;
            vezesEmprestado++;
            System.out.println("Livro \"" + titulo + "\" emprestado com sucesso!");
        } else {
            System.out.println("Livro \"" + titulo + "\" indisponível para empréstimo.");
        }
    }

    public void devolver() {
        quantidadeDisponivel++;
        System.out.println("Livro \"" + titulo + "\" devolvido com sucesso!");
    }

    public int getVezesEmprestado() {
        return vezesEmprestado;
    }

    @Override
    public String toString() {
        return titulo + " | Autor: " + autor.getNome() + " | Disponível: " + quantidadeDisponivel + " | Emprestado: " + vezesEmprestado + " vezes";
    }
}

