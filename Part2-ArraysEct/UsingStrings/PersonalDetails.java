import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {

        LongestNameAndAverageYear();

    }

    public static void LongestNameAndAverageYear(){

        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> years = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();

        while (true) {
            String newline = String.valueOf(scanner.nextLine());

            if (newline.equals("")){
                break;
            }

            String[] splittedline = newline.split(",");

            years.add(Integer.valueOf(splittedline[1]));
            names.add(splittedline[0]);

        }

        int avg = 0;
        String longname = names.get(0);

        for (int i = 0; i < years.size() ; i++){
            avg += years.get(i);
            

            if ( names.get(i).length() > longname.length()){
                longname = names.get(i);

            }

        }

        avg = avg/years.size();

        System.out.println(avg);
        System.out.println(longname);

        scanner.close();

    }
    
}
