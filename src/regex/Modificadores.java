package regex;

/**
 * MODIFICADORES 
 * (?i), Ignora maiúscula e minúscula 
 * (?x), Comentário 
 * (?m), Multilinhas 
 * (?s), Dottal
 * 
 * @author Leonardo
 */
public class Modificadores {

	public static void main(String[] args) {
		
		// procurar java no texto, onde o padrao ignora maiusculas ou minusculas
		boolean b = "Java".matches("(?i)java");
		System.out.println("Modificadores: " + b);

	}

}
