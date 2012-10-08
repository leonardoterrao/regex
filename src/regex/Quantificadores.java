package regex;

/**
 * QUANTIFICADORES 
 * X{n} 	X, exatamente n vezes 
 * X{n,} 	X, pelo menos n vezes 
 * X{n, m} 	X, pelo menos n vezes mas não mais que m vezes 
 * X? 		X, 0 ou 1 vez 
 * X* 		X, 0 ou + vezes 
 * X+ 		X, 1 ou + vezes
 * 
 * @author Leonardo
 * 
 */
public class Quantificadores {

	public static void main(String[] args) {
		
		boolean b;
		
		// verificar se tem 2 digitos numericos no texto
		b = "12".matches("\\d{2}");
		System.out.println("Quantificadores 1: " + b) ;
		
		// verificar se tem pelo menos 2 digitos numericos no texto
		b = "123".matches("\\d{2,}");
		System.out.println("Quantificadores 2: " + b) ;
		
		// verificar se tem entre 2 e 5 digitos numericos no texto
		b = "12345".matches("\\d{2,5}");
		System.out.println("Quantificadores 3: " + b) ;
		
		// verificar se tem entre 0 ou 1 digitos no texto
		b = "".matches(".?"); // 0 ou 1
		System.out.println("Quantificadores 4: " + b) ;
		
		// verificar se tem entre 0 ou mais digitos no texto
		b = "aa".matches(".*"); //0 ou +
		System.out.println("Quantificadores 5: " + b) ;
		
		// verificar se tem entre 1 ou mais digitos no texto
		b = "123".matches(".+"); //0 ou +
		System.out.println("Quantificadores 6: " + b) ;
		
		// verificar se o texto esta em formato de um CEP
		b = "87225-000".matches("\\d{5}-\\d{3}"); //0 ou +
		System.out.println("Quantificadores 7: " + b) ;
		
		// verificar se o texto esta em formato de uma data
		b = "17/02/1992".matches("\\d{2}/\\d{2}/\\d{4}"); //0 ou +
		System.out.println("Quantificadores 8: " + b) ;
	}
}
