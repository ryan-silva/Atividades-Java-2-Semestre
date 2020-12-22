package br.com.bandtec.projeto16.classes.abstratas;

/*
A classe concreta AudiA4 IMPLEMENTA a classe abstrata Carro
*/

public class AudiA4 extends Carro{

    public AudiA4() { 
       marca = "AUDI";
       modelo = "A4";
       cilindradas = 2200;
       velocidadeMaxima = 270.0;
    }
    


    @Override
    public void trocarMarcha() {
        System.out.println(
                "Trocando marcha no A4 com borboletas no volante");
    }
    
    
    
}
