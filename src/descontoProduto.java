public class descontoProduto {
    public static void main(String[] args) {
    double precoOriginal = 4.599;
    double percentualDesconto =  10;
    double produtoComDesconto = (90 / percentualDesconto) * precoOriginal;
    String mensagem = "O Playstation 5 custando " + precoOriginal + " e quando aplicamos 10% de desconto, teremos " + produtoComDesconto;
        System.out.println(mensagem);
    }
}
