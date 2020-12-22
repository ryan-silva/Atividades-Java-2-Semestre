package br.com.bandtec.projeto14.heranca;

import br.com.bandtec.projeto14.heranca.modelos.FilhoRico;
import br.com.bandtec.projeto14.heranca.modelos.PaiRico;


public class ProgramaHeranca {
    
    public static void main(String[] args) {
        PaiRico pai = new PaiRico("Tio Patinhas");
        FilhoRico filho = new FilhoRico("Zezinho");
        
        pai.trabalhar();
        filho.trabalhar();
        
        System.out.println(pai.getNome());
        System.out.println(filho.getNome());
        
        filho.ostentar();
        
        /* Antes da igualdade é a DECLARAÇÃO
    Na declaração a Java sabe o que o objeto é um tempo de compilação 
    (ou seja, na IDE, enquanto programamos) 
        
        Depois da igualdade é a IMPLEMENTAÇÃO
    na Implementação, é como o objeto vai se comportar
    em tempo de execução (Run Time)
        */
        PaiRico pessoaX = new FilhoRico("Huguinho");
        pessoaX.trabalhar();
        //trabalhar() será da classe FilhoRico 

    }
    
}
