package main.java.cli.filmes.catalogo;

import main.java.cli.filmes.catalogo.ui.PagedListUI;
import main.java.cli.filmes.catalogo.ui.TemplateUI;

public class Main {
    public static void main (String[] args) {
        TemplateUI ui = new PagedListUI("PaginaListada");
        ui.show();
    }
}
