package main.java.cli.filmes.catalogo.ui;

import main.java.cli.filmes.catalogo.models.Filme;


public class CatalogoUI extends PagedListUI<Filme> {
    public CatalogoUI(PagedList<Filme> pageSource) {
        super("Catálogo de Filmes", pageSource);
    }


    protected void showItem(Filme item) {
        FilmeUI ui = new FilmeUI("", item, new EditItemCallback<Filme>() {
            @Override
            public void remove(Filme item) {

            }

            @Override
            public void add(Filme item) {

            }

            @Override
            public boolean isNew(Filme ref) {
                if (ref.equals(item)) {
                    return false;
                } else {
                    return true;
                }
            }
        });
        ui.show();
    }

    protected void addItem() {
        Filme f1 = new Filme("Teste");
        FilmeUI ui = new FilmeUI("Novo Filme", f1, new EditItemCallback<>() {
            @Override
            public void remove(Filme item) {
                System.out.println(item.getNomeFilme());
            }

            @Override
            public void add(Filme item) {
                System.out.println(item.getNomeFilme());
            }

            @Override
            public boolean isNew(Filme ref) {
                if (ref.equals(f1)) {
                    return false;
                } else {
                    return true;
                }
            }
        });
        ui.show();
    }

}
