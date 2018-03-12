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
	 * @return True se a express�o for valida, false se a express�o for n�o v�lida
	 */
	public boolean isValida() {

		if (this.validaQuantParenteses()) {
			if (expressao.matches("^(~*[(]*?|([FT]|[(]*[~]*?[FT])[)]*?(\\^|->|<->|V)[(]?~?[(]?)*(F|T|[FT][)]*)$")) {
				return true;
			}
		} else {
			return false;
		}

		return true;
	}

	public boolean validaQuantParenteses() {
		int parenteses = 0;
		for (int i = 0; i < expressao.length(); i++) {
			if (expressao.charAt(i) == '(') {
				parenteses++;
			}
			if (expressao.charAt(i) == ')') {
				parenteses--;
			}
		}
		if (parenteses == 0) {
			return true;
		}
		return false;
	}

}
