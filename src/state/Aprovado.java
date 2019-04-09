package state;

public class Aprovado implements EstadoDeUmOrcamento {

    @Override
    public void aplicaDescontoExtra(Orcamento orcamento) {
        orcamento.valor *= 0.98;
    }

    @Override
    public void aprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento já aprovado");
    }

    @Override
    public void reprova(Orcamento orcamento) {
        throw new RuntimeException("Orçamento aprovados não podem ser reprovados");
    }

    @Override
    public void finaliza(Orcamento orcamento) {
        orcamento.estadoAtual = new Finalizado();
    }
}