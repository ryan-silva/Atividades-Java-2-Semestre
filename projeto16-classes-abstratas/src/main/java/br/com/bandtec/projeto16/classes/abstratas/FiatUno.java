package br.com.bandtec.projeto16.classes.abstratas;

/*
A classe concreta FiatUno IMPLEMENTA a classe abstrata Carro
*/
public class FiatUno extends Carro{

    public FiatUno() {
        
       marca = "FIAT";
       modelo = "Uno";
       cilindradas = 1000;
       velocidadeMaxima = 130.0;
       
    }

    @Override
    public void trocarMarcha() {
        /*
        Em classes abstratas podemos criar métodos abstratos
        São métodos que só possuem assinatura mas não o corpo
        */
        System.out.println(
                "Trocando marcha no uno e puxando para ré");
    }
    
    
    
}
