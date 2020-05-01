package application;

import resources.produtos.Produto;
import resources.produtos.ProdutoImp;

import java.util.ArrayList;

public class VendingMachine {
    public static void main(String[] args) {
        ArrayList<ProdutoImp> listaProduto = new ArrayList<>();

        ProdutoImp p1 = new ProdutoImp();
        p1.setIdProduto(1);
        p1.setDescricaoProduto("Primeiro");
        p1.setPrecoProduto(12.90);
        listaProduto.add(p1);

        ProdutoImp p2 = new ProdutoImp();
        p2.setIdProduto(1);
        p2.setDescricaoProduto("Primeiro");
        p2.setPrecoProduto(12.90);
        listaProduto.add(p2);


    }
}
