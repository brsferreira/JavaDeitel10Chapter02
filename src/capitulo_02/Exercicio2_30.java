package capitulo_02;

import java.util.Scanner;

/*2.30 (Separando os dígitos em um inteiro) Escreva um aplicativo que insira um número consistindo em cinco dígitos a partir do usuário, 
separe o número em seus dígitos individuais e imprima os dígitos separados uns dos outros por três espaços. Por exemplo, se o usuário 
digitar o número 42339, o programa deve imprimir
4   2   3   3   9*/

public class Exercicio2_30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("insira um número de cinco digitos: ");
		int num = sc.nextInt();
		
		while(!(num > 9999 && num < 100000)) {
			System.out.printf("%nQuantidade de digitos inválidos. Insira o número novamente: ");
			num = sc.nextInt();
		}
		
		int divisor = 1;
		String resultado = " ";
		
		while(num/divisor > 0) {
			divisor *= 10;
			int digito = num % divisor;
			resultado = ((digito)/(divisor/10) + " " + resultado);
		}
		
		System.out.println(resultado);
	
		sc.close();
	}//end main
}//end class
