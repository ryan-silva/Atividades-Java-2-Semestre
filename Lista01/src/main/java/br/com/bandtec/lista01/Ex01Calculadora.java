package br.com.bandtec.lista01;


public class Ex01Calculadora {
    
    public static void main(String[] args) {
        
        Double num1 = 100.0;
        Double num2 = 20.0;
        
        System.out.println(String.format("Resultado da soma: \n %.1f \n", (num1 + num2)));
        
        System.out.println(String.format("Resultado da subtração: \n %.1f \n", (num1 - num2)));
        
        System.out.println(String.format("Resultado da multiplicação: \n %.1f \n", (num1 * num2)));
        
        System.out.println(String.format("Resultado da divisão: \n %.1f \n", (num1 / num2)));
        
                
    }
}
