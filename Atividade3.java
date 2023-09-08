//Peça ao usuario para digitar tres valores inteiros e imprima a soma deles.

import java.util.Scanner;

public class Atividade3 {
    public static void main(String[] args) {

      Scanner scanner= new Scanner(System.in);
      System.out.println("DIGITE O PRIMEIRO NUMERO: ");
      int n1 = scanner.nextInt();
      System.out.println("DIGITE O SEGUNDO NUMERO: ");
      int n2 = scanner.nextInt();
      System.out.println("DIGITE O TERCEIRO NUMERO: ");
      int n3 = scanner.nextInt();
      System.out.println("A SOMA DOS NUMEROS: " +(n1+n2+n3));
    }

}
