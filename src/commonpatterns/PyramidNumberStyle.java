package commonpatterns;

public class PyramidNumberStyle {
    public static void main(String[] args) {

        int number = 1;
        int rowWiseNumberCount = 1;
        int space = 4;

        for(int row = 1; row <= 5; row++){
            //Printing spaces
            for(int x = 0; x <= space; x++ ){
                System.out.print("    ");
            }
            space--;
            for(int y =1; y <= rowWiseNumberCount; y++){
                System.out.print( String.format("%2d", number) + "  ");
                number++;
            }
            System.out.println();
            rowWiseNumberCount =  rowWiseNumberCount + 2;
        }
    }
}
