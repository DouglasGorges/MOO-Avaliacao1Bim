package resources.pagamento;

public class Debito extends ContaBancaria{
    private ContaBancaria contaBancaria;

    public ContaBancaria getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public Debito(ContaBancaria contaBancaria) {
        this.contaBancaria = contaBancaria;
    }

    public Debito(String numeroBanco, String numeroAgencia, String numeroConta, ContaBancaria contaBancaria) {
        super(numeroBanco, numeroAgencia, numeroConta);
        this.contaBancaria = contaBancaria;
    }

    public Debito() {
    }

    public Debito(String numeroBanco, String numeroAgencia, String numeroConta) {
        super(numeroBanco, numeroAgencia, numeroConta);
    }
}
