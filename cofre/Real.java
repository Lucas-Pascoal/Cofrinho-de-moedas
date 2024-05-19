package cofre;

public class Real extends Moeda {
	
	//Método construtor chamado real que vai receber o valor
	public Real(double valor) {
		this.valor = valor; // este valo irá receber o valor da outra classe
	}

	@Override
	public void info() {
		System.out.println("Real - " + valor);
	}

	@Override
	public double converter() {
		return this.valor;
		
	}
	
	@Override //método que ajuda a remover moedas que tenham a mesma quantidade dentro da lista de moedas
	public boolean equals(Object objeto) {
		if (this.getClass() != objeto.getClass()) {
			return false;
		}
		
		Real objetoDeReal = (Real) objeto;
		
		if (this.valor != objetoDeReal.valor) {
			return false;
		}
		return true;
	}
	
	
	
}
