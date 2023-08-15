package main.java.cli.filmes.catalogo.models;

import main.java.cli.filmes.catalogo.enums.TipoFilme;
import java.math.BigDecimal;
import java.util.List;

public class Filme {
 TipoFilme tipoFilme;
 protected String nomeFilme;
 protected String dataLancamento;
 protected String sinopse;
 protected Diretor diretor;
 protected List<Ator> ator;

 protected BigDecimal orcamento;

    public Filme(TipoFilme tipoFilme, String nomeFilme, String dataLancamento, String sinopse, Diretor diretor, List<Ator> ator, BigDecimal orcamento) {
        this.tipoFilme = tipoFilme;
        this.nomeFilme = nomeFilme;
        this.dataLancamento = dataLancamento;
        this.sinopse = sinopse;
        this.diretor = diretor;
        this.ator = ator;
        this.orcamento = orcamento;
    }

    public TipoFilme getTipoFilme() {
        return tipoFilme;
    }

    public void setTipoFilme(TipoFilme tipoFilme) {
        this.tipoFilme = tipoFilme;
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(String dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public Diretor getDiretor() {
        return diretor;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public List<Ator> getAtor() {
        return ator;
    }

    public void setAtor(List<Ator> ator) {
        this.ator = ator;
    }

    public BigDecimal getOrcamento() {
        return orcamento;
    }

    public void setOrcamento(BigDecimal orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public String toString() {
        return "Filme{" +
                "tipoFilme=" + tipoFilme +
                ", nomeFilme='" + nomeFilme + '\'' +
                ", dataLancamento='" + dataLancamento + '\'' +
                ", sinopse='" + sinopse + '\'' +
                ", diretor=" + diretor +
                ", ator=" + ator +
                ", orcamento=" + orcamento +
                '}';
    }
}
