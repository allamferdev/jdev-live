import java.math.BigDecimal;
import java.rmi.server.UID;

public class ExecutarTeste {
    public static void main(String[] args) {
        //Generate ids
        String idVenda = new UID().toString();
        String idProduto = new UID().toString();

        Produto produto1 = new Produto();
        produto1.setId(idProduto);
        produto1.setNome("Tudo sobre programação orientada a objetos");
        produto1.setValor(BigDecimal.valueOf(59.00));

        Produto produto2 = new Produto();
        produto2.setId(idProduto);
        produto2.setNome("Java principios SOLID");
        produto2.setValor(BigDecimal.valueOf(85.00));


        Venda venda = new Venda();
        venda.setDescricaoVenda("Venda de Ebook");
        venda.setEnderecoEntrega("Via E-mail");
        venda.setId(idVenda);
        venda.setNomeCliente("Augusto");
        //venda.setValorTotal(BigDecimal.valueOf(197.00));

        venda.getListaProdutos().add(produto1);
        venda.getListaProdutos().add(produto2);

        double valor = 0;

        for(Produto produtos : venda.getListaProdutos()){
            System.out.println("Produto: " + produtos.getNome());
            valor += produtos.getValor().doubleValue();
        }

        System.out.println("Valor total dos produtos: " + valor);
    }
}
