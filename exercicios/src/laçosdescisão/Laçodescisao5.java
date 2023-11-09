package laçosdescisão;

import java.util.Scanner;

public class Laçodescisao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int op;
		float salario ;
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Gerente");
		System.out.println("Vendedor");
		System.out.println("Supervisor");
		System.out.println("Motorista");
		System.out.println("Estoquista");
		System.out.println("Técnico de TI");
		
		op = leia.nextInt();
		
		System.out.println("Qual nome do colaborador ");
		nome = leia.next();
		
		System.out.println("Qual valor do salario ");
		salario = leia.nextFloat();
		
		
		switch (op) {
		case 1:
			System.out.println(salario + (0.10 * salario) );
			System.out.println("Gerente" );
			break;
		case 2:
			System.out.println(salario + (0.07 *salario ));
			System.out.println("Vendedor" );

			break;
		case 3:
			System.out.println(salario + (0.09 *salario) );
			System.out.println("Supervisor" );
			
		case 4:
			System.out.println(salario + (12.00 *salario ));
			System.out.println("Motorista" );
		case 5:
			System.out.println(salario + (0.06 *salario ));
			System.out.println("Estoquista" );
			break;
		case 6:
			System.out.println(salario + (0.05 *salario ));
			System.out.println("Estoquista" );
		default:
			System.out.println("Invalido" );
			
		}

	}

	}


