package LPA2;
import java.util.Scanner;
public class repeticaoATV7 {

	public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);
		    int contadorMaiores = 0;

		    for (int i = 0; i < 20; i++) {
		      System.out.print("insira as Idades" + (i + 1) + ": ");
		      int idade = scanner.nextInt();

		      if (idade >= 18) {
		        contadorMaiores++;
		      }
		    }

		    System.out.println("Quantas pessoas são maiores de idade: " + contadorMaiores);
		  }
		}

	


