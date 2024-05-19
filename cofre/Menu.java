package cofre;

import java.util.Scanner;

public class Menu {
	
	//Criando Atributos para o scanner e pro cofrinho.
	private Scanner sc;
	private Cofrinho cofrinho;
	
	//Método construtor para facilitar o uso dos métodos
	public Menu() {
		sc = new Scanner(System.in);
		cofrinho = new Cofrinho();
	}
	
	//método para mostrar o Menu e facilitar o uso na classe principal.
	public void mostrarMenu() {
		
		System.out.println("-----Menu-----");
		System.out.println("1 - Adicionar");
		System.out.println("2 - Remover");
		System.out.println("3 - Listar moedas");
		System.out.println("4 - Mostrar valor total em reais");
		System.out.println("0 - Encerrar");
		System.out.println("---------------");
		
		String opcao = sc.next();
		
		switch (opcao) {
		
		case "1":
			System.out.println("Escolha a moeda que vai adicionar:");
			System.out.println("1 - Real");
			System.out.println("2 - Dolar");
			System.out.println("3 - Euro");
			
			int respostaMoeda = sc.nextInt(); 
			
			System.out.println("Digite o valor");
			double respostaValor = sc.nextDouble();
			
			Moeda moeda = null;
			
			if(respostaMoeda == 1) {
				moeda = new Real(respostaValor);
			} else if(respostaMoeda == 2) {
				moeda = new Dolar(respostaValor);
			} else if(respostaMoeda == 3) {
				moeda = new Euro(respostaValor);
			} else {
				System.out.println("Opcção inválida");
				mostrarMenu();
			}
			
			cofrinho.adicionar(moeda);
			System.out.println("Moeda Adicionada.");
			
			mostrarMenu();
			break;
			
			
		case "2":
			System.out.println("Escolha a moeda que vai adicionar:");
			System.out.println("1 - Real");
			System.out.println("2 - Dolar");
			System.out.println("3 - Euro");
			
			int respostaMoed = sc.nextInt(); 
			
			System.out.println("Digite o valor");
			double respostaValo = sc.nextDouble();
			
			Moeda moed = null;
			
			if(respostaMoed == 1) {
				moed = new Real(respostaValo);
			} else if(respostaMoed == 2) {
				moed = new Dolar(respostaValo);
			} else if(respostaMoed == 3) {
				moed = new Euro(respostaValo);
			} else {
				System.out.println("Opcção inválida");
				mostrarMenu();
			}
			
			boolean removeuMoeda = cofrinho.remover(moed);
			
			if(removeuMoeda) {
			System.out.println("Moeda Removida.");
			} else {
				System.out.println("Não tem uma moeda dessas no cofre.");
			}
			mostrarMenu();
			
			break;
		
			
		case "3":
			cofrinho.listagemMoedas();
			mostrarMenu();
			break;
			
			
		case "4":
			double valorTotalConvertido = cofrinho.totalConvertido();
			System.out.println("Valor total convertido em real: " + valorTotalConvertido );
			mostrarMenu();
			break;
			
		case "0":
			System.out.println("Encerrando o sistema, obrigado e volte sempre.");
			break;
			
			
		default:
			System.out.println("Opção Invalida");
			mostrarMenu();
			break;
			
		}
	}

}
