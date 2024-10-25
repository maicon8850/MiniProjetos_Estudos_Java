import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Criação de um pedido com status PENDENTE
        Pedido pedido = new Pedido(1, new Date(), StatusPedido.PENDENTE);

        System.out.println(pedido); // Exibe o pedido com status atual

        // Alterando o status para ENVIADO
        pedido.setStatus(StatusPedido.ENVIADO);
        System.out.println("Status atualizado: " + pedido.getStatus());
    }
}
