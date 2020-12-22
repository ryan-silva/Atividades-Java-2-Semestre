package br.com.bandtec.projeto16.classes.abstratas;


public class ProgramaCarros {
   
    public static void main(String[] args) {
        //Classes abstratas NÃO podem ser instanciadas
        //Carro carro1 = new Carro();
        
        //Uma classe concreta pode ser instanciada
        FiatUno uno1 = new FiatUno();
        
        //Podemos declarar como Abstrata,
        //porém instaciar como Concreta
        Carro uno2 = new FiatUno();
        
        //Novamente não podemos intanciar classe Abstrata!
//        FiatUno uno3 = new Carro();

        uno1.trocarMarcha();
        uno2.trocarMarcha();
        
        Carro meuA4 = new AudiA4();
        meuA4.trocarMarcha();
        
        uno2.abastecer();
        meuA4.abastecer();
    }
    
}
