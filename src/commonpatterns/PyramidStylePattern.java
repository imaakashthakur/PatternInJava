package commonpatterns;//    *
//   ***
//  *****
// *******

import java.util.Scanner;

public class PyramidStylePattern {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows you want to print: ");

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int i=0; i<rows; i++) //outer loop for number of rows(n) { for (int j=n-i; j>1; j--) //inner loop for spaces
        {
            for(int j = rows - i ; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
  }
}

