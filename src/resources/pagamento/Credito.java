package resources.pagamento;

import resources.cliente.Cliente;

public class Credito {
    private String operadoraCartao;
    private String numeroCartao;
    private Integer csvCartao;

    public Credito() {
    }

    public Credito(String operadoraCartao, String numeroCartao, Integer csvCartao) {
        this.operadoraCartao = operadoraCartao;
        this.numeroCartao = numeroCartao;
        this.csvCartao = csvCartao;
    }

    public String getOperadoraCartao() {
        return operadoraCartao;
    }

    public void setOperadoraCartao(String operadoraCartao) {
        this.operadoraCartao = operadoraCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public Integer getCsvCartao() {
        return csvCartao;
    }

    public void setCsvCartao(Integer csvCartao) {
        this.csvCartao = csvCartao;
    }
}
