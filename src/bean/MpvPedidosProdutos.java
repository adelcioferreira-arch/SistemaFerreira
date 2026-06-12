package bean;

public class MpvPedidosProdutos {

    private int idPedidosProdutos;
    private int pedido;
    private int produto;
    private int quantidade;
    private double valorUnitario;
    private double desconto;
    private double subtotal;

    public int getIdPedidosProdutos() {
        return idPedidosProdutos;
    }

    public void setIdPedidosProdutos(int idPedidosProdutos) {
        this.idPedidosProdutos = idPedidosProdutos;
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }

    public int getProduto() {
        return produto;
    }

    public void setProduto(int produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
