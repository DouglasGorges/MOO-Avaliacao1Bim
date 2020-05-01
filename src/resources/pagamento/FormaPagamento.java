package resources.pagamento;

public interface FormaPagamento {
    public Debito debito();
    public Credito credito();
    public CarteiraDigital carteiraDigital();
}
