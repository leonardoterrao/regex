package regex;

/**
 * AGRUPADORES 
 * [...] 			Agrupamento 
 * [a-z] 			Alcance 
 * [a-e][i-u] 		União 
 * [a-z&&[aeiou]] 	Interseção 
 * [^abc] 			Exceção 
 * [a-z&&[^m-p]] 	Subtracao 
 * \x 				Fuga literal
 * 
 * @author Leonardo
 * 
 */
public class Agrupadores {

	public static void main(String[] args) {

		boolean b;
		
		// procurar por letra x
		b = "x".matches("[a-z]");
		System.out.println("Agrupadores 1: " + b);

		// procurar por letra x
		b = "3".matches("[1-9]");
		System.out.println("Agrupadores 2: " + b);

		// verificar se True foi escrito correto iniciando com T ou t
		b = "true".matches("[tT]rue");
		System.out.println("Agrupadores 3: " + b);
		b = "True".matches("[tT]rue");
		System.out.println("Agrupadores 4: " + b);

		// verificar se foi escrito Tre ou Yes onde a primeira letra possa ser
		// maiuscula ou minuscula
		b = "true".matches("[tT]rue|[yY]es");
		System.out.println("Agrupadores 5: " + b);
		b = "True".matches("[tT]rue|[yY]es");
		System.out.println("Agrupadores 6: " + b);
		b = "Yes".matches("[tT]rue|[yY]es");
		System.out.println("Agrupadores 7: " + b);
		b = "yes".matches("[tT]rue|[yY]es");
		System.out.println("Agrupadores 8: " + b);

		// verificar se o texto inicia com letra maiuscula e o resto são letras
		// minusculas
		b = "Leonardo".matches("[A-Z][a-z]*");
		System.out.println("Agrupadores 9: " + b);

		// nao permitir que o texto inicie com a, b ou c
		b = "olho".matches("[^abc]lho*");
		System.out.println("Agrupadores 10: " + b);
		b = "alho".matches("[^abc]lho*");
		System.out.println("Agrupadores 11: " + b);
		
		// validar email
		b = "rh@email.com".matches("\\w+@\\w+\\.\\w{2,3}");
		System.out.println("Agrupadores 12: " + b);
	}
}
