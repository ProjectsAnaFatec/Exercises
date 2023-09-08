//Faça um programa que leia um numero inteiro e o imprima.
import java.util.Scanner;
import javax.swing.JOptionPane;
public class Atividade1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("DIGITE UM NUMERO INTEIRO: ");
        int n1 = scanner.nextInt();
        System.out.print("O NÚMERO INTEIRO DIGITADO FOI: " + n1);
        
        
        
    }
}

//JOptionPane.showInputDialog("DIGITE UM NUMERO INTEIRO:");
//int n2 = scanner.nextInt();
//JOptionPane.showMessageDialog(null,"O NUMERO DIGITADO FOI: " + n2);
//scanner.close();