public class SumOfArray {

    public static void main(String[] args){

        int[] nums = {1,2,3,4,89,9};


        System.out.println(  sumOfNumbers(nums)  );

    }

    public static int sumOfNumbers(int[] numslist) {

        int summed = 0;

        for(int i = 0; i<numslist.length; i++){
            summed += numslist[i];
        }
            
        return(summed);

    }
    
}
