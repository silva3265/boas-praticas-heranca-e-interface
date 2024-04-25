package locadora;

public class LocacaoPorDia extends Locacao {

    public LocacaoPorDia(Notebook notebook) {
        super(notebook);
    }

    @Override
    public double calcularValorDevido(int horasUtilizadas) {
        double dias = Math.ceil(horasUtilizadas / 24d); //Math.ceil - esta arredondando pra cima (Converter de horas e virar dia)
        return getNotebook().getPrecoPorDia() * dias;
    }

}