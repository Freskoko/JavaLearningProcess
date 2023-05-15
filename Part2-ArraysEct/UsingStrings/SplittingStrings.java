import java.util.Scanner;

public class SplittingStrings {

    public static void main(String[] args){

        linebyline();

    }

    public static void linebyline() {

        Scanner scanner = new Scanner(System.in);

        String longstr = "";

        while (true) {
            String stringin = String.valueOf(scanner.nextLine());

            if (stringin.equals("")) {
                break;
            }
            else{
                longstr+=stringin+" ";
            }

        }

        String[] parts = longstr.split(" ");

        for (int i = 0; i < parts.length; i++){
            // if(parts[i].contains("av")) {
                System.out.println(parts[i]);
            // }
        }


        scanner.close();
    }
    
}
