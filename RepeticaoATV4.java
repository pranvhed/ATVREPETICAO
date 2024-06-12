package LPA2;
import java.util.Scanner;
public class RepeticaoATV4 {

	public static void main(String[] args) {
		
		        Scanner scanner = new Scanner(System.in);
		        int soma = 0;
		        for (int i = 0; i < 10; i++) {
		            System.out.println("insira um valor " + (i + 1) + ":");
		            soma += scanner.nextInt();
		        }
		        System.out.println("a soma dos 10 valores é: " + soma);
		    }
}

	


