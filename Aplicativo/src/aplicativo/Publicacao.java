
package aplicativo;

import java.util.ArrayList;
import java.util.List;

public class Publicacao {
    private String conteudo;
    private Usuario autor;
    private List<Comentario> comentarios;

    public Publicacao(String conteudo, Usuario autor) {
        this.conteudo = conteudo;
        this.autor = autor;
        this.comentarios = new ArrayList<>();
    }

    public Usuario getAutor() {
        return autor;
    }

    public void adicionarComentario(Comentario comentario) {
        comentarios.add(comentario);
    }

    public void exibirPublicacao() {
        System.out.println(autor.getNome() + " publicou: " + conteudo);
        if (comentarios.isEmpty()) {
            System.out.println(" Sem comentários ainda.");
        } else {
            System.out.println(" Comentários:");
            for (Comentario c : comentarios) {
                System.out.println("   - " + c);
            }
        }
    }
}

