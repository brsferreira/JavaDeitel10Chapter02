package capitulo_02;

import java.util.Scanner;

public abstract class ScannerClass {
	
	public static int Scan() {
		
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		sc.close();
		return input;
	}
	

}
