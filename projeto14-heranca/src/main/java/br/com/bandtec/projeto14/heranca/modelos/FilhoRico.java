package br.com.bandtec.projeto14.heranca.modelos;


public class FilhoRico extends PaiRico{

    public FilhoRico(String nome) {
        super(nome);
    }

    @Override
    public void trabalhar() {
        System.out.println(nome+" reduzindo a riqueza");
    }
    
    /*
    Uma classe pode ter métodos que não existem em sua superclasse
    */
    public void ostentar(){
        System.out.println(nome+" gastando a $ com ostentações!");
    }
    
    
}
