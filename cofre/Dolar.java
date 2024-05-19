package cofre;

public class Dolar extends Moeda {

	//Método construtor chamado Dolar que vai receber o valor inserido pelo usuário.
	public Dolar(double valor) {
		this.valor = valor; // este valor irá receber o valor da outra classe
	}
	
	@Override
	public void info() {
		System.out.println("Dolar - " + valor);
		
	}

	@Override
	public double converter() {
		return this.valor * 5.2; // Cotação atual do Dolar 30/03/2024
	}
	
	@Override //método que ajuda a remover moedas que tenham a mesma quantidade dentro da lista de moedas
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Dolar objetoDeDolar = (Dolar) objeto;
		
		if (this.valor != objetoDeDolar.valor) {
			return false;
		}
		return true;
	}

}
