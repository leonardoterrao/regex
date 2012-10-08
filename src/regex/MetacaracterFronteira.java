package regex;

/**
 * METACARACTER DE FRONTEIRA ^ incia $ finaliza | ou
 * 
 * @author Leonardo
 * 
 */
public class MetacaracterFronteira {

	public static void main(String[] args) {

		boolean b;

		// verificar se o texto começa com Leo
		b = "Leo50".matches("^Leo.*"); // 0 ou +
		System.out.println("Metacaracter de Fronteira 1: " + b);

		// verificar se o texto termina com 50
		b = "Leo50".matches("^.*50$"); // 0 ou +
		System.out.println("Metacaracter de Fronteira 2: " + b);

		// verificar se existe a palavra java no texto
		b = "tem java aqui".matches(".*java.*"); // 0 ou +
		System.out.println("Metacaracter de Fronteira 3: " + b);

		// verificar se o texto comeca com tem e terminar com aqui
		b = "tem java aqui".matches("^tem.*aqui$"); // 0 ou +
		System.out.println("Metacaracter de Fronteira 4: " + b);

		// verificar se o texto a palavra sim ou não
		b = "sim".matches("sim|não"); // 0 ou +
		System.out.println("Metacaracter de Fronteira 4: " + b);

	}

}
