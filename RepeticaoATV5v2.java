package LPA2;
import java.util.Scanner;
public class RepeticaoATV5v2 {

	public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);
		    int somaIdades = 0;
		    int contador = 0;

		    while (contador < 20) {
		      System.out.print("insira as idades " + (contador + 1) + ": ");
		      int idade = scanner.nextInt();
		      somaIdades += idade;
		      contador++;
		    }

		    System.out.println("A soma das idades é: " + somaIdades);
		  }
		}

	


