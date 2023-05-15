import java.util.ArrayList;
import java.util.Scanner;


public class MethodsArrays {
    
    public static void main(String[] args){
        ArrayList<Integer> longlist = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            longlist.add(i);
        }


        // printNumbersInRange(longlist, 5, 15);
        // System.out.println( printSum(longlist) );
        System.out.println(longlist);
        System.out.println(removeLast(longlist));

    }

    public static ArrayList<Integer> removeLast(ArrayList<Integer> nums) {

        if ( nums.size() == 0){

            return (nums);
        }

        nums.remove( nums.size()-1 );

        return (nums);
    }
    




    public static int printSum(ArrayList<Integer> nums) {
        int allsum = 0;

        for(int num: nums){
            allsum+=num;
        }

        return(allsum);

    }



    public static void testThing() {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner (System.in);

        while (true) {

           String inp = String.valueOf(scanner.nextLine());

            if (inp.isEmpty()) {
                break;
            }
            else {
                list.add(inp);
            }

        }

        String inp2 = String.valueOf(scanner.nextLine());

        if (list.contains(inp2)) {
            System.out.println(inp2 + " was found");
        }
        else {
            System.out.println(inp2 + " was not found");
        }

        scanner.close();

    }

    public static void printNumbersInRange(ArrayList<Integer> numbers, int lowerLimit, int upperLimit) {

        ArrayList<Integer> goodnums = new ArrayList<>();

        for (int num: numbers){
            if (num > lowerLimit && num < upperLimit ) {
                goodnums.add(num);
            }


        }

        for (int goodnum: goodnums) {
            System.out.println(goodnum);
        }

    

    }




}
