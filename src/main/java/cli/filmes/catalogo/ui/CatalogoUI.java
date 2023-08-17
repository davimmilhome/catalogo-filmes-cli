package main.java.cli.filmes.catalogo.ui;

import main.java.cli.filmes.catalogo.models.Filme;


public class CatalogoUI extends PagedListUI<Filme> {
    public CatalogoUI(PagedList<Filme> pageSource) {
        super("Catálogo de Filmes", pageSource);
    }


//    protected void showItem(Filme item) {
//        FilmeUI ui = new FilmeUI("", item, new EditItemCallback<Filme>() {
//            @Override
//            public void remove(Filme item) {
//
//            }
//
//            @Override
//            public void add(Filme item) {
//
//            }
//
//            @Override
//            public boolean isNew(Filme item) {
//                return false;
//            }
//        });
//        ui.show();
//    }


    protected void addItem() {
    }

}
