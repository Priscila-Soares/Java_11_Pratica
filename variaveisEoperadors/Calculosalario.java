package variaveisEoperadors;

import java.util.Scanner;

public class Calculosalario {
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		float salario, abono, novoSalario;
		
		System.out.print("Digite o salário: ");
		salario = leitor.nextFloat();
		
		System.out.print("Digite o abono: ");
		abono = leitor.nextFloat();
		
		novoSalario = salario + abono;
		
		System.out.println("Novo salário: " + novoSalario);
		
		leitor.close();


}

	
	}

