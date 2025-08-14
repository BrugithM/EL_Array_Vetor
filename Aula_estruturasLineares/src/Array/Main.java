package Array;

public class Main {
    public static void main(String[] args) {
        ListaEstatica lista = new ListaEstatica(5);

        lista.adicionar(10);
        lista.adicionar(20);
        lista.adicionar(30);

        lista.percorrer(); // Saída: 10 20 30

        System.out.println("Quantidade: " + lista.getQuantidade());

        int pos = lista.buscar(20);
        System.out.println("20 encontrado no índice: " + pos);

        lista.remover(1); // Remove o elemento no índice 1
        lista.percorrer(); // Saída: 10 30
    }
}
