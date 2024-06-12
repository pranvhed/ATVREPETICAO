package LPA2;

import java.util.Scanner;

public class RepetiçaoATV3 {

	public static void main(String[] args) {
		
		Scanner ler= new Scanner (System.in);
		
		System.out.println("qual seu nome");
		String nome = ler.next();
		
		int repeticao =0;
		while(repeticao<10) {
			repeticao ++;
			System.out.println("seu nome é:"+nome);
		}
		ler.close();
	}
}
	  
				
