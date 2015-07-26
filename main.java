import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String expresion = teclado.nextLine();
		postfix post = new postfix();
		double resultado = post.evaluar(expresion);
		
		System.out.println(resultado);	
		
		
	}
		
}
