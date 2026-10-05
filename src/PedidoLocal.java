public class PedidoLocal extends Pedido {

    private final static double TAXA_SERVICO = 0.1d;

    @Override
    public double precoAPagar() {
       return valorPizzas() + valorServico();
    }
    
    private double valorServico (){
        return valorPizzas() * TAXA_SERVICO;
    }

     @Override 
    public String toString(){
        StringBuilder cupom = new StringBuilder(cabecalho());
        cupom.append("PEDIDO LOCAL\n");
        cupom.append(detalhesPedido()+"\n");
        
        cupom.append(String.format("SERVIÇO\n: R$ %.2f", 
                            valorServico()));

                            cupom.append(String.format("VALOR: R$ %.2f", 
                            precoAPagar()));

        return cupom.toString();
    } 
    
}
