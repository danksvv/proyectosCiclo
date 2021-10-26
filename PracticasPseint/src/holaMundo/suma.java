package holaMundo;

import java.util.Scanner;

public class suma {
    public static void main(String[] args) {
        Scanner keyboardIn = new Scanner(System.in);
        int num1, num2, suma;

        System.out.print("Introduce el primer valor : ");
        num1 = keyboardIn.nextInt();

        System.out.print("\nIntroduce el segundo valor : ");
        num2 = keyboardIn.nextInt();

        suma = num1+num2;

        System.out.println("Resultado : " + num1 + " + " + num2 + " = " + suma);
    }
}
