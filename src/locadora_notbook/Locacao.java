package locadora_notbook;

import java.util.Objects;

public class Locacao {

    private Notebook notebook; // Locação 'tem um' notbook
    private Precificacao precificacao; // Locação 'tem uma' precificacao
    private Seguro seguro; // Locação 'tem um' seguro

    public Locacao(Notebook notebook, Precificacao precificacao) {
        Objects.requireNonNull(notebook);
        Objects.requireNonNull(precificacao);

        this.notebook = notebook;
        this.precificacao = precificacao;
    }

    public Locacao(Notebook notebook, Precificacao precificacao, Seguro seguro) {
        this(notebook, precificacao);
        this.seguro = seguro;
    }

    public Notebook getNotebook() {
        return notebook;
    }

    public Precificacao getPrecificacao() {
        return precificacao;
    }

    public Seguro getSeguro() {
        return seguro;
    }

    public boolean temSeguro() {
        return getSeguro() != null;
    }

    public double calcularValorDevido(int horasUtilizadas) {
        double valorTotal = getPrecificacao()
                .calcularValorTotal(getNotebook(), horasUtilizadas);

        if (temSeguro()) {
            valorTotal += getSeguro().calcularPremio(horasUtilizadas, valorTotal);
        }

        return valorTotal;
    }

}