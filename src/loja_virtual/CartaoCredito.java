package loja_virtual;

public class CartaoCredito implements MetodoPagamento {

    private final String numero;

    public CartaoCredito(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public void pagar(double valor) {
        if (!numero.startsWith("123")) { // se o numero nao começar com 123, retorna a mensagem "Pagamento Negado"
            throw new RuntimeException("Pagamento negado");
        }

        System.out.printf("Pagamento de R$%.2f realizado. Cartão de crédito %s%n",
                valor, getNumero());
    }

}