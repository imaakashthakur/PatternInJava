package commonpatterns;//NOT YET SUCCESSFUL ON THIS


import java.util.Scanner;

public class PyramidStyleWithMirror {
    public static void main(String[] args) {
        System.out.println("Enter the number of rows you want to print: ");

        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();

        for (int i=0; i<rows; i++) {
            for(int j = rows - i ; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=rows-1; i>0; i--) {
            for(int j = rows - i ; j > 1; j--){
                System.out.print(" ");
            }
            for(int j = 0; j < rows-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
