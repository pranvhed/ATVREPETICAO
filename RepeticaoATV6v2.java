package LPA2;
import java.util.Scanner;
public class RepeticaoATV6v2 {

	public static void main(String[] args) {
		
		    Scanner scanner = new Scanner(System.in);
		    int somaIdades = 0;
		    int contador = 0;

		    while (contador < 20) {
		      System.out.print("insira as Idades " + (contador + 1) + ": ");
		      int idade = scanner.nextInt();
		      somaIdades += idade;
		      contador++;
		    }

		    double mediaIdades = (double) somaIdades / 20;
		    System.out.println("A média das idades é: " + mediaIdades);
		  }
		}

	


