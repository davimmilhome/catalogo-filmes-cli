package main.java.cli.filmes.catalogo.ui;

import main.java.cli.filmes.catalogo.utils.ConsoleUIHelper;

import java.util.ArrayList;
import java.util.List;

public abstract class PagedListUI<T> extends TemplateUI {

    protected final int PAGE_SIZE;
    protected final PagedList<T> pageSource;
    protected int actualPage;

    private List<T> dataList;
    private ArrayList nomesFilme;

    public PagedListUI(String title, PagedList<T> pageSource) {
        this(DEFAULT_ROWS, DEFAULT_COLS, title, pageSource);
    }

    public PagedListUI(int linhas, int colunas, String title, PagedList<T> pageSource) {
        super(linhas, colunas, title);
        PAGE_SIZE = linhas - 4; // Cabeçalho 3 rows + linha separadora
        actualPage = 1;
        this.pageSource = pageSource;
    }

    @Override
    public int drawContent() {
        dataList = pageSource.listar(actualPage, PAGE_SIZE);
        nomesFilme = (ArrayList) pageSource.listarNome(actualPage, PAGE_SIZE);
        if (nomesFilme.isEmpty() && actualPage > 1) {
            previousPage();
            nomesFilme = (ArrayList) pageSource.listarNome(actualPage, PAGE_SIZE);
        }
        for (int i = 0; i < nomesFilme.size(); i++) {
            String text = nomesFilme.get(i).toString();
            ConsoleUIHelper.drawWithRightPadding(i + " -> " + text, cols, ' ');
        }
        return dataList.size();
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
        int op = ConsoleUIHelper.askNumber("Informe o item a exibir").intValue();
        if (op >= 0 && op < dataList.size()) {
            showItem(dataList.get(op));
        } else {
            ConsoleUIHelper.showMessageAndWait("Item inválido, por favor informe um item válido!", 10);
            ConsoleUIHelper.clearScreen();
        }
    }

    protected abstract void showItem(T item);

    protected abstract void addItem();

    private void nextPage() {

    }

    private void previousPage() {

    }

    ;
}
