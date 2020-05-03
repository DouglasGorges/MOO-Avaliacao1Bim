package resources.produtos;

public class Produto {
    private Integer idProduto;
    private String descricaoProduto;
    private Double precoProduto;

    public Produto() {
    }

    public Produto(Integer idProduto, String descricaoProduto, Double precoProduto) {
        this.idProduto = idProduto;
        this.descricaoProduto = descricaoProduto;
        this.precoProduto = precoProduto;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public void setDescricaoProduto(String descricaoProduto) {
        this.descricaoProduto = descricaoProduto;
    }

    public Double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(Double precoProduto) {
        this.precoProduto = precoProduto;
    }
}
