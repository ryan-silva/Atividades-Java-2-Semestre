package br.com.bandtec.projeto17.estaticos;


public class Cidadao {
    //Quando um atributo é "static" chamamos ele de 
    //Atributo de CLASSE
    public static String NACIONALIDADE = "brasileiro(a)";
    
    //Atributo de CLASSE
    public static Integer IDADE_MINIMA_VOTACAO = 16;
    
    
    /*
    marcar um atributo com "final" é torna-lo IMUTÁVEL
    Ou seja, é como o "const" no JavaScript
    Em Java é comum chamarmos isso de CONSTANTE
    "Hino é uma constante"
    */
    public static final String HINO = "Ouviram do Ipiranga...";
    
    /*
    A convenção para nomes de atributos de classe 
    é SNAKE_CASE_UPPER_CASE
    (tudo caixa alta e separado por underline_ )
    */
    
    private String nome;
    
    
    /*
    métodos static (estáticos) não precisam de uma instância
    para serem invocados .
    
    E não manipulam atributos de intância internamente
    */
    public static void pagarImpostoRenda(){
      System.out.println("Pagando absturdos em impostos! ");   
    }

    
    /*
    O "final" também pode estar em parametros de métodos 
    e em variaveis locais(criadas dentro desse método).
    Nesse caso também são constantes(ou imutaveis)
    */
    public void setNome(final String nome) {
        System.out.println(
                "Mais um(a) brasileiro ganhando nome " +nome);
        //nome = "José";
        //a instrução acima nem compila, pois "nome" é imutável
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
    
}
