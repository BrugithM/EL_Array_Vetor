public class ListaEstatica {
    private int[] elementos;
    private int tamanho;

    public ListaEstatica(int capacidade) {
        elementos = new int[capacidade];
        tamanho = 0;
    }

    public boolean adicionar(int valor) {
        if (tamanho < elementos.length) {
            elementos[tamanho] = valor;
            tamanho++;
            return true;
        }
        System.out.println("Lista cheia. Não foi possível adicionar.");
        return false;
    }

    public boolean remover(int indice) {
        if (indice >= 0 && indice < tamanho) {
            for (int i = indice; i < tamanho - 1; i++) {
                elementos[i] = elementos[i + 1];
            }
            tamanho--;
            return true;
        }
        System.out.println("Índice inválido.");
        return false;
    }

    public void percorrer() {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
    }

    public int getQuantidade() {
        return tamanho;
    }

    public int buscar(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (elementos[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
