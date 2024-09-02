package br.com.matheus.cartas;

public class Cartas {
	    private String naipe; // Atributo privado para armazenar o naipe da carta.
	    private String valor; // Atributo privado para armazenar o valor da carta.

	    // Construtor para inicializar objetos Carta com naipe e valor.
	    public Carta(String naipe, String valor) {
	        this.naipe = naipe;
	        this.valor = valor;
	    }

	    // Método getter para obter o naipe da carta.
	    public String getNaipe() {
	        return naipe;
	    }

	    // Método getter para obter o valor da carta.
	    public String getValor() {
	        return valor;
	    }

	    // Método abstrato que será implementado por subclasses para mostrar informações da carta.
	    public abstract void mostrarInformacoes();
	}

}
