package laçosdescisão;

import java.util.Scanner;

public class laçodescisão2 {

	public static void main(String[] args) {
		
		int num;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu número: ");
		num = leia.nextInt();
		
		if(num % 2 == 0) {
		System.out.println("\nO numero" +num+"é par ...");
		}else {
			System.out.println("\nO numero" +num+"é impar ...");
		}
		
		if (num > 0) {
			System.out.println("Valor é positivo ");
		}else if (num < 0 ){
			System.out.println("Valor é negatio ");
		}
		
		

	}

}
