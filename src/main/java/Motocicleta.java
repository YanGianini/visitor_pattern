public class Motocicleta implements Veiculo{

    private String placa;
    private String modelo;
    private Integer ano;
    private Float valor;

    public Motocicleta(String placa, String modelo, Integer ano, Float valor) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public Float getValor() {
        return valor;
    }

    public Float calcularIPVA(Visitor visitor) {
        return visitor.ipvaMotocicleta(this);
    }
}
