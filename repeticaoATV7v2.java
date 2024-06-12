package LPA2;
import java.util.Scanner;
public class repeticaoATV7v2 {

	public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);
		    int contadorMaiores = 0;
		    int contador = 0;

		    while (contador < 20) {
		      System.out.print("Insira as Idades" + (contador + 1) + ": ");
		      int idade = scanner.nextInt();

		      if (idade >= 18) {
		        contadorMaiores++;
		      }

		      contador++;
		    }

		    System.out.println("Quantas pessoas são maiores de idade: " + contadorMaiores);
		  }
		}
	


