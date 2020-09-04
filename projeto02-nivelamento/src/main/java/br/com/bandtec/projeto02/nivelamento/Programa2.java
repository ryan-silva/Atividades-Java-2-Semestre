package br.com.bandtec.projeto02.nivelamento;


public class Programa2 {
    
    public static void main(String[] args) {
        
        String passageiro = "Ryan";
        Integer viagensDia = 4;
        Double creditoBU = 119.5;
        
        //considerando que a passagem é 4,40
        Double viagensPossiveis = creditoBU / 4.4;
        
        //ex: 8.2 -> 8
        Integer viagensPossiveisInteiro = viagensPossiveis.intValue();
        System.out.println(passageiro + " pode fazer " + viagensPossiveisInteiro + " viagens" );
        
        //calcule e exiba para quamtos dias a quantidade de credito no BU ainda é suficiente
        // "a quantidade de credito dá para X dias de trabalho" (número inteiro)
        
        Double diasRestantes = viagensPossiveis / viagensDia;
        Integer diasRestantesInteiro = diasRestantes.intValue();
        
        System.out.println("A quantidade de credito dá para "+ diasRestantesInteiro + " dias de trabalho" );
        
        
    }
    
}
