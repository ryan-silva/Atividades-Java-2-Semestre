package br.com.bandtec.projeto14.heranca.modelos;


public class PaiRico {
    
    /*
    Atributos privados (private) NÃO SÃO herdados pela SUBCLASSE
    Para deixar um atributo "quase" privado, mas herdado,
    usamos o nível de acesso 'protected' (protegido)
    o protected permite acesso em classes do mesmo pacote
    */
    protected String nome;

    public PaiRico(String nome) {
        this.nome = nome;
    }

 
    public void trabalhar(){
        System.out.println( nome + " multiplicando a fortuna");
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
