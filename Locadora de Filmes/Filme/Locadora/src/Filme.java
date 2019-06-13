
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Filme {

    Scanner entrada = new Scanner(System.in);

    List<Filme> listaFilme = new ArrayList<Filme>();

    //---- variaves ----
    
    private String titulo;
    private int ano;
    private double duracao;
    private String genero;
    private double valorLocacao;

  
    	//---- construtor ----

    public Filme() {

        this.titulo = titulo;
        this.ano = ano;
        this.genero = genero;
        this.valorLocacao = valorLocacao;
    }



    //---- Metodos de Manipulação do Filme----
    
   
    public void cadastraFilme() {
        Filme filme = new Filme();
        
        //---- Menu ----
        
        System.out.println("-----CADASTRAR FILME----");

        System.out.println("TITULO: ");
        filme.setTitulo(entrada.nextLine());

        System.out.println("GENERO: ");
        filme.setGenero(entrada.nextLine());

        System.out.println("ANO: ");
        filme.ano = Integer.parseInt(entrada.nextLine());

        System.out.println("VALOR DA LOCACAO: ");
        
        filme.valorLocacao = Double.parseDouble(entrada.nextLine());
        
        //----Adicionando o Filme ao ArrayList

        listaFilme.add(filme);
    }

    public void locaFilme() {

    	
        String nomeFilme;

        Cliente cliente = new Cliente();

        System.out.println("---------LOCAR FILME------------");
        System.out.println("DIGITE O NOME DO FILME DESEJADO: ");
        nomeFilme = entrada.nextLine();

        for (Filme filme : listaFilme) {
            if (filme.getTitulo().equals(nomeFilme)) {
                System.out.println(".::: A PESQUISA ENCONTROU :::." + 
            "\n TITULO: " + getTitulo() + 
            "\n ANO: " + getAno() + 
            "\n GENERO: " + getGenero() + 
            "\n VALOR: " + getValorLocacao());

            }
        }
        System.out.println("FILME NAO ENCONTRADO.");

        if (!("FILME NAO ENCONTRADO".equals(nomeFilme))) {

            System.out.println("DESEJA REALMENTE LOCAR ESTE FILME? ");

            String opcao = null;

            switch (opcao) {
            case "s":
            case "S":
                System.out.println("DIGITE O CPF DO CLIENTE: ");
                String cpfCliente = entrada.nextLine();

                for (Cliente pcliente : cliente.listaCliente) {
                    if (cliente.getCpf().equals(cliente.getCpf())) {
                        System.out.println("----- A PESQUISA ENCONTROU -------" + 
                    "\n NOME: " + cliente.getNome() + 
                    "\n CPF: " + cliente.getCpf() + 
                    "\n ENDERECO: " + cliente.getEndereco() + 
                    "\n TELEFONE: " + cliente.getTelefone());

                    }
                }
                System.out.println("CLIENTE NAO ENCONTRADO.");

                if (!("CLIENTE NAO ENCONTRADO.".equals(cpfCliente))) {


                }

                break;

            case "n":
            case "N":


            default:
                System.out.println("APERTE APENAS S PARA SIM OU N PARA NAO.");
                break;
            }

        }
    }

    public void excluiFilme() {

    	//---- variaves auxiliases 
    	
        String titulo;
        int verif = 0;

        //----recebendo o Titulo
        
        System.out.println("---- Excluir Filme ----");
        System.out.println("Informe o Nome do Filme");
        titulo = entrada.nextLine();

        //---- varendo o ArrayList pasando como parametro o Titulo
        
        for (Filme filme : listaFilme) {
        	
        	//---- varendo o ArrayList pasando como parametro o Titulo
        	
            if (filme.getTitulo().equals(titulo)) {
            	
            	//----retornando uma String com Titulo e o Valor---
            	
                System.out.println("Titulo: "+ filme.getTitulo() + " | " + "Valor: "+filme.getValorLocacao());
            }
        }

        //----retornando uma String de verificacao
        
        System.out.println("DESEJA REALMENTE REMOVER ESTE CLIENTE? (1) SIM (2)NÃO");
        
        verif = entrada.nextInt();

        //--- caso selecione 1 o tiyulo e removido do ArrayList
        if (verif == 1) {
            listaFilme.remove(titulo);
        }
        
        //---- caso 2 nao retorna nada 
        
        else {
            return;
        }


        return;
    }

    public void listaFilme() {
        for (Filme filme : listaFilme) {
                		
        		//----retornando uma String com as onformações---
        		System.out.println("-------Informação-------------------");
                System.out.println("Titulo: " + filme.getTitulo());
                System.out.println("Lançamento: "+ filme.getAno());
                System.out.println("Genero: "+ filme.getGenero());
                System.out.println("valor: "+ filme.getValorLocacao());
    }
    
    }
    
    public void PesqFilme() {
    	
    	

    	//---- variaves auxiliases 
    	
        String titulo;
        
        //----recebendo o Titulo

        System.out.println("----DIGITE O TITULO: ----");

        titulo = entrada.nextLine(); 
        
        
        //---- varendo o ArrayList pasando como parametro o Titulo

        for (Filme filme : listaFilme) {
            
        	//---- comparando o Titulo recebido com o que esta no ArrayList
        	
        	if (filme.getTitulo().equals(titulo)) {
        		
        		//----retornando uma String com as informacoes do Filme---
        		
        		System.out.println("-------------Filme-------------");
                System.out.println("Cliente: "+ filme.getTitulo());
                System.out.println("CPF: "+ filme.getDuracao());
                System.out.println("RG: "+ filme.getAno());
                System.out.println("Telefone: "+ filme.getGenero());
                System.out.println("Endereço: "+ filme.getValorLocacao());
               
                return;
            }
        }
        
        //---- caso nao encontre ----
        
        System.out.println("FILME NAO ENCONTRADO.");
    }
    	
    	
    	
    	
    	
    
    
    
    
    
    //---- GET & SET ----
    
    public void setListaFilme(List<Filme> listaFilme) {
        this.listaFilme = listaFilme;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

	
    public double getDuracao() {
		return duracao;
	}



    public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

    
}