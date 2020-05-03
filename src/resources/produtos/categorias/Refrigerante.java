package resources.produtos.categorias;

import resources.produtos.ProdutoImp;

public class Refrigerante extends ProdutoImp {
    public Refrigerante() {
    }

    public Refrigerante(Integer idProduto, String descricaoProduto, Double precoProduto) {
        super(idProduto, descricaoProduto, precoProduto);
    }
}
