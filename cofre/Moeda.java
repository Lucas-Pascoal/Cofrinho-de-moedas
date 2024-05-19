package cofre;

//Classe Mãe abastrata para servir de molde para as outras classes de moedas.
public abstract class Moeda {

	double valor;
	
	public abstract void info();//Método para exibir a informação da moeda selecionada
	
	public abstract double converter();//Método para converter e exibir o valor em real
	
}
