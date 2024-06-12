package LPA2;
import java.util.Scanner;

public class RepeticaoATV4v2 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int soma = 0;
		        int i = 0;
		        while (i < 10) {
		            System.out.println("insira um valor " + (i + 1) + ":");
		            soma += scanner.nextInt();
		            i++;
		        }
		        System.out.println("a soma dos valores é: " + soma);
		    }
		}
	


