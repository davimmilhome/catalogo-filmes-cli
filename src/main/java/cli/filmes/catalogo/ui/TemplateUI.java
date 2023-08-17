package main.java.cli.filmes.catalogo.ui;

import main.java.cli.filmes.catalogo.utils.ConsoleUIHelper;

public abstract class TemplateUI {

    protected static final int DEFAULT_ROWS = 24;
    protected static final int DEFAULT_COLS = 120;

    protected int rows;
    protected int cols;
    protected String title;

    public TemplateUI(String title) {
        this(DEFAULT_ROWS,DEFAULT_COLS, title);
    }

    public TemplateUI(int rows, int cols, String title) {
        this.rows = rows;
        this.cols = cols;
        this.title = title;
    }

    public void show() {
        do {
            ConsoleUIHelper.drawHeader(title, cols);
            int linhasUsadas = 3 + drawContent() + menuLines(); // Subtraindo rows do header
            if (linhasUsadas < rows) {
                ConsoleUIHelper.fillVSpace(rows - linhasUsadas, cols);
            }
            ConsoleUIHelper.drawLine(cols);
            if (!drawMenu()) {
                break;
            }
        } while (true);
    }

    public abstract int drawContent();
    public abstract int menuLines();
    public abstract boolean drawMenu();
}
