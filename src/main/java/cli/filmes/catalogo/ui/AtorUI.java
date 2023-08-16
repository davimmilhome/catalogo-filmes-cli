package main.java.cli.filmes.catalogo.ui;

import main.java.cli.filmes.catalogo.models.Ator;
import main.java.cli.filmes.catalogo.utils.ConsoleUIHelper;

import java.time.LocalDate;

public class AtorUI extends EditItemUI<Ator> {

    public AtorUI(String title, Ator item, EditItemCallback<Ator> editItemCallback) {
        super(title, item, editItemCallback);
    }

    @Override
    public int drawItemDetails() {
        ConsoleUIHelper.drawWithRightPadding("Nome: " +
                item.getNome(), cols, ' ');
        ConsoleUIHelper.drawWithRightPadding("Sobrenome: " + item.getSobrenome(), cols, ' ');
        ConsoleUIHelper.drawWithRightPadding("Data de nascimento: " + item.getDob(), cols, ' ');
        ConsoleUIHelper.drawWithRightPadding("Idade: " + item.getIdade(), cols, ' ');
        ConsoleUIHelper.drawWithRightPadding("Nacionalidade: " + item.getNacionalidade(), cols, ' ');
        return 5;
    }

    @Override
    public String[] fillFieldsNames() {
        return new String[]{"Nome", "Sobrenome", "Data de nascimento", "Idade", "Nacionalidade"};
    }

    @Override
    public void fillField(Ator item, int option) {
        switch (option) {
            case 0:
                break;
            case 1:
                String nome = ConsoleUIHelper.askSimpleInput(
                        "Informe o nome: ");
                item.setNome(nome);
                break;
            case 2:
                String sobrenome = ConsoleUIHelper.askSimpleInput("Informe o sobrenome: ");
                item.setSobrenome(sobrenome);
                break;
            case 3:
                LocalDate dob = LocalDate.parse(ConsoleUIHelper.askSimpleInput("Informe a data de nascimento: "));
                item.setDob(dob);
                break;
            case 4:
                String nacionalidade = ConsoleUIHelper.askSimpleInput("Informe a nacionalidade: ");
                item.setNacionalidade(nacionalidade);
                break;

        }

    }

    @Override
    protected void newItem() {
        Ator ator = null;
        AtorUI ui = new AtorUI(title + " :: Novo", null, editItemCallback);
        ui.show();
    }
}
