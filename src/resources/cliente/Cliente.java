package resources.cliente;

import resources.pagamento.CarteiraDigital;
import resources.pagamento.Credito;
import resources.pagamento.Debito;

public class Cliente {
    private String nome;
    private String cpf;
    private CarteiraDigital carteiraDigital;
    private Debito debito;
    private Credito credito;

    public Cliente() {
    }

    public Cliente(String nome, String cpf, CarteiraDigital carteiraDigital, Debito debito, Credito credito) {
        this.nome = nome;
        this.cpf = cpf;
        this.carteiraDigital = carteiraDigital;
        this.debito = debito;
        this.credito = credito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public CarteiraDigital getCarteiraDigital() {
        return carteiraDigital;
    }

    public void setCarteiraDigital(CarteiraDigital carteiraDigital) {
        this.carteiraDigital = carteiraDigital;
    }

    public Debito getDebito() {
        return debito;
    }

    public void setDebito(Debito debito) {
        this.debito = debito;
    }

    public Credito getCredito() {
        return credito;
    }

    public void setCredito(Credito credito) {
        this.credito = credito;
    }
}
