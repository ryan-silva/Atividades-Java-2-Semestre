package br.com.bandtec.projeto16.classes.abstratas;


public abstract class Carro {
    
    protected String marca;
    protected String modelo;
    protected Integer cilindradas;
    protected Double velocidadeMaxima;
    
    public abstract void trocarMarcha();           
    
    /*
    Em classes abstratas podemos ter métodos concretos sem problema!
    */
    public void abastecer(){
        System.out.println("Injetando combustível no tanque");
    }
    
}
