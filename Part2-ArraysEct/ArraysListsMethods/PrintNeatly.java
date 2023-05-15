public class PrintNeatly {
    

    public static void main(String[] args) {

        int[] nums = {5,1,3,4,2};

        PrintGood(nums);



    }

    public static void PrintGood(int[] numbers) {

        String longstr = "";

        for (int i = 0; i < numbers.length; i++){

            
            longstr = longstr+numbers[i];

            if (i != numbers.length-1) {
                longstr = longstr + ", ";
            }
            

        }

        System.out.println(longstr);


    }






}
