import java.util.Scanner;

public class leapyear {

    public static void main(String [] args) {

        Scanner reader = new Scanner(System.in);

        int number = Integer.valueOf(reader.nextLine());

        // int number = 2000;
        boolean leap = false;
        
        if (number % 4 == 0) {

            leap = true;

            if (number % 100 == 0) {
                leap = false;
                if (number % 400 == 0) {
                    leap = true;
        
                } 
            } 
        
        }

    System.out.println(leap);

    reader.close();
    }
}

