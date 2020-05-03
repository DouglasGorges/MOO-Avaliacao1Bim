package resources.produtos.categorias;

import resources.produtos.Produto;

public class Refrigerante extends Produto {
    public Refrigerante() {
    }

    public Refrigerante(Integer idProduto, String descricaoProduto, Double precoProduto) {
        super(idProduto, descricaoProduto, precoProduto);
    }
}
