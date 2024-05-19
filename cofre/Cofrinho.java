package cofre;

import java.util.ArrayList;

public class Cofrinho {
	
	private ArrayList<Moeda> listaMoedas;
	
	//Método construtor para criar uma lista das moedas vazia no cofrinho
	public Cofrinho() {
		this.listaMoedas = new ArrayList<>();		
	}
	
	
	//Método que irá adicionar uma moeda ao Array 'ListaMoedas'.
	public void adicionar(Moeda moeda) {
		this.listaMoedas.add(moeda);
		}
	
	
	//método que irá remover uma moeda do Array.
	public boolean remover(Moeda moeda) {
		return this.listaMoedas.remove(moeda);
	}
	
	//Método que irá listar cada moeda dentro do array 'listaMoedas', independente de ser real, dolar ou euro
	public void listagemMoedas() {
		
		if(this.listaMoedas.isEmpty()) {
			System.out.println("O cofrinho está vazio.");
			return;
		}
		for(Moeda moeda: this.listaMoedas) {
			moeda.info();
		}
	}

	
	public double totalConvertido() {
		//Caso a lista de moedas esteja vazia, retornará nada
		if (this.listaMoedas.isEmpty()) {
			return 0;
		}
		
		//Caso a lista de moedas tenha algum valor, o looping irá somar todos os valores acumulados e passar para a nova variável.
		double valorAcumulado = 0;
		
		for(Moeda moeda: this.listaMoedas) {
			valorAcumulado = valorAcumulado + moeda.converter();
		}
		return valorAcumulado;
	}
}
