package main.java.cli.filmes.catalogo;


import main.java.cli.filmes.catalogo.models.Filme;


import java.util.ArrayList;
import java.util.List;

public class Catalogo implements main.java.cli.filmes.catalogo.ui.PagedList<Filme> {
    private List<Filme> filmes;

    public Catalogo() {
        filmes = new ArrayList<>();
    }

    public List<Filme> listar(int pagina, int tamanhoPagina) {
        List<Filme> listagem = new ArrayList<>();
        int primeiroRegistro = tamanhoPagina * (pagina-1);
        if (primeiroRegistro > filmes.size() -1) {
            return listagem;
        }
        int ultimoRegistro = primeiroRegistro + tamanhoPagina;
        if (filmes.size() < ultimoRegistro) {
            ultimoRegistro = filmes.size();
        }
        for (int i = primeiroRegistro; i < ultimoRegistro; i++) {
            Filme filme = filmes.get(i);
            listagem.add(filme);
        }
        return listagem;
    }

    void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    void removerFilme(Filme filme) {
        filmes.remove(filme);
    }

    List<Filme> pesquisarFilme(String nome) {
        List<Filme> encontrados = new ArrayList<>();
        for (Filme filme : filmes) {
            if (filme.getNomeFilme().toLowerCase().contains(nome.toLowerCase())) {
                encontrados.add(filme);
            }
        }
        return encontrados;
    }

}
