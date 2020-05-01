package resources.pagamento;

import resources.produtos.ProdutoImp;

import java.util.ArrayList;
import java.util.Date;

public class Pagamento extends FormaPagamentoImpl {

    public Boolean pagarDebito(Debito debito, Date data, ContaBancaria contaCredito, Double valor) {

        return isPersisted(debito.getCpf(), data, "Débito", valor);
    }

    public Boolean pagarCredito(Credito credito, Date data, Double valor) {

        return isPersisted(credito.getCpf(), data, "Crédito", valor);
    }

    public Boolean pagarCarteiraDigital(CarteiraDigital carteiraDigital, Date data, String moeda, Double valor) {

        return isPersisted(carteiraDigital.getCpf(), data, "Carteira Digital", valor);
    }

    public Double calculaValorTotal(ArrayList<ProdutoImp> listaProduto){
        Double valorTotal = 0.0;;
        for(ProdutoImp produto : listaProduto){
            valorTotal += produto.getPrecoProduto();
        }
        return valorTotal;
    }

    private Boolean isPersisted(String cpf, Date dataPagamento, String formaPagamento, Double valorPago) {
        try {
            System.out.println("Pagamento realizado com sucesso!");
            System.out.println("CPF: " + cpf);
            System.out.println("Data: " + dataPagamento);
            System.out.println("Forma de Pagamento: " + formaPagamento);
            System.out.println("Valor pago: R$" + valorPago);
            return true;
        } catch (Exception e) {
            System.out.println("ERRO: " + e);
            return false;
        }
    }
}
