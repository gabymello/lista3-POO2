
package aplicativo;


public class Aplicativo {

    
    public static void main(String[] args) {
       Usuario u1 = new Usuario("Gaby");
        Usuario u2 = new Usuario("Bruno");
        Usuario u3 = new Usuario("Lili");

        // Usuários criam publicações
        u1.criarPublicacao("Bo noite!");
        u2.criarPublicacao("Estudando Java hoje.");
        u1.criarPublicacao("Nao gosto de javaaaaa!");

        // Pegando publicações para comentar
        Publicacao pub1 = u1.getPublicacoes().get(0);
        Publicacao pub2 = u2.getPublicacoes().get(0);

        // Comentários
        u2.comentarPublicacao(pub1, "Bom dia, Gaby!");
        u3.comentarPublicacao(pub1, "Oi, tudo bem?");
        u1.comentarPublicacao(pub2, "Boa sorte nos estudos!");

        // Listando publicações de cada usuário
        u1.listarPublicacoes();
        u2.listarPublicacoes();
        u3.listarPublicacoes();
    }
}
    
    

