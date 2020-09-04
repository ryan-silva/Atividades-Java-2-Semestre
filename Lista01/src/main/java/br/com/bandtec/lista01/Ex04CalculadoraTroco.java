package br.com.bandtec.lista01;


public class Ex04CalculadoraTroco {
    
    public static void main(String[] args) {
        
    Double valorUnit = 24.99;

    Integer qtdVendida = 6;
    
    Double total = valorUnit * qtdVendida;
    
    Double valorPago = 200.00;
    
        System.out.println(String.format("Seu troco será de R$%.2f",(valorPago-total)));
        
    }
}
