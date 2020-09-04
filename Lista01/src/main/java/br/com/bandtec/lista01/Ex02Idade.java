package br.com.bandtec.lista01;


public class Ex02Idade {
    public static void main(String[] args) {
        
        String nome = "Carlos";
        
        Integer anoNascimento = 1998;
        
        System.out.println(String.format("Qual é o seu nome? \n %s",nome));
        
        System.out.println(String.format("Olá %s! qual o ano de seu nascimento? \n %d",nome,anoNascimento));
        
        System.out.println(String.format("Em 2030 você terá %d anos",(2030-anoNascimento)));
        
        
        
        
    }
}
