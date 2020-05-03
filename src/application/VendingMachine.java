package application;

import resources.cliente.Cliente;
import resources.pagamento.*;
import resources.produtos.Produto;
import resources.produtos.categorias.Cafe;
import resources.produtos.categorias.Refrigerante;
import resources.produtos.categorias.Salgadinho;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class VendingMachine {
    public static void main(String[] args) {

        ArrayList<Produto> listaProduto = new ArrayList<>();

        Produto p1 = new Cafe();
        p1.setIdProduto(1);
        p1.setDescricaoProduto("Primeiro CAfé");
        p1.setPrecoProduto(12.90);
        listaProduto.add(p1);

        Produto p2 = new Refrigerante();
        p2.setIdProduto(2);
        p2.setDescricaoProduto("Primeiro Refri");
        p2.setPrecoProduto(10.90);
        listaProduto.add(p2);

        Produto p3 = new Salgadinho();
        p3.setIdProduto(3);
        p3.setDescricaoProduto("Primeiro Salgadinho");
        p3.setPrecoProduto(14.90);
        listaProduto.add(p3);

        Cliente cliente = new Cliente();
        cliente.setNome("Douglas Gorges");
        cliente.setCpf("160.710.229-32");


        Credito credito = new Credito();
        credito.setNumeroCartao("053698732469887");
        credito.setOperadoraCartao("Banco do Brasil");
        credito.setCsvCartao(675);
        cliente.setCredito(credito);

        Debito contaDebito = new Debito();
        contaDebito.setNumeroBanco("001");
        contaDebito.setNumeroAgencia("0838");
        contaDebito.setNumeroConta("34516-2");
        cliente.setDebito(contaDebito);

        ContaBancaria contaCredito = new ContaBancaria();
        contaCredito.setNumeroBanco("140");
        contaCredito.setNumeroAgencia("1023");
        contaCredito.setNumeroConta("45632-5");

        CarteiraDigital carteiraDigital = new CarteiraDigital();
        carteiraDigital.setIdentificadorCarteiraDigital(871625384);
        carteiraDigital.setEmail("zeca_pagodinho@bol.com.br");
        cliente.setCarteiraDigital(carteiraDigital);

        LocalDateTime dataTransacao = LocalDateTime.now();
        Pagamento pagar = new Pagamento();
        Double valorTotal = pagar.calculaValorTotal(listaProduto);

        // Aqui é definido o tipo de pagamento
//        Boolean isPago = pagar.pagarDebito(cliente, dataTransacao, contaCredito, valorTotal);
//        Boolean isPago = pagar.pagarCredito(cliente, dataTransacao, valorTotal);
        Boolean isPago = pagar.pagarCarteiraDigital(cliente, dataTransacao, "BitCoin", valorTotal);

        if (isPago) System.out.println("Pagamento realizado com sucesso!");
    }
}
