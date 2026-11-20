package padroesestruturais.facade;

public class PedidoFacade {

    public static boolean verificarPendenciasLiberacao(Pedido pedido) {
        if (Estoque.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        if (Pagamento.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        if (Entrega.getInstancia().verificarPedidoComPendencia(pedido)) {
            return false;
        }
        return true;
    }
}
