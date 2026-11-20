package padroesestruturais.facade;

public class Pedido {

    public boolean liberar() {
        return PedidoFacade.verificarPendenciasLiberacao(this);
    }
}
