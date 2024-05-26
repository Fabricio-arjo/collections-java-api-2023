package list.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    
    //Atributo do tipo Set , Contato.
    private Set<Contato> contatoSet;

    //Construtor
    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        
        //Adicionando o objeto contato.
        contatoSet.add(new Contato(nome, numero));

    }

    public void exibirContato(){
        System.out.println(contatoSet);
    }
    
    //Retornando um Set de contatos.
    public Set<Contato> pesquisarPorNome(String nome){
         Set<Contato> contatoPorNome =  new HashSet<>();

         for(Contato c : contatoSet){
            //startsWith testa se o nome possui parte do texto.
             if (c.getNome().startsWith(nome)) {
                 contatoPorNome.add(c);
             }
         }

         return contatoPorNome;
    }
     
    public Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;

        for(Contato c : contatoSet){

            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
           
        }  
        return contatoAtualizado;      

    }



    public static void main(String[] args) {
        
        AgendaContatos agendaContatos = new AgendaContatos();

        //agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Camila", 123456789);
        agendaContatos.adicionarContato("Camila", 5665);
        agendaContatos.adicionarContato("Camila Cavalcante", 11111111);
        agendaContatos.adicionarContato("Camila DIO", 654987);
        agendaContatos.adicionarContato("Maria Silva", 11111111);
        agendaContatos.adicionarContato("Maria", 222222222);

        agendaContatos.exibirContato();

       // System.out.println(agendaContatos.pesquisarPorNome("Camila"));

      System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria",99999999));
        

    }




}

