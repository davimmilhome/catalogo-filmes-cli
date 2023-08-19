package main.java.cli.filmes.catalogo.ui;

import main.java.cli.filmes.catalogo.models.Filme;


public class CatalogoUI extends PagedListUI<Filme> {
    private final EditItemCallback<Filme> callBack;


    public CatalogoUI(PagedList<Filme> pageSource, EditItemCallback<Filme> callBack) {
        super("Catálogo de Filmes", pageSource);
        this.callBack = callBack;
    }


    protected void showItem(Filme item) {
        FilmeUI ui = new FilmeUI("", item, callBack);
        ui.show();
    }

    protected void addItem() {
        Filme f1 = new Filme("Teste");
        FilmeUI ui = new FilmeUI("Novo Filme", f1, callBack);
        ui.show();
    }

}
