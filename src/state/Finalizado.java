package state;

public class Finalizado implements EstadoDeUmOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        throw new RuntimeException("Orçamentos finalizados não recebem desconto");
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Estado de Finalizado é inalterável");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Estado de Finalizado é inalterável");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        throw new RuntimeException("Estado de Finalizado é inalterável");
    }
}
