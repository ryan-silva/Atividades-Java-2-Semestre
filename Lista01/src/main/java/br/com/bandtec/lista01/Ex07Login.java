package br.com.bandtec.lista01;

public class Ex07Login {
    
    public static void main(String[] args) {
        
        String login = "marcos_loja";
        
        String senha = "admin123";
        
        Integer erros = 3;
        
        if (login.equals("marcos_loja") && senha.equals("@admin123")) {
            System.out.println("Acesso Garantido");
        }else{
            System.out.println(String.format("Seu login é %s e sua senha é %s.\n "
                    + " Vocè tem %d tentivas antes de ser bloqueado", login,senha,(erros-1)));
        }
    }
    
}
