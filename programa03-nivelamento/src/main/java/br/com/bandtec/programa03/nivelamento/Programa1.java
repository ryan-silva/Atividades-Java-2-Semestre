package br.com.bandtec.programa03.nivelamento;


public class Programa1 {
    
    public static void main(String[] args) {
        
//        Integer num1 = 6;
//        
//        if (num1 > 10) {
//            System.out.println("É maior");
//        }else if(num1 == 6){
//            System.out.println("É igual");
//        }else{
//            System.out.println("É menor");
//        }
//        
        String nome = "Ryan";
        
        String nome2 = "José";
        
        if (nome.equals(nome2)) {
            System.out.println("Nome está correto");
        }else{
            System.out.println("O nome está errado");
        }
        
          Integer num2 = 6;
        
        if (num2.equals(6)) {
            System.out.println("É igual");
        }
        
        String sobrenome = "Rodrigues";
        
        if (nome.equals("Ryan")&& sobrenome.equals("Rodrigues")) {
            System.out.println("São iguais");
        }else{
            System.out.println("Não são iguais");
        }
        
        String usuario = "admin";
        
        String senha = "@admin123";
        
        if (usuario.equals("admin")&& senha.equals("@admin123")) {
            System.out.println("Acesso garantido");
        }else{
            System.out.println("Usuário e/ou senha inválidos");
        }
        
        Integer idade = 37;
        
        if (usuario.equals("admin") || idade == 37) {
            System.out.println("Passou");
        }else{
            System.out.println("Não passou");
        }
              
        Integer par = 42;
        
        if (par % 2 == 0) {
            System.out.println("É par");
        }else{
            System.out.println("É impar");
        }
        
    }
    
}
