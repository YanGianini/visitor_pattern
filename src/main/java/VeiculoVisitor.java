public class VeiculoVisitor implements Visitor{

    public Float calcularIPVA(Veiculo veiculo) {
        return veiculo.calcularIPVA(this);
    }

    @Override
    public Float ipvaAutomovel(Automovel automovel) {
        return automovel.getValor() * 0.07f;
    }

    @Override
    public Float ipvaMotocicleta(Motocicleta motocicleta) {
        return motocicleta.getValor() * 0.05f;
    }
}
