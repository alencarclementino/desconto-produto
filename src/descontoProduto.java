public class descontoProduto {
    public static void main(String[] args) {
    double precoOriginal = 4599;

    double percentualDesconto =  90;
    double fazendoContas = (percentualDesconto / 100) * precoOriginal;
    String mensagem = "O Playstation 5 custando " + precoOriginal + " e quando aplicamos 10% de desconto, teremos " + fazendoContas;
        System.out.println(mensagem);
    }
}
