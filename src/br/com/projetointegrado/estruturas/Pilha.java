
package br.com.projetointegrado.estruturas;

public class Pilha {
	String[] item;
	int topo = -1;

	public Pilha(int capacidade) throws Exception {
		if (capacidade <= 0)
			throw new Exception("Capacidade invalida");

		item = new String[capacidade];
	}

	void guarde(String x) throws Exception {
		if (topo == item.length) {
			throw new Exception("A pilha está cheia!");
		}
		topo++;
		item[topo] = x;
	}

	public String getItemDoTopo() throws Exception {
		if (item.length == 0) {
			throw new Exception("A pilha não tem nada armazenado");
		}
		return item[topo];
	}
	
	public void exclui() throws Exception {
		if (item.length == 0) {
			throw new Exception("A pilha não tem nada armazenado");
		}
		item[topo] = null;
		topo--;
	}
}