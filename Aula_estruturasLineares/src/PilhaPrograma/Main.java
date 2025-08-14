package PilhaPrograma;

public class Main {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<>();

        System.out.println("=== Pilha ===");
        pilha.adicionar("Angelo");
        pilha.adicionar("Reginaldo");
        pilha.adicionar("Vivian");

        pilha.percorrerElementos();
        System.out.println("Quantidade: " + pilha.informarQuantidade());
        System.out.println("Topo: " + pilha.topo());
        System.out.println("Removido: " + pilha.remover());
        pilha.percorrerElementos();
        System.out.println("Buscar 'Reginaldo': " + pilha.buscar("Reginaldo"));
    }
}

