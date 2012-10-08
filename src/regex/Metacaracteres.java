package regex;

/**
 * METACARACTERES 
 * 	. 		qualquer caracter 
 * 	\d		dígitos 			[0-9] 
 * 	\D 		não é digito 		[^0-9] 
 * 	\s 		espaços 			[ \t\n\x0B\f\r] 
 * 	\S 		não é espaço 		[^\s] 
 * 	\w 		letra 				[a-zA-Z_0-9] 
 * 	\W 		não é letra
 * 
 * @author Leonardo
 * 
 */
public class Metacaracteres {

	public static void main(String[] args) {
		
		boolean b;
		
		// verificar se é um caracter
		b = "@".matches(".");
		System.out.println("Metacaracteres 1: " + b);
		
		// verificar se é um numero
		b = "2".matches("\\d");
		System.out.println("Metacaracteres 2: " + b);
		
		// verificar se é uma letra
		b = "a".matches("\\w");
		System.out.println("Metacaracteres 3: " + b);
		
		// verificar se é um espaço
		b = " ".matches("\\s");
		System.out.println("Metacaracteres 4: " + b);
		
		// verificar se tem 3 caracteres
		b = "Leo".matches("...");
		System.out.println("Metacaracteres 5: " + b);
		
		// verificar se tem 2 numero
		b = "99".matches("\\d\\d");
		System.out.println("Metacaracteres 6: " + b);
		
		// verificar se o texto tem uma formatacao de um CEP
		String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
		b = "87225-000".matches(cep);
	}
}
