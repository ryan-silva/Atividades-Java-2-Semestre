package br.com.bandtec.lista01;


public class Ex08BolsaFilhos {

    public static void main(String[] args) {
        
        Integer filhos0a3 = 2;
        
        Integer filhos4a16 = 1;
         
        Integer filhos17a18 = 1;
        
        Integer totFilhos = filhos0a3 + filhos4a16 + filhos17a18;
        
        Double bolsa =  (filhos0a3*25.12) + (filhos4a16*15.88) + (filhos17a18*12.44);
        
        System.out.println(String.format("Você tem um total de %d filhos e vai receber R$%.2f de bolsa",
                totFilhos,bolsa));
        
        
    }
    
}
