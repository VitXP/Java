package school.sptech.projeto1.heranca;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    List<Produto> produtos;

    public Carrinho() {
        produtos = new ArrayList<>();
    }

    /**
     * Adiciona um Produto novo no carrinho. Caso o valor seja null o Produto
     * não deve ser adicionado
     *
     * Parâmetro produto: Novo Produto a ser adicionado
     */
    public void adicionarProduto(Produto produto) {
        if (!(produto == null)) {
            produtos.add(produto);
        } else {
            System.out.println("Produto invalido!");
        }
    }

    /**
     * Remove um Produto do carrinho pelo índice. Caso o índice do produto for
     * inválido o método não deve lançar um erro de execução
     *
     * Parâmetro indice: Índice do Produto que será removido
     */
    public void removerProduto(int indice) {
        if (indice >= 0 && indice < produtos.size()) {
            produtos.remove(indice);
        } else {
            System.out.println("Erro");
        }

    }

    /**
     * Calcula o valor total de todos os itens do carrinho.
     *
     * Retorna valor total do carrinho
     */
    public Double calcularTotal() {

        Double valorTotal = 0.0;

        for (Produto produto : produtos) {
            valorTotal += produto.getPreco();
        }

        return valorTotal;
    }

    /**
     * Calcula o valor das parcelas de acordo com o número de vezes que o
     * usuário deseja parcelar.
     *
     * Parâmetro vezes: Número de vezes que o usuário deseja parcelar Retorna
     * total do carrinho parcelado
     */
    public Double parcelarCompra(Integer vezes) {

        Double valorTotal = calcularTotal();
        return valorTotal / vezes;

    }

    /**
     * Encontra um Produto com o índice desejado. Caso o índice não seja
     * encontrado retorne null
     *
     * Parâmetro index: Índice do Produto Retorna Produto encontrado
     */
    public Produto findProdutoPeloIndice(Integer index) {
        if (index >= 0 && index < produtos.size()) {
            return produtos.get(index);
        } else {
            return null;
        }

    }

    /**
     * Encontra um Produto com o nome desejado ignorando letras maiúsculas e
     * minúsculas.
     *
     * Caso um Produto não seja encontrado retorne null
     *
     * Parâmetro nome: Nome do Produto Retorna Produto encontrado
     */
    public Produto findProdutoPeloNome(String nome) {

        for (Produto produto : produtos) {
            if (produto.getNome().equalsIgnoreCase(nome)) {
                return produto;
            }
        }
        return null;
    }

    /**
     * Encontra todos os Produto de uma determinada categoria ignorando letras
     * maiúsculas e minúsculas.
     *
     * Caso não encontre nenhum Produto devolva uma lista vazia
     *
     * Parâmetro categoria: Categoria desejada Return Produtos encontrados
     */
    public List<Produto> findProdutoPorCategoria(String categoria) {

        List<Produto> produtosEncontrados = new ArrayList<>();

        for (Produto produto : produtos) {
            if (produto.getCategoria().equalsIgnoreCase(categoria)) {
                produtosEncontrados.add(produto);
            }
        }

        if (produtosEncontrados.isEmpty()) {
            System.out.println("Nenhum produto encontrado para a categoria " + categoria);
        }

        return produtosEncontrados;
    }

    /**
     * Encontra todos os ProdutoInternacional presentes no Carrinho. Caso não
     * encontre nenhum ProdutoInternacional devolva uma lista vazia
     *
     * Retorna Produtos internacionais encontrados
     */
    public Integer countProdutosInternacionais() {

        Integer produtoInternacional = 0;

        for (Produto produto : produtos) {
            if (produto instanceof ProdutoInternacional) {
                produtoInternacional++;
            }
        }

        return produtoInternacional;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
}
