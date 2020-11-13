package capitulo_02;

import java.util.Scanner;

public class Capitulo2 {

	//2.3  Escreva instruções para realizar cada uma das tarefas a seguir:
	
	//a)  Declare que as variáveis c, thisIsAVariable, q76354 e number serão do tipo int.
	
	private int number;
	
	//b)  Solicite que o usuário insira um inteiro.
	
	public void solicitar() {
	
		System.out.print("Insira um numero inteiro: ");
		Scanner sc = new Scanner(System.in);
		this.number = sc.nextInt();
		System.out.printf("O numero inserido foi: %d", number);
		sc.close();
	}
	
	/*c)  Insira um inteiro e atribua o resultado à variável int value. Suponha que a variável Scanner input possa ser utilizada para ler 
	um valor digitado pelo usuário.*/
	
		//SIMILAR AO EXERCICO ANTERIOR.
	
	/*e)  Imprima “ThisisaJavaprogram" em duas linhas na janela de comando. A primeira deve terminar com Java. Utilize o m�todo 
	System.out.printf e dois especificadores de formato %s.*/
	
	public void imprimir() {
		
		String s1 = "ThisisaJava";
		String s2 = "program";
		System.out.printf("%s%n%s",s1, s2);
	}
	
	//f)  Se a variável number não for igual a 7, exiba “Thevariablenumberisnotequalto7".
	
	public void verificar() {
		
		System.out.printf("Insira o valor da variavel number: ");
		int input = ScannerClass.Scan();
		if(input != 7) 
			System.out.println("The variable number is not equal to 7");
		else
			System.out.println("Parabens! Voce inseriu o valor correto.");
	}
		
	//2.5 Escreva declarações, instruções ou comentários que realizem cada uma das tarefas a seguir:
	
	// a) Declare que um programa calculará o produto de três inteiros.	
		
		public void produto() {
			
			int produto =1;
			for(int i = 1; i <=3; ++i) {
				
				System.out.print("Insira o numero inteiro: ");
				this.number = ScannerClass.Scan();
				int aux = number;
				produto = produto*aux;
			}
			System.out.printf("Produto a x b x c = %d", produto );
		}//END produto()
		
		
	//QUESTOES PAGINA 51(86).
		
	//2.8 Escreva instruções Java que realizem cada uma das seguintes tarefas:	
	// a) Exibir a mensagem “Enter an integer:“, deixando o cursor na mesma linha.	
		
		public void exercicio28a() {
			System.out.print("Enter a integer: ");
		}
		
	// b) Atribuir o produto de variáveis b e c para a variável a.
		
		public void exercicio28b() {
			int a, b, c;
			System.out.print("insira o valor da variavel b: ");
			b = ScannerClass.Scan();
			System.out.print("Insira o valor da variavel c: ");
			c= ScannerClass.Scan();
			
			a = b*c; 
			System.out.printf("A variaver produto(a) = %d", a);
		}
	
	//2.10 Supondo que x=2 e y=3, o que cada uma das instruções a seguir exibe?
	//  a)	
		
		public void exercicio210() {
			int x =2; int y =3;
			
			System.out.printf("x = %d%n", x);
			System.out.printf("Value of %d + %d is %d%n", x, x, (x + x));
			System.out.printf("x =%n");
			System.out.printf("%d = %d%n", (x + y), (y + x));
		}
}//END CLASS
