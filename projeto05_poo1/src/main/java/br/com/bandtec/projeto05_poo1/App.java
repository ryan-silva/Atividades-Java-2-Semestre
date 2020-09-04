package br.com.bandtec.projeto05_poo1;

public class App {

    public static void main(String[] args) {
        
        for (Integer i = 0; i <= 10; i++) {
            if ( i % 2 == 0) {
                System.out.println(String.format("%d é par ", i));
            }else{
                System.out.println(String.format("%d é ímpar", i));
            }
        }
        
        Integer numero = 0;
        
        while (numero <= 10) {            
            System.out.println(numero);
            numero++;
        }
    }
    
}
