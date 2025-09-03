
package aplicativo;

import java.util.ArrayList;
import java.util.List;


public class Usuario {
    private String nome;
    private List<Publicacao> publicacoes;

    public Usuario(String nome) {
        this.nome = nome;
        this.publicacoes = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void criarPublicacao(String conteudo) {
        Publicacao p = new Publicacao(conteudo, this);
        publicacoes.add(p);
    }

    public List<Publicacao> getPublicacoes() {
        return publicacoes;
    }

    public void comentarPublicacao(Publicacao publicacao, String conteudo) {
        Comentario c = new Comentario(conteudo, this);
        publicacao.adicionarComentario(c);
    }

    public void listarPublicacoes() {
        System.out.println("Publicações de " + nome + ":");
        if (publicacoes.isEmpty()) {
            System.out.println(" Nenhuma publicação.");
        } else {
            for (Publicacao p : publicacoes) {
                p.exibirPublicacao();
            }
        }
    }
}

