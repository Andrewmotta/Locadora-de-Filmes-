

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.crypto.Data;


public class Cliente {

    //----Variaveis----
	
    private String nome;
    private String cpf;
    private String rg;
    private String dataAdd;
    private String endereco;
    private String telefone;
    
   //----Construtor----
    
    public Cliente() {

        this.nome = nome;
        this.dataAdd = dataAdd;
        this.rg = rg;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        
    }
    

    Scanner entrada = new Scanner(System.in);

    public ArrayList<Cliente> listaCliente = new ArrayList<Cliente>();

    Filme filme = new Filme();
    
    // Metodos de manipulacao do cliente
    
    public void login() {
    	
//---- variaves auxiliases 
    	
        String cpf;
        int op = 0;
        
        //----recebendo o CPF

        System.out.println("----DIGITE O SEU CPF: ----");

        cpf = entrada.nextLine(); 
        
        
        //---- varendo o ArrayList pasando como parametro o CPF

        for (Cliente cliente : listaCliente) {
            
        	//---- comparando o CPF recebido com o que esta no ArrayList
        	
        	if (cliente.getCpf().equals(cpf)) {
        		
        		
   
        		
        		
        		
        		while(op != 5) {
        		
        		
                System.out.println("------Menu do Cliente------- ");
                System.out.println("(1) Suas Informações ");
                System.out.println("(2) Lista Filme ");
                System.out.println("(3) Pesquisa Filme: ");
                System.out.println("(4) Alugar Filme ");
                System.out.println(" ");
                System.out.println("(5) Sair");
                
                if(op == 1) {
                	
                	System.out.println("Cliente: "+ cliente.getNome());
                    System.out.println("CPF: "+ cliente.getCpf());
                    System.out.println("RG: "+ cliente.getRg());
                    System.out.println("Telefone: "+ cliente.getTelefone());
                    System.out.println("Endereço: "+ cliente.getEndereco());
                    System.out.println("Data de adesão: "+ cliente.getDataAdd());
                	
                	
                }else if(op == 2) {
                	filme.listaFilme();
                	
                }else if(op == 3) {
                	filme.PesqFilme();
                	
                }else if(op == 4) {
                	filme.locaFilme();
        	
                }else if(op == 5) {
                	
                	return;
                	
                }else {
                	System.out.println("Comando invalido");
                	
                }
        		
        		
        		
        		
        		}
        	}
        }
        
        //---- caso nao encontre ----
        
        System.out.println("CLIENTE NAO ENCONTRADO.");
    }

    
    public void cadastraCliente() {

        Cliente cliente = new Cliente();
        
             //----MENU----

        System.out.println("---- CADASTRAR CLIENTE ----");

        System.out.println("NOME: ");
        cliente.setNome(entrada.nextLine());

        System.out.println("CPF: ");
        cliente.setCpf(entrada.nextLine());

        System.out.println("RG: ");
        cliente.setRg(entrada.nextLine());
        
        System.out.println("ENDERECO: ");
        cliente.setEndereco(entrada.nextLine());

        System.out.println("TELEFONE: ");
        cliente.setTelefone(entrada.nextLine());

        
        System.out.println("Data de Adesão: ");
        cliente.setDataAdd(entrada.nextLine());
       //--- Adicionando as informacoes ao Arrylist
        
        listaCliente.add(cliente);

    }

    public void pesquisaCliente() {

    	//---- variaves auxiliases 
    	
        String cpf;
        boolean resul;
        
        //----recebendo o CPF

        System.out.println("----DIGITE O CPF: ----");

        cpf = entrada.nextLine(); 
        
        
        //---- varendo o ArrayList pasando como parametro o CPF

        for (Cliente cliente : listaCliente) {
            
        	//---- comparando o CPF recebido com o que esta no ArrayList
        	
        	if (cliente.getCpf().equals(cpf)) {
        		
        		//----retornando uma String com as informacoes do clienete---
        		
        		System.out.println("-------------Cliente----------");
        		System.out.println("Cliente: "+ cliente.getNome());
                System.out.println("CPF: "+ cliente.getCpf());
                System.out.println("RG: "+ cliente.getRg());
                System.out.println("Telefone: "+ cliente.getTelefone());
                System.out.println("Endereço: "+ cliente.getEndereco());
                System.out.println("Data de adesão: "+ cliente.getDataAdd());
                return;
            }
        }
        
        //---- caso nao encontre ----
        
        System.out.println("CLIENTE NAO ENCONTRADO.");
    }

   
    public void excluiCliente() {

    	//---- variaves auxiliases 
    	
        String cpf;
        int verif = 0;

        //----recebendo o CPF
        
        System.out.println("DIGITE O CPF: ");
        cpf = entrada.nextLine();

        //---- varendo o ArrayList pasando como parametro o CPF
        
        for (Cliente cliente : listaCliente) {
        	
        	//---- varendo o ArrayList pasando como parametro o CPF
        	
            if (cliente.getCpf().equals(cpf)) {
            	
            	//----retornando uma String com nome e CPF---
            	
                System.out.println("Cliente: "+ cliente.getNome() + " | " + "CPF: "+cliente.getCpf());
                System.out.println("");
            }
        }

        //----retornando uma String de verificacao
        
        System.out.println("DESEJA REALMENTE REMOVER ESTE CLIENTE? (1) SIM (2)NÃO");
        
        verif = entrada.nextInt();

        //--- caso selecione 1 o cliente e removido do ArrayList
        if (verif == 1) {
            listaCliente.remove(cpf);
        }
        
        //---- caso 2 nao retorna nada 
        
        else {
            return;
        }
    }

    
    public void listaCliente() {
        for (Cliente cliente : listaCliente) {
                		
        		//----retornando uma String com nome, CPF e telefone---
        		System.out.println("-----------Clienete--------------");
                System.out.println("Cliente: "+ cliente.getNome());
                System.out.println("CPF: "+ cliente.getCpf());
                System.out.println("Telefone: "+ cliente.getTelefone());
    }
    
    }
    
    
    
    //----GET & SET----
    
    
    public Scanner getEntrada() {

        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

	
    public String getRg() {
		return rg;
	}

	
    public void setRg(String rg) {
		this.rg = rg;
	}

	
    public String getDataAdd() {
		return dataAdd;
	}


	public void setDataAdd(String dataAdd) {
		this.dataAdd = dataAdd;
	}



}
