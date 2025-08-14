package PilhaPrograma;
import java.util.ArrayList;
import java.util.List;

public class Pilha<T> {
        private List<T> elementos = new ArrayList<>();

        // Adiciona elemento
        public void adicionar(T elemento) {
            elementos.add(elemento); // Sempre adiciona no final
        }

        // Remove elemento
        public T remover() {
            if (elementos.isEmpty()) {
                throw new IllegalStateException("Pilha vazia!");
            }
            return elementos.remove(elementos.size() - 1);
        }

        // Percorre e imprime todos os elementos
        public void percorrerElementos() {
            System.out.println("Elementos na pilha:");
            for (int i = elementos.size() - 1; i >= 0; i--) {
                System.out.println(elementos.get(i));
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

        // Retorna o elemento no topo sem remover
        public T topo() {
            if (elementos.isEmpty()) {
                throw new IllegalStateException("Pilha vazia!");
            }
            return elementos.get(elementos.size() - 1);
        }


}
