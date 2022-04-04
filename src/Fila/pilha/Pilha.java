package src.Fila.pilha;

public class Pilha {
	/* FIRST IN LAST OFF 
	*	Pilha é basicamente um tipo de estrutura de dado onde o primeiro elemento armazenado numa lista é o ultimo a sair
	* 	p/ definir uma pilha tu precisa de 2 atributos, os dados e qual é o topo da pilha
	*/


	public static void main(String[] args) {
		PilhaClasse p = new PilhaClasse();
		System.out.printf("A pilha está cheia? %s\n",p.isPilhaCheia());
		System.out.printf("A pilha está vazia? %s\n",p.isPilhaVazia());
		
		for(int i = 0; i < 200; i++) {
			p.addPilha(Math.pow(i, 2));
		}
		
		int cont = 0;
		for(double i:p.getDados()) {
			System.out.printf("Posição %d, Valor: %.0f\n", cont, i);
			cont++;
		}
		
	}

}

class PilhaClasse {
	private double[] Dados = new double[200];
	private int Topo = -1;
	
	public double[] getDados() {
		return Dados;
	}

	public void addPilha(double i) {
		if(!isPilhaCheia()) {
			Topo++;
			Dados[Topo] = i;
		}else {
			// ignora isso, era só pra dizer que deu ruim de forma elegante
			throw new RuntimeException("Pilha Cheia!");
		}
	}
	
	public boolean isPilhaCheia() {
		if(Topo == Dados.length-1 && Dados.length!=0) {
			return true;
		}
		return false;
	}
		
	public boolean isPilhaVazia() {
	if(Topo == -1) {
		return true;
	}
		return false;
	}
	
}