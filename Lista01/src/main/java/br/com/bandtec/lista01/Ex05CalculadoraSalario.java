package br.com.bandtec.lista01;


public class Ex05CalculadoraSalario {

    public static void main(String[] args) {
        
        Double salario = 4500.00;
        
        Double imposto = salario * 0.2;
        
        System.out.println(String.format("Salário liquido: R$%.2f",(salario-imposto)));
        
        
        
        
        
    }
    
}
