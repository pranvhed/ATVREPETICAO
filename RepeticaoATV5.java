package LPA2;
import java.util.Scanner;
public class RepeticaoATV5 {

	public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);
		    int somaIdades = 0;

		    for (int i = 0; i < 20; i++) {
		      System.out.print("insira as idades " + (i + 1) + ": ");
		      int idade = scanner.nextInt();
		      somaIdades += idade;
		    }

		    System.out.println("A soma das idades é: " + somaIdades);
		  }
		}

