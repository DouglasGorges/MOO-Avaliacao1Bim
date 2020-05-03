package resources.pagamento;

import resources.cliente.Cliente;
import resources.produtos.ProdutoImp;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class Pagamento extends FormaPagamentoImpl {

    public Boolean pagarDebito(Cliente cliente, LocalDateTime data, ContaBancaria contaCredito, Double valor) {

        return isPersisted(cliente.getCpf(), data, "Débito", valor);
    }

    public Boolean pagarCredito(Cliente cliente, LocalDateTime data, Double valor) {

        return isPersisted(cliente.getCpf(), data, "Crédito", valor);
    }

    public Boolean pagarCarteiraDigital(Cliente cliente, LocalDateTime data, String moeda, Double valor) {

        return isPersisted(cliente.getCpf(), data, "Carteira Digital", valor);
    }

    public Double calculaValorTotal(ArrayList<ProdutoImp> listaProduto){
        Double valorTotal = 0.0;;
        for(ProdutoImp produto : listaProduto) valorTotal += produto.getPrecoProduto();
        return valorTotal;
    }

    private Boolean isPersisted(String cpf, LocalDateTime dataPagamento, String formaPagamento, Double valorPago) {
        try {
            System.out.println("CPF: " + cpf);

            DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
            String dataFormatada = dataPagamento.format(formatoData);
            System.out.println("Data: " + dataFormatada);

            System.out.println("Forma de Pagamento: " + formaPagamento);
            System.out.println("Valor total: R$" + valorPago);
            return true;
        } catch (Exception e) {
            System.out.println("ERRO: " + e);
            return false;
        }
    }
}
