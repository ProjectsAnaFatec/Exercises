//Leia um numero real e imprima a quinta parte deste numero.

import java.util.Scanner;

public class Atividade5 {
   public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("DIGITE UM NUMERO REAL:");
    double n1 = scanner.nextDouble();
    System.out.println("A QUITA PARTE DESSE NUMERO É: " +(n1/5));
   } 
}
