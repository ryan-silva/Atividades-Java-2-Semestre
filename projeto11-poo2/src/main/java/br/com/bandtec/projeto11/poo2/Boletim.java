package br.com.bandtec.projeto11.poo2;


public class Boletim {
    
    private Double mediaMinima;
    private Double frequenciaMinima;
    
    private Double mediaAtual;
    private Double frequenciaAtual;
    
    private Boolean aprovado;

    // Isto é um CONSTRUTOR 
    /*  
    É um tipo especial de método usado para criar (ou seja, Instanciar)
    um objeto (no caso, um objeto do tipo Boletim)
    */

    public Boletim(Double mediaMinima, Double frequenciaMinima) {
        this.mediaMinima = mediaMinima;
        this.frequenciaMinima = frequenciaMinima;
    }
   
    
    void analisar(Double media, Double frequencia){
        this.mediaAtual = media;
        this.frequenciaAtual = frequencia;
        
        this.aprovado = this.mediaAtual >= this.mediaMinima 
               && this.frequenciaAtual >= this.frequenciaMinima;
        
           //O de cima é a mesma coisa que isso:
//        if (this.mediaAtual >= this.mediaMinima 
//                && this.frequenciaAtual >= this.frequenciaMinima) {
//            aprovado = true;
//        }else{
//            aprovado = false;
//        }
   
   }

    public Boolean getAprovado() {
        return aprovado;
    }
    
        
    }
    
    

