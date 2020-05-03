package resources.produtos.categorias;

import resources.produtos.ProdutoImp;

public class Cafe extends ProdutoImp {
    public Cafe() {
    }

    public Cafe(Integer idProduto, String descricaoProduto, Double precoProduto) {
        super(idProduto, descricaoProduto, precoProduto);
    }

}
