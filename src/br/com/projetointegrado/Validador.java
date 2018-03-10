package br.com.projetointegrado;

/**
 * 
 * @author Beatriz Oliveira
 *
 */
public class Validador {

	String expressao;

	/**
	 * Construtor da classe Validador
	 * 
	 * @param expressao
	 */
	public Validador(String expressao) {
		super();
		this.expressao = expressao;
	}

	/**
	 * 
	 * 
	 * @return True se a expressão for valida, false se a expressão for não válida
	 */
	public boolean isValida() {

		if (this.validaQuantParenteses()) {
			if (expressao.matches("^(~*[(]*?|([FT]|[(]*[~]*?[FT])[)]*?(V|\\^|->|<->)[(]?~?[(]?)*(F|T|[FT][)]*)$")) {
				return true;
			}
		} else {
			return false;
		}

		return true;
	}

	public boolean validaQuantParenteses() {
		int parenteses = 0;
		String[] expressaoQ = expressao.split(" ");
		for (int i = 0; i < expressaoQ.length; i++) {
			if (expressaoQ[i].length() == 1) {
				if (expressaoQ[i].equals("(")) {
					parenteses++;
				}
				if (expressaoQ[i].equals(")")) {
					parenteses--;
				}
			} else {
				return false;
			}
		}
		if (parenteses == 0) {
			return true;
		}
		return false;
	}

}
