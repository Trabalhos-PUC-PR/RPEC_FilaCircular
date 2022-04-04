package src.Fila.Fila;

/** 
 * Fila (FIRST IN FIRST OFF)
 * 
 * basicamente é, o primeiro elemento que entra no conjunto vai ser o primeiro que sai
 * os atributos necessarios pra fazer uma fila são: o primeiro elemento, o ultimo elemento
 * e os dados da própria fila.
 * 
 * */

public class Program {
	public static void main(String[] args) {
		Fila f = new Fila();
		f.inserir(1);
		f.inserir(2);
		f.inserir(3);
		f.inserir(4);
		f.inserir(5);
		f.inserir(6);
		f.inserir(7);
		f.inserir(8);
		f.inserir(9);
		f.inserir(10);
		System.out.println("Está cheia?: "+f.isFull());
		System.out.println("Está vazia?: "+f.isEmpty());
		f.imprimir();
	}

}

class Fila{
	private int primeiro;
	private int ultimo;
	private int[] dados;

	public Fila() {
		primeiro = 0;
		ultimo = -1;
		dados = new int[10];
	}
	
	public boolean isEmpty() {
		if (ultimo == primeiro) {
			return true;
		}
		return false;
	}
	
	public boolean isFull() {
		int tamanho = dados.length;
		if(tamanho-1==ultimo) {
			return true;
		}
		return false;
	}
	
	public void inserir (int i) {
		if(isFull()) {
			throw new RuntimeException("List is full!");
		}
		ultimo++;
		dados[ultimo] = i;
	}

	public void remover() {
		dados[primeiro] = 0;
		primeiro++;
	}

	public void imprimir() {
		System.out.print('[');
		for(int a : dados) {
			System.out.print(a + ", ");
		}
		System.out.println(']');
	}
	
}