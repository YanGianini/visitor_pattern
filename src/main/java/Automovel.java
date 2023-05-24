public class Automovel implements Veiculo{

    private String placa;
    private String nome;
    private Integer ano;
    private Float valor;

    public Automovel(String placa, String nome, Integer ano, Float valor) {
        this.placa = placa;
        this.nome = nome;
        this.ano = ano;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getNome() {
        return nome;
    }

    public Integer getAno() {
        return ano;
    }

    public Float getValor() {
        return valor;
    }

    public Float calcularIPVA(Visitor visitor) {
        return visitor.ipvaAutomovel(this);
    }
}
