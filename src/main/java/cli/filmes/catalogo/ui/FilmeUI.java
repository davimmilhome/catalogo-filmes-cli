package main.java.cli.filmes.catalogo.ui;


import main.java.cli.filmes.catalogo.enums.TipoFilme;
import main.java.cli.filmes.catalogo.models.Ator;
import main.java.cli.filmes.catalogo.models.Diretor;
import main.java.cli.filmes.catalogo.models.Filme;
import main.java.cli.filmes.catalogo.utils.ConsoleUIHelper;

import java.math.BigDecimal;
import java.time.LocalDate;

public class FilmeUI extends EditItemUI<Filme> {

    public FilmeUI(String title, Filme item, EditItemCallback<Filme> editItemCallback) {
        super(title, item, editItemCallback);
    }

    @Override
    public int drawItemDetails() {
        ConsoleUIHelper.drawWithRightPadding("Tipo: " + item.getTipoFilme(), cols, ' ');
        ConsoleUIHelper.drawWithRightPadding("Nome do Filme: " +
                item.getNomeFilme(), cols, ' ');
        ConsoleUIHelper.drawWithRightPadding("Data de lançamento: " + item.getDataLancamento(), cols, ' ');
        ConsoleUIHelper.drawWithRightPadding("Sinopse: " + item.getSinopse(), cols, ' ');
        ConsoleUIHelper.drawWithRightPadding("Diretor: " + item.getDiretor(), cols, ' ');
        ConsoleUIHelper.drawWithRightPadding("Atores: " + item.getAtor(), cols, ' ');
        ConsoleUIHelper.drawWithRightPadding("Orçamento: " + item.getOrcamento(), cols, ' ');
        return 7;
    }

    @Override
    public String[] fillFieldsNames() {
        return new String[]{"Tipo", "Nome", "Data de lançamento", "Sinopse", "Diretor", "Atores", "Orçamento"};
    }

    @Override
    public void fillField(Filme item, int option) {
        switch (option) {
            case 0:
                break;
            case 1:
                String nome = ConsoleUIHelper.askSimpleInput(
                        "Informe o nome do Filme: ");
                item.setNomeFilme(nome);
                break;
            case 2:
                String dataDeLancamento = ConsoleUIHelper.askSimpleInput("Informe a Data de Lançamento: ");
                item.setDataLancamento(dataDeLancamento);
                break;
            case 3:
                String sinopse = ConsoleUIHelper.askSimpleInput("Informe a sinopse: ");
                item.setSinopse(sinopse);
                break;
            case 4:
                String nomeDiretor = ConsoleUIHelper.askSimpleInput("Informe o primeiro nome diretor: ");
                String sobrenomeDiretor = ConsoleUIHelper.askSimpleInput("Informe o sobrenome diretor: ");
                String nacionalidade = ConsoleUIHelper.askSimpleInput("Informe a nacionalidade diretor: ");
                LocalDate dob = LocalDate.parse(ConsoleUIHelper.askSimpleInput("Informe a data de aniversario do diretor: "));
                Diretor diretor = new Diretor(nomeDiretor, sobrenomeDiretor, dob, nacionalidade);
                item.setDiretor(diretor);
                break;
//            case 5:
//                String ator = ConsoleUIHelper.askSimpleInput("Adicione um ator: ");
//                item.setAtor(ator);
//                break;
            case 6:
                String orcamento = ConsoleUIHelper.askSimpleInput("Informe o Orçamento: ");
                item.setOrcamento(new BigDecimal(orcamento));
                break;
        }

    }

    @Override
    protected void newItem() {
        Filme newFilme = new Filme("Teste");
        newFilme.setTipoFilme(TipoFilme.ACAO);
        FilmeUI ui = new FilmeUI(title + " :: Novo", newFilme, editItemCallback);
        ui.show();
    }
}
