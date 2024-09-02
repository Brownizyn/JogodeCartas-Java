package br.com.matheus.cartas;

public class CartasPoker {
	public class CartaDePoker extends Cartas {
	    // Construtor que simplesmente repassa naipe e valor para o construtor da classe base.
	    public CartaDePoker(String naipe, String valor) {
	        super(naipe, valor);
	    }

	    // Implementação do método abstrato para exibir informações específicas de uma carta de poker.
	    @Override
	    public void mostrarInformacoes() {
	        System.out.println("Carta de Poker - Naipe: " + getNaipe() + ", Valor: " + getValor());
	    }
	}
}
