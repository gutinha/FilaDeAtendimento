package fila;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Fila<Integer> fila = new Fila<Integer>();	
		int opcao = 1;
		int contador =0;
		Scanner scan = new Scanner(System.in);
		
		while (opcao!= 0) {
			//Menu
			System.out.println("Fila de Atendimento");
			System.out.println("1- Tirar senha para o cliente");
			System.out.println("2- Chamar o pr�ximo da fila");
			System.out.println("3- Mostrar a fila de clientes");
			System.out.println("0- Sair do programa");
			opcao = scan.nextInt();
			
			switch (opcao) {
			case 1:
				contador = contador+1;
				fila.insert(contador);
				break;
			case 2:
				//Tratamento caso a fila esteja vazia
				if (fila.firstItem() == null) {
					System.out.println("N�o tem mais ningu�m na fila. Finalizando programa...");
					opcao = 0;
					break;
				}
				//Imprime a senha a ser chamada e remove a mesma
				System.out.println("Pr�xima senha da fila � "+fila.firstItem());
				fila.remove();
				break;
			case 3:
				fila.printData();
				break;
			default:
				opcao = 0;
				break;
			}
		}
		scan.close();
	}

}
