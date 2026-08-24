import java.util.List;

public class XulambsApp {
    
    static List<Pizza> pizzas;

    void main() {
        int opcao;
        do {
            opcao = menuPrincipal();
            switch (opcao) {
                case 1 -> comprarPizza();
                case 2 -> mostarPizzas();
                case 0 -> IO.println("Encerrando!!");         
                default -> IO.println("Opção inválida.");
            }
        } while (opcao != 0);
    }

    private void mostarPizzas() {
        cabecalho();
        for (Pizza pizza : pizzas) {
            mostrarNota(pizza);
            IO.println();
        }
    }

    private void cabecalho(){
        IO.println("XULAMBS PIZZA v0.1");
        IO.println("==================");
    }

    private int mensagem(String mensagem){
        return Integer.parseInt(IO.readln(mensagem));
    }

    private void comprarPizza() {
        cabecalho();
        IO.print("Comprando uma pizza: ");
        int adicionais = escolherIngredientes();
        Pizza novaPizza = new Pizza(adicionais);
        mostrarNota(novaPizza);
        pizzas.add(novaPizza);
    } 

    private void mostrarNota(Pizza novaPizza) {
        IO.println("#################");
        IO.println(novaPizza.gerarCupom());
        IO.println("#################");
    }

    int escolherIngredientes() {
        return mensagem("Digite a quantidade de ingredientes adicionais: ");
    }

    private int menuPrincipal() {
        cabecalho();
        IO.println("1- Comprar pizza");
        IO.println("2 - Ver pizzas vendidas");
        IO.print("0 - Finalizar");

        return mensagem("Digite sua opção no menu: ");
    }
}
