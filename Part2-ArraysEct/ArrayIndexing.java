import java.util.Scanner;


public class ArrayIndexing {

    public static void main(String[] args) {

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 5;
        numbers[2] = 7;

        printlist(numbers);

        Scanner scanner = new Scanner(System.in);

        int inp1 = Integer.valueOf(scanner.nextLine());
        int inp2 = Integer.valueOf(scanner.nextLine());

        int help = numbers[inp1];

        numbers[inp1] = numbers[inp2];
        numbers[inp2] = help;

        printlist(numbers);

        scanner.close();

    }

    public static void printlist(int[] nums) {
        for(int i = 0; i < nums.length; i++ ) {
            System.out.println(nums[i]);

            }
    }
}

