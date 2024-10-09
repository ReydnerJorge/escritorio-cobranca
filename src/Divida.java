public class Divida {
    private Pessoa devedora;
    private Pessoa cobradora;
    private Double valorDivida;

    public Divida(Pessoa devedora, Pessoa cobradora, double valorDivida){
        this.devedora = devedora;
        this.cobradora = cobradora;
        this.valorDivida = valorDivida;
    }

    public Pessoa getDevedora() {
        return devedora;
    }

    public void setDevedora(Pessoa devedora) {
        this.devedora = devedora;
    }

    public Pessoa getCobradora() {
        return cobradora;
    }

    public void setCobradora(Pessoa cobradora) {
        this.cobradora = cobradora;
    }

    public Double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(Double valorDivida) {
        this.valorDivida = valorDivida;
    }
}
