public class Gerente extends Funcionario{
    private double comissao;
    private int numeroVendas;
    private double valorHora;
    private long horasTrabalhadas;

    public Gerente(String nome, String cpf, double comissao, int numeroVendas, double valorHora, long horasTrabalhadas){
        super(nome, cpf);
        this.comissao = comissao;
        this.numeroVendas = numeroVendas;
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return super.getSALARIO_MINIMO() + (this.comissao * this.numeroVendas) + (this.valorHora * this.horasTrabalhadas);
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public long getNumeroVendas() {
        return numeroVendas;
    }

    public void setNumeroVendas(int numeroVendas) {
        this.numeroVendas = numeroVendas;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public long getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(long horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
}
