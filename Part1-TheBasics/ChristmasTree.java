// import java.util.Scanner;

public class ChristmasTree {


    public static void printStars(int number) {
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
       
        
    }

    public static void printRectangle(int width, int height){
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
    }

    public static void printSquare(int size) {
        for (int i = 0; i < size; i++){
            printStars(size);
        }

    }

    public static void printTriangle (int size) {
        for ( int i = 1; i < size+1; i++){

            printSpaces(size+1 - i);

            printStars(i);
        }
    }

    public static void printSpaces (int number) {
        for ( int i = 1; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printAst(int amount){

        for (int i = 1; i < amount+1; i++) {
            System.out.print("*");
        }
    }

    public static void christmasTree(int height) {

        int maxLength = (height*2);
        int halfMaxLength = (maxLength / 2) - 2;
        int spacesminus =  halfMaxLength+2;

        for ( int i = 1; i < height*2; i+=2){
           
            printSpaces(spacesminus);
            printAst(i);
            
            System.out.println("");
            spacesminus -= 1;
        }

        int BottomLength = maxLength - 1;
        int sidelength = (BottomLength/2);
        
        for (int i = 0; i < 2; i++){
            printSpaces(sidelength);
            System.out.print("***");
            printSpaces(sidelength);
            System.out.println("");
        }
    }
    
    public static void main(String[] args) {
        christmasTree(5);
    }

}

// ******** **** *******
