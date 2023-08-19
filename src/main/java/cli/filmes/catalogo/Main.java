package main.java.cli.filmes.catalogo;

import main.java.cli.filmes.catalogo.models.Filme;
import main.java.cli.filmes.catalogo.ui.CatalogoUI;
import main.java.cli.filmes.catalogo.ui.EditItemCallback;
import main.java.cli.filmes.catalogo.ui.TemplateUI;
import main.java.cli.filmes.catalogo.utils.MainTest;

import java.util.ArrayList;

public class Main {
    public static void main (String[] args) {

        ArrayList<Filme> filmes = new ArrayList<>();
        filmes = MainTest.dataLoader();

        Catalogo catalogo = new Catalogo();

        for (int i = 0; i < filmes.size(); i++) {
            catalogo.adicionarFilme(filmes.get(i));
        }

        TemplateUI ui = new CatalogoUI(catalogo, new EditItemCallback<>() {
            @Override
            public void remove(Filme item) {
                System.out.println(item.getNomeFilme());
            }

            @Override
            public void add(Filme item) {
                catalogo.adicionarFilme(item);
            }

            @Override
            public boolean isNew(Filme ref) {
                return ref.isNovo();
            }
        });
        ui.show();
    }
}
