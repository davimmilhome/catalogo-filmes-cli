package main.java.cli.filmes.catalogo;

import main.java.cli.filmes.catalogo.ui.TemplateUI;

public class Main {
    public static void main (String[] args) {
        TemplateUI ui = new TemplateUI("Catologo Filmes CLI");
        ui.show();
    }
}
