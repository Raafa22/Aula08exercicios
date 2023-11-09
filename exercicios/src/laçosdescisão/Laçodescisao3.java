package laçosdescisão;

import java.util.Scanner;

public class Laçodescisao3 {

	public static void main(String[] args) {
		
		String nome;
		int idade;
		boolean primeiraDoacao ;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = leia.next();
		
		System.out.println("Digite sua idade ");
		idade = leia.nextInt();
		
		System.out.println("Primeira doação de sangue? (true/false)");
        primeiraDoacao = leia.nextBoolean();
        

        boolean apto = true;

        if (idade < 18 || idade > 69) {
            apto = false;
        } else if (idade >= 60 && primeiraDoacao) {
            apto = false;
        }

      
        if (apto) {
            System.out.println(nome + " está apto para doar sangue!");
        } else {
            System.out.println(nome + " não está apto para doar sangue!");
        }
    }

		
		
		

	}

