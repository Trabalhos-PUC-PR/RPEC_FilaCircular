package src.program;

import src.entities.FilaCircular;

public class Main{
    public static void main(String[] args) {
        // Criar uma FilaCircular
        FilaCircular f = new FilaCircular(4);
        // Inserir o elemento 5 na fila f
        f.insert(5);
        // Inserir o elemento 15 na fila f
        f.insert(15);
        f.print();

        f.insert(15);
        f.insert(15);
        f.print();
        /*
        // Inserir o elemento 25 na fila f
        f.inserir(25);
        f.imprimir();
        // Remover elemento da fila f
        System.out.println("Removido: "+f.remover());
        f.imprimir();
        // Remover elemento da fila f
        System.out.println("Removido: "+f.remover());
        f.imprimir();
        // Inserir o elemento 15 na fila f
        f.inserir(15);
        f.imprimir();
        // Inserir o elemento 25 na fila f
        f.inserir(25);
        f.inserir(25);
        f.inserir(25);
        f.imprimir();
        // Remover elemento da fila f
        System.out.println("Removido: "+f.remover());
        f.imprimir();
        */
        }
}