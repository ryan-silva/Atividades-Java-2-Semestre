package br.com.bandtec.projeto17.estaticos;


public class ProgramaCidadao {
    
    public static void main(String[] args) {
        /*
        Atributos estáticos(static) ou atributos de classe
        podem ser obtidos diretamente da classe, sem instanciá -la
        */
        String nacionalidadeTodos = Cidadao.NACIONALIDADE;
        
        Cidadao brazuca = new Cidadao();
        System.out.println(brazuca.NACIONALIDADE);
        System.out.println(brazuca.IDADE_MINIMA_VOTACAO);
        
        //Brasil perdeu a guerra para os EUA após 7 minutos
        Cidadao.NACIONALIDADE = "Havaiano(a) do sul";
        Cidadao.IDADE_MINIMA_VOTACAO = 14;
        
        System.out.println(brazuca.NACIONALIDADE);
        System.out.println(brazuca.IDADE_MINIMA_VOTACAO);
        
        //invocando um método estático
        // ou seja direto da classe
        Cidadao.pagarImpostoRenda();
        
        System.out.println(Cidadao.HINO);
        
//        Cidadao.HINO = "Oh can't you see...";
        //HINO é constante!
        
        brazuca.setNome("José Silva");
        System.out.println(brazuca.getNome());
        
        brazuca.setNome("João Sousa");
        System.out.println(brazuca.getNome());
      
    }
    
}
