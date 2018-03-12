package br.com.projetointegrado;

import java.util.StringTokenizer;

public class Programa {
	
	/**
	 * Recebe a expressão e divide em partes
	 * @param expressao
	 * @return vetor com partes da expressão
	 */	
	public static String[] isBreaker(String expressao) {
		expressao = expressao.toUpperCase().replaceAll("<->", "<").replaceAll("->", "-").replaceAll("[\\s]", "");
		StringTokenizer quebrador = new StringTokenizer(expressao, "()^V-<~", true);
		
		String[] ped = new String[expressao.length()];
		
		int i = 0;
		
		while (quebrador.hasMoreTokens()) {
			ped[i] = quebrador.nextToken();
			System.out.println(ped[i]);
			i++;
		}
		
		return ped;
	}

	public static void main(String[] args) {
		String exp = "((T v F -> T) ^ (T -> F)) -> (~F <-> T)";
	
		Validador valida = new Validador(exp.replaceAll(" ", "").toUpperCase());
		
		System.out.println(valida.isValida());
	

	}

}
