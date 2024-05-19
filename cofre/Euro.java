package cofre;

public class Euro extends Moeda {

	//Método construtor chamado Euro que vai receber o valor inserido pelo usuário.
		public Euro(double valor) {
			this.valor = valor; // este valor irá receber o valor da outra classe
		}
		
		@Override
		public void info() {
			System.out.println("Euro - " + valor);
			
		}

		@Override
		public double converter() {
			return this.valor * 5.4; // cotação do Euro dia 30/03/2024
		}
		
		@Override //método que ajuda a remover moedas que tenham a mesma quantidade dentro da lista de moedas
		public boolean equals(Object objeto) {
			if (this.getClass() != objeto.getClass()) {
				return false;
			}
			
			Euro objetoDeEuro = (Euro) objeto;
			
			if (this.valor != objetoDeEuro.valor) {
				return false;
			}
			return true;
		}
	}
