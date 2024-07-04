import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

        //O programa encontrará todos os divisores um número
        
        Scanner console = new Scanner(System.in);
         
        System.out.print("Digite um número :  ");
        int num = console.nextInt();
         
        System.out.print("Divisores de " + num+" "+ "="+" " );
        //imprimi os divisores

        /*Se o resto for 0 quando num for dividido por 'i', 
    então imprima i, caso contrário, pule para a próxima iteração
        */
         
        for (int i = 1; i < num; i++) {
             if (num % i != 0) {
                continue;
            }
            System.out.print(i + " , ");
        }
    }
}
