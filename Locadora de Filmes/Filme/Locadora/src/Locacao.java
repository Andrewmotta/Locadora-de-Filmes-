
import java.util.Date;

public class Locacao {

    //----Variaveis----
	private Date data;
    private double valorTotalAPagar;
    private Filme listaFilmes;

    
    
    //---- Construtor -----
    public Locacao() {
        this.data = data;
        this.valorTotalAPagar = valorTotalAPagar;
        this.listaFilmes = listaFilmes;
    }

   
    
    
    
    // Funções Adicionas do Filme
    
    
    public void Locacao() {

    }

    public void Locacao(Date data) {

    }

    public void addFilme(Filme filme) {
        listaFilmes = filme;
    }

   
    
    
    
    
    //----GET & SET----
    public Date getData() {
        return this.data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValorTotalAPagar() {
        return this.valorTotalAPagar;
    }

    public void setValorTotalAPagar(double valorTotalAPagar) {
        this.valorTotalAPagar = valorTotalAPagar;
    }
}
