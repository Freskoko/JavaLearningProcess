import java.util.Scanner;

public class OutsideOfIndex {

    public static void main(String[] args) {

        String[] words = {"hey","two","three","cat"};

        Scanner scanner = new Scanner(System.in);

        int linein = Integer.valueOf(scanner.nextLine());

        try{
            System.out.println(words[linein]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("could not find " + linein);
        }



        scanner.close();
    }
    
}
