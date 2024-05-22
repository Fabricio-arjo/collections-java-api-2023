package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

//Atributo Item do tipo list
 private List<Item> itemList;

 //Construtor

 public CarrinhoDeCompras(){
    this.itemList = new ArrayList<>();
 }


 public void adicionarItem(String nome, double preco, int quantidade){
    //Objeto do tipo Item para ser adicionado.
    Item item = new Item(nome, preco, quantidade);

    this.itemList.add(item);
 }
 
 public void removerItem(String nome){
     //Lista para receber os itens que serão removido.
     List<Item> itemParaRemover = new ArrayList<>();
     
     if(!itemList.isEmpty()){
         for(Item i : itemList){
            if (i.getNome().equalsIgnoreCase(nome)) {
               itemParaRemover.add(i);
            }
         }
        itemList.removeAll(itemParaRemover);
     }else{
        System.out.println("Lista está vazia.");
     }

   }

     public double calcularValorTotal(){

        double valorTotal = 0;

        if(!itemList.isEmpty()){
              for(Item i : itemList){
                  double valorItem = i.getPreco()*i.getQuantidade();
                  valorTotal += valorItem;
              }
            return valorTotal;
        }else{
             throw new RuntimeException("A lista está vazia");
        }
     }

     public void exibirItens(){
        if (!itemList.isEmpty()) {
           System.out.println(itemList);
        }else{
         System.out.println("A lista está vazia.");
        }
     }

     @Override
     public String toString() {
        return "CarrinhoDeCompras{" + "itens= " + itemList + '}';
     }

      public static void main(String[] args) {
          CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

          carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
          carrinhoDeCompras.adicionarItem("Lápis", 2d, 3);
          carrinhoDeCompras.adicionarItem("Caderno", 35d, 1);
          carrinhoDeCompras.adicionarItem("Borracha", 2d, 2);

          carrinhoDeCompras.exibirItens();

          carrinhoDeCompras.removerItem("Lápis");

          carrinhoDeCompras.exibirItens();

          System.out.println("O valor da compra é: " + carrinhoDeCompras.calcularValorTotal());



      }

      



    
}
