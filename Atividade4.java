//Leia um numero real e imprima o resultado do quadrado desse numero.
import java.util.Scanner;

public class Atividade4 {
    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     System.out.println("DIGITE UM NUMERO REAL");
     double n1 = scanner.nextDouble();
     System.out.println("O QUADRADO DESSE NUMERO É: " +(n1*n1));
    }
}
