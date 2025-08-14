package FilaPrograma;

import java.util.LinkedList;

public class Fila<T> {
    private LinkedList<T> elementos = new LinkedList<>();

    // Adiciona um elemento
    public void adicionar(T elemento) {
        elementos.addLast(elemento);
    }

    // Remove um elemento
    public T remover() {
        if (elementos.isEmpty()) {
            throw new IllegalStateException("Fila vazia!");
        }
        return elementos.removeFirst();
    }


    // Percorre e imprime todos os elementos
    public void percorrerElementos() {
        System.out.println("Elementos na fila:");
        for (T elemento : elementos) {
            System.out.println(elemento);
        }
    }

    // Informa a quantidade de elementos
    public int informarQuantidade() {
        return elementos.size();
    }

    // Realiza busca de um elemento
    public boolean buscar(T elemento) {
        return elementos.contains(elemento);
    }
}