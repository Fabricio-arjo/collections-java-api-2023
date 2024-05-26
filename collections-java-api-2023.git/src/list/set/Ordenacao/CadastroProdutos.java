package list.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


import list.set.Ordenacao.Produto.ComparatorPorPreco;

public class CadastroProdutos {
    
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(Long codigo, String nome, double preco, int quantidade){
             produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }


    public Set<Produto> exibirprodutosPorNome(){
                                          //Ordena por nome;
       Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);

       return produtosPorNome;
    }

   public Set<Produto> exibirProdutosPorPreco(){
     Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
         produtosPorPreco.addAll(produtoSet);

         return produtosPorPreco;
   }

      public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        // Adicionando produtos ao cadastro
        cadastroProdutos.adicionarProduto(1L, "Produto 01", 1000d, 10);
        cadastroProdutos.adicionarProduto(2L, "Produto 02", 1500d, 5);
        cadastroProdutos.adicionarProduto(1L, "Produto 03", 30d, 20);
        cadastroProdutos.adicionarProduto(4L, "Produto 04", 50d, 15);

      

          // Exibindo todos os produtos no cadastro
           System.out.println(cadastroProdutos.produtoSet);

         // Exibindo produtos ordenados por nome
           System.out.println(cadastroProdutos.exibirprodutosPorNome());

         // Exibindo produtos ordenados por preço
            System.out.println(cadastroProdutos.exibirProdutosPorPreco());

      }
  
      
}
