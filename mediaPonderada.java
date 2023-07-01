import java.util.Scanner;

public class mediaPonderada{
    public static void main(String[]args) {
        Scanner teclado = new Scanner(System.in);
        
        double nota1, nota2, nota3, peso1, peso2, peso3;
        
        nota1 = teclado.nextDouble();
        peso1 = teclado.nextDouble();
        
        nota2 = teclado.nextDouble();
        peso2 = teclado.nextDouble();
        
        nota3 = teclado.nextDouble();
        peso3 = teclado.nextDouble();
        
        double pesoTotal = peso1 + peso2 + peso3;
        
        
        double resultado = ((peso1*nota1) + (peso2*nota2) + (peso3*nota3)) / pesoTotal;
    
        System.out.printf("%.2f", resultado);
        
     }    
}