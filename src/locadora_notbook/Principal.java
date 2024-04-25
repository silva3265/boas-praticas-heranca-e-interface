package locadora_notbook;

public class Principal {

	public static void main(String[] args) {
		Notebook notebook = new Notebook("Macbook Pro i7 16gb", 5, 100);
		Precificacao precificacao = new PrecificacaoPorHora();
		Seguro seguro = new SeguroItau(); // Não podemos instanciar a interface 'Seguro', por isso devemos instanciar de
											// uma classe concreta que implementa a interface 'Seguro'

		Locacao locacao = new Locacao(notebook, precificacao, seguro);
		double valorDevido = locacao.calcularValorDevido(10);

		System.out.printf("Valor a pagar: R$%.2f%n", valorDevido);
	}

}