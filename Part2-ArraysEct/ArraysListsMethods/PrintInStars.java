public class PrintInStars {

    public static void main(String[] args){

        int[] arr = {5,1,4,2};
        PrintCoolStars(arr);

    }

    public static void PrintCoolStars(int[] nums){

        for(int i = 0; i < nums.length; i++){

            for(int a = 0; a < nums[i]; a++) {
                System.out.print("*");
            }

            System.out.println("");

        }

    }
    
}
