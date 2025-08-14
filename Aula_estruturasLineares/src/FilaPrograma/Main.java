package FilaPrograma;

public class Main {
    public static void main(String[] args) {
        Fila<String> fila = new Fila<>();

        System.out.println("=== FILA ===");
        fila.adicionar("Renato");
        fila.adicionar("Pablo");
        fila.adicionar("Rogéria");

        fila.percorrerElementos();
        System.out.println("Quantidade: " + fila.informarQuantidade());
        System.out.println("Removido: " + fila.remover());
        System.out.println("Luara entrou na fila");
        fila.adicionar("Luara");
        fila.percorrerElementos();
        System.out.println("Buscar 'Renato': " + fila.buscar("Renato"));
        System.out.println("Buscar 'Luara': " + fila.buscar("Luara"));

    }
}

