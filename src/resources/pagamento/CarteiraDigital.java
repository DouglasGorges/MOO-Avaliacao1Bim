package resources.pagamento;

import resources.cliente.Cliente;

public class CarteiraDigital extends Cliente {
    private Integer identificadorCarteiraDigital;
    private String email;

    public CarteiraDigital() {
    }

    public CarteiraDigital(Integer identificadorCarteiraDigital, String email) {
        this.identificadorCarteiraDigital = identificadorCarteiraDigital;
        this.email = email;
    }

    public Integer getIdentificadorCarteiraDigital() {
        return identificadorCarteiraDigital;
    }

    public void setIdentificadorCarteiraDigital(Integer identificadorCarteiraDigital) {
        this.identificadorCarteiraDigital = identificadorCarteiraDigital;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
