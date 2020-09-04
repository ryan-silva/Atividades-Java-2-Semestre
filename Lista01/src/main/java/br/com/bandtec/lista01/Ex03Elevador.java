package br.com.bandtec.lista01;


public class Ex03Elevador {
    
    
    public static void main(String[] args) {
        Double limitElevador = 560.20;
        
        Integer limitPessoas = 8;
        
        Double pessoa1 = 70.45;
        
        Double pessoa2 = 85.68;
        
        Double pessoa3 = 55.32;
        
        System.out.println(String.format("Entraram 3 pessoas no elevador, no qual cabem %d pessoas. \n "
                + "O peso total no elevador é de %.2f, sendo que ele  suporta %.2f",limitPessoas,
                (pessoa1+pessoa2+pessoa3),limitElevador)
                 );
    }
}
