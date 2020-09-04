package br.com.bandtec.lista01;


public class Ex09SalarioLiquido {
    
    public static void main(String[] args) {
        
        Double salarioBruto = 5000.00;
        Double inss = salarioBruto * 0.1;
        Double ir = salarioBruto * 0.2;
        Double condDiaria = 4.4;
        Double descVt = condDiaria * 2 * 22;
        
        
        Double salarioLiq = salarioBruto - (inss + ir + descVt);
        
        System.out.println(String.format("Seu bruto é R$%.2f , tem um total de R$%.2f em descontos"
                + "e receberá um líquido de R$%.2f", salarioBruto,(inss+ir+descVt),salarioLiq));
    }
    
}
