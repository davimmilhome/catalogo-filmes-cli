package main.java.cli.filmes.catalogo.ui;

import main.java.cli.filmes.catalogo.utils.ConsoleUIHelper;

public class TemplateUI {

    protected int linhas;
    protected int colunas;
    protected String titulo;

    public TemplateUI(String titulo) {
        this(24,120,titulo);
    }

    public TemplateUI(int linhas, int colunas, String titulo) {
        this.linhas = linhas;
        this.colunas = colunas;
        this.titulo = titulo;
    }

    public void show() {
        do {
            ConsoleUIHelper.drawHeader(titulo, colunas);
            int linhasUsadas = 3; // Subtraindo linhas do header
            ConsoleUIHelper.fillVSpace(linhas - linhasUsadas, colunas);
            ConsoleUIHelper.drawLine(colunas);
            if (true) {
                break;
            }
        } while (true);
    }

    public void drawContent() {

    }

    public void drawMenu() {

    }
}
