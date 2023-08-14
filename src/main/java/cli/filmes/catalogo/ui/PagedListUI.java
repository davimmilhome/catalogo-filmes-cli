package main.java.cli.filmes.catalogo.ui;

import main.java.cli.filmes.catalogo.utils.ConsoleUIHelper;

public class PagedListUI extends TemplateUI {

    protected final int PAGE_SIZE;
    protected int actualPage;

    public PagedListUI(String title) {
        this(DEFAULT_ROWS, DEFAULT_COLS, title);
    }

    public PagedListUI(int linhas, int colunas, String title) {
        super(linhas, colunas, title);
        PAGE_SIZE = linhas - 4; // Cabeçalho 3 rows + linha separadora
        actualPage = 1;
    }

    @Override
    public int drawContent() {
        return 0;
    };
    @Override
    public int menuLines() {
        return 6; // 5 opções e a menssagem
    };
    @Override
    public boolean drawMenu() {
        String[] opcoes = {
                "Página Anterior",
                "Pagina seguinte",
                "Novo item",
                "Ver detalhes",
                "Sair"
        };

        int opcao = ConsoleUIHelper.askChooseOption(
                "Escolha uma opção",
                opcoes[0],
                opcoes[1],
                opcoes[2],
                opcoes[3],
                opcoes[4]
        );

        switch (opcao) {
            case 0:
                previousPage();
                break;

            case 1:
                nextPage();
                break;

            case 2:
                addItem();
                break;

            case 3:
                seeItem();
                break;

            default:
                return false;
        }

        return true;
    }

    private void seeItem() {
    }

    private void addItem() {
        
    }

    private void nextPage() {
        
    }

    private void previousPage() {
        
    }

    ;
}
