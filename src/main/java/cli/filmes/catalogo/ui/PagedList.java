package src.main.java.cli.filmes.catalogo.ui;

import java.util.List;

public interface PagedList<T> {
    List<T> listar(int pagina, int tamanhoPagina);
}
