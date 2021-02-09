package commonpatterns;

import java.util.Scanner;

public class InversePyramidPattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows you want to print: ");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int i = 0 ; i <= rows; i++){
            for(int j = 0 ; j < i; j++){
                System.out.print(" ");
            }
            for(int j = i; j <= rows; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
