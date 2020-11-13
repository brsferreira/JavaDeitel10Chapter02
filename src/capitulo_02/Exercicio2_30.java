package capitulo_02;

import java.util.Scanner;

/*2.30 (Separando os d�gitos em um inteiro) Escreva um aplicativo que insira um n�mero consistindo em cinco d�gitos a partir do usu�rio, 
separe o n�mero em seus d�gitos individuais e imprima os d�gitos separados uns dos outros por tr�s espa�os. Por exemplo, se o usu�rio 
digitar o n�mero 42339, o programa deve imprimir
4   2   3   3   9*/

public class Exercicio2_30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.printf("insira um n�mero de cinco digitos: ");
		int num = sc.nextInt();
		
		while(!(num > 9999 && num < 100000)) {
			System.out.printf("%nQuantidade de digitos inv�lidos. Insira o n�mero novamente: ");
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
