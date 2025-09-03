
package aplicativo;


public class Comentario {
     private String conteudo;
    private Usuario autor;

    public Comentario(String conteudo, Usuario autor) {
        this.conteudo = conteudo;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return autor.getNome() + ": " + conteudo;
    }
}

