package padroesestruturais.facade;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PedidoTest {

    @Test
    void deveRetornarPendenciaEstoqueLiberacao() {
        Pedido pedido = new Pedido();
        Estoque.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.liberar());
    }

    @Test
    void deveRetornarPendenciaPagamentoLiberacao() {
        Pedido pedido = new Pedido();
        Pagamento.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.liberar());
    }

    @Test
    void deveRetornarPendenciaEntregaLiberacao() {
        Pedido pedido = new Pedido();
        Entrega.getInstancia().addPedidoPendente(pedido);

        assertEquals(false, pedido.liberar());
    }

    @Test
    void deveRetornarPedidoSemPendenciaLiberacao() {
        Pedido pedido = new Pedido();

        assertEquals(true, pedido.liberar());
    }
}
