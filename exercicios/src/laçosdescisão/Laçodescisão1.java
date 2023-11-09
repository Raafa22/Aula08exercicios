package laçosdescisão;

import java.util.Scanner;

public class Laçodescisão1 {

	public static void main(String[] args) {
		
		int a,b,c,soma;
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite valor de a: ");
		a = leia.nextInt();
		
		System.out.println("Digite valor de b: ");
		b = leia.nextInt();
		
		System.out.println("Digite valor de c: ");
		c = leia.nextInt();
		
		soma = a+b;
		
		if(soma > c ) {
			System.out.println("A Soma de A + B é Maior do que C ");
		}else if (soma < c  ) {
			System.out.println("A Soma de A + B é Menor do que C ");
		}else if(soma == c){
			System.out.println("A Soma de A + B é Igual do que C ");
		}
		
		

	}

}
