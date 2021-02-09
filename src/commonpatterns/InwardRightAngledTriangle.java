package commonpatterns;

import java.util.Scanner;

public class InwardRightAngledTriangle {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows you want to print: ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        for (int i = rows; i >0; i--){ //initiating rows from last index to first
            for(int j = 0; j < i; j++){ //For every row, this will print *. Esma confusion chaina aba
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
