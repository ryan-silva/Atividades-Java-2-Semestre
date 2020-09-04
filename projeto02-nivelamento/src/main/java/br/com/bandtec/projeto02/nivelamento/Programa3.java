package br.com.bandtec.projeto02.nivelamento;


public class Programa3 {
    public static void main(String[] args) {
        
        String cidadao = "Maria";
        Integer filhos = 4;
        Double bolsaFamilia = filhos * 35.9;
        
        String mensagem = 
        String.format("O(a) cidadão(ã) %s tem %d filhos e recebe R$%.2f do governo",cidadao, filhos, bolsaFamilia);
        
        System.out.println(mensagem);
        
        
    }
  
}
