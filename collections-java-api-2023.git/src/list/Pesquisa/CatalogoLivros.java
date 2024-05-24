package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //Atributo

    private List<Livro> livroList;

    public CatalogoLivros(){
        this.livroList = new ArrayList<>();
    }

    public void adicionarLivros(String titulo, String autor, int anoPublicacao){
       
        livroList.add(new Livro(titulo, autor, anoPublicacao));
       
    }

    public List<Livro> pesquisarPorAutor(String autor){

        List<Livro> livrosPorAutor = new ArrayList<>();
    
        if(!livroList.isEmpty()){
            for(Livro l : livroList){
               if (l.getAutor().equalsIgnoreCase(autor)) {
                 livrosPorAutor.add(l);               
               }
            }
        }
           return livrosPorAutor;
    }

     public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal){

        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();

        if(!livroList.isEmpty()){
           for (Livro l : livroList){
              if(l.getAnoPublicacao() >= anoFinal && l.getAnoPublicacao() <= anoFinal){
                 livrosPorIntervaloAnos.add(l);
              }
           }
        }

        return livrosPorIntervaloAnos;
     }

     public Livro pesquisaPorLivro(String titulo){

        Livro livroPorTitulo = null;

        if(!livroList.isEmpty()){

            for(Livro l : livroList){

                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo=l;  
                    break;                 
                }

            }

        }

        return livroPorTitulo;

     }


      public static void main(String[] args) {
           
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivros("Livro 1", "Autor 1", 2020);
        catalogoLivros.adicionarLivros("Livro 1", "Autor 2", 2021);
        catalogoLivros.adicionarLivros("Livro 3", "Autor 2", 2022);
        catalogoLivros.adicionarLivros("Livro 4", "Autor 3", 2023);
        catalogoLivros.adicionarLivros("Livro 5", "Autor 4", 1994);

        System.out.println(catalogoLivros.pesquisarPorAutor("Autor 4"));
        System.out.println(catalogoLivros.pesquisarPorIntervaloAnos(2020, 2021));
        System.out.println(catalogoLivros.pesquisaPorLivro("Livro 1"));
      }

    
}
