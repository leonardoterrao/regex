package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Estudo feito a partir do video:
 * http://www.youtube.com/watch?v=N4Bj-gPS0zQ
 * 
 * @author Leonardo
 *
 */
public class ExpressaoRegular {

	public static void main(String[] args) {
		
		String padrao = "Java";
		String texto = "Java";
		boolean b = texto.matches(padrao);
		System.out.println("Exemplo 1: " + b);
		
		/*MODIFICADORES
		  (?i), Ignora maiúscula e minúscula
		  (?x), Comentário
		  (?m), Multilinhas
		  (?s), Dottal*/
		
		/*METACARACTERES
		 .		qualquer caracter
		 \d		dígitos 			[0-9]
		 \D		não é digito		[^0-9]
		 \s		espaços				[ \t\n\x0B\f\r]
		 \S		não é espaço		[^\s]
		 \w		letra				[a-zA-Z_0-9]
		 \W		não é letra*/
		
		/*QUANTIFICADORES
		X{n}	X, exatamente n vezes
		X{n,}	X, pelo menos n vezes
		X{n, m} X, pelo menos n vezes mas não mais que m vezes
		X?		X, 0 ou 1 vez
		X*		X, 0 ou + vezes
		X+ 		X, 1 ou + vezes*/
		
		/*METACARACTER DE FRONTEIRA
		 ^		incia
		 $		finaliza
		 |		ou*/
		
		/*AGRUPADORES
		 [...]			Agrupamento
		 [a-z]			Alcance
		 [a-e][i-u]		União
		 [a-z&&[aeiou]] Interseção
		 [^abc]			Exceção
		 [a-z&&[^m-p]]	Subtracao
		 \x				Fuga literal*/
		
		// buscar a palavra doce independente do de maiusculas ou minusculas
		String doce = "Qual é o Doce mais doCe que o doce?";
		Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
		while (matcher.find()){
			System.out.println(matcher.group());
		}
		
		/* SUBSTITUIÇÕES */
		
		// subustituir a palavra doce independente de maiuscula ou minuscola por DOCINHO
		String r = doce.replaceAll("(?i)doce", "DOCINHO");
		System.out.println(r);
		
		// subistituir as silavas ra, re, ri, ro, ru por XX
		String rato = "O rato roeu a roupa do rei de roma";
		r = rato.replaceAll("r[aeiou]", "XX");
		System.out.println(r);
		
		// subistituir os espaços por TAB
		r = "Tabular este texto".replaceAll("\\s", "\t");
		System.out.println(r);
		
		// trocar o padrao de urls de www.xti.com.br/clientes-2011.html para http://www.xti.com.br/2011/clientes.jsp
		String url = "www.xti.com.br/clientes-2011.html";
		String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
		b = url.matches(re);
		System.out.println("Verificando o padrão: " + b);
		
		re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
		
		r = url.replaceAll(re, "http://$1/$3/$2.jsp");
		System.out.println(r);
	}
}
