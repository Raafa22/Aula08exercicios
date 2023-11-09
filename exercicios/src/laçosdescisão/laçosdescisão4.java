package laçosdescisão;

import java.util.Scanner;

public class laçosdescisão4 {

	public static void main(String[] args) {
		
		int op;
		int quantidade ;
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Cachorro Quente");
		System.out.println("X-Salada");
		System.out.println("X-Bacon");
		System.out.println("Bauru");
		System.out.println("Refrigerante");
		System.out.println("Suco de laranja");
		
		op = leia.nextInt();
		
		System.out.println("Qual a quantidade");
		quantidade = leia.nextInt();
		
		switch (op) {
		case 1:
			System.out.println(10.00 *quantidade );
			System.out.println("Cachorro Quente" );
			break;
		case 2:
			System.out.println(15.00 *quantidade );
			System.out.println("X-Salada" );

			break;
		case 3:
			System.out.println(18.00 *quantidade );
			System.out.println("X-Bacon" );
			
		case 4:
			System.out.println(12.00 *quantidade );
			System.out.println("Bauru" );
		case 5:
			System.out.println(08.00 *quantidade );
			System.out.println("refrigerante" );
			break;
		case 6:
			System.out.println(15.00 *quantidade );
			System.out.println("X-Salada" );
		default:
			System.out.println(13.00 *quantidade );
			System.out.println("Suco de laranja" );
		}

	}

}
