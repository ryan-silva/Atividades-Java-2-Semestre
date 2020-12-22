package projetoCarro;

public class Carro {
    
    private Boolean ligado = false;
    private String modelo;
    private Integer marcha = 0;
    private Double velocidade = 0.0;
    
    public Boolean isLigado() {
        return ligado;
    }

    public String getModelo() {
        return modelo;
    }

    public Integer getMarcha() {
        return marcha;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public Carro(String modelo) {
        this.modelo = modelo;
    }
    
    void ligarCarro(){
         this.ligado = true;
        }

    
   void acelerar(){
        if (this.ligado = true) {
            if(this.velocidade >= 120){
                this.velocidade = 120.0;
        }
         this.velocidade += 10;
    }
    }
   

   void frear(){
               if (this.ligado == true) {
            if (this.velocidade <= 0) {
                this.velocidade = 0.0;
            }
        }
         this.velocidade -= 10;
    }
   
   void aumentarMarcha(){
      if(this.marcha > 5){
           this.marcha = 5;
       }
       this.marcha++;
   }
   
   void diminuirMarcha(){
        if (this.marcha > -1) {
           this.marcha = -1;
       }
       this.marcha--;
   }


}

