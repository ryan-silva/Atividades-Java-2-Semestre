package br.com.bandtec.lista01;


public class Ex10CalculadoraCalorias {
    
    public static void main(String[] args) {
        
        Integer aquecimento = 30;
        Integer exerAero = 40;
        Integer exerMusc = 35;
        
        System.out.println(String.format("Olá Jorge. Você fez um total de %d minutos de exercícios"
                + "e perdeu cerca de %d calorias", (aquecimento+exerAero+exerMusc),((aquecimento*12)+(exerAero*20)+(exerMusc*25))));
        
    }
    
}
