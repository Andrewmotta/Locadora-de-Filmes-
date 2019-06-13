
import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

            Scanner entrada = new Scanner(System.in);
           
            
            Cliente cliente = new Cliente();
            Filme filme = new Filme();
           
            
            int op = 0;
            int ops = 0;

         
            
         while( op != 3) {
            
            
            System.out.println("-------MENU PRINCIPAL----");
            System.out.println("(1) Login");
            System.out.println("(2) Cadsto de Cliente");
            System.out.println("(3) Sair" );
            System.out.println("");
            System.out.println("(4) ADM");
            
            op = entrada.nextInt();
       
      
            if(op == 1) {
            	cliente.login();
            		
            	
            }else if(op == 2) {
            	cliente.cadastraCliente();
            	
       
            	//-----SAIR-----
            	
            }else if(op == 3) {
            	
            	 System.out.println("tem certeza(1) sim (2) nao");
         	    op = entrada.nextInt();
         	    if(op == 1) {
         	    op = 3;
         	    }else {
         	    	op = 0;
         	    }
            	
            	
            	
            	//----ADM---
         	    
            }else if(op == 4) {
            	   
           while(ops != 7) {
        	   
        	   System.out.println("------MENU ADM------");
        	   System.out.println("(1) Pesquisa Cliente");
        	   System.out.println("(2) Lista de Clientes");
        	   System.out.println("(3) Excluir Cliente");
        	   System.out.println("(4) Cadastra Filme");
        	   System.out.println("(5) Excluir Filme");
        	   System.out.println("(6) Liste de filmes");
        	   System.out.println("(7) Sair");
        	   
        	   ops = entrada.nextInt();
        	   
        	   if(ops == 1) {
        		   cliente.pesquisaCliente();
        	   
        	   }else if(ops == 2) {
        		   cliente.listaCliente();
        		   
        	   }else if(ops == 3) {
        		   cliente.excluiCliente();
        		   
        	   }else if(ops == 4) {
        		   filme.cadastraFilme();
        		   
        	   }else if(ops == 5) {
        		   filme.excluiFilme();
        		   
        	   }else if(ops == 6) {
        		   filme.listaFilme();
        		   
        	   }else if(ops == 7) {
        		   System.out.println("tem certeza(1) sim (2) nao");
            	    op = entrada.nextInt();
            	    if(op == 1) {
            	    ops = 7;
            	    }else {
            	    	ops = 0;
               }
       	     }   
           }
        }   
      }
    }
 }
            
            
            
            
            
       
            
            
            
            
            
      