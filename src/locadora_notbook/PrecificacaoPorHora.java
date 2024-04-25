package locadora_notbook;

public class PrecificacaoPorHora implements Precificacao {

    @Override
    public double calcularValorTotal(Notebook notebook, int horasUtilizadas) {
        return notebook.getPrecoPorHora() * horasUtilizadas;
    }

}
