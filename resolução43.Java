package resolucao43;

 import java.util.Scanner;

public class principal {

    public static void main(String[]args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
           double preco = entrada.nextDouble();

        System.out.println("O valor do produto com desconto é de: ");
           double desc = preco-(preco * 0.10);
             System.out.println("desc");
           
        System.out.println("O Valor do produto parcelado em 3x é de: ");
            double parcelado = preco / 3;
             System.out.println("parcelado");


        System.out.println("O valor do produto com desconto e a comissão é de: ");
            double cvendedor = desc + (desc * 0.05);
             System.out.println("cvendedor");

        System.out.println("O valor do produto e a comissão é de: ");
          double pecvendedor = preco +(preco * 0.05);
             System.out.println("pecvendedor");
 
    }
}
