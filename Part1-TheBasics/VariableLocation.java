public class VariableLocation {

    public static void main(String[] args) {
       int number = 1;
       System.out.println("The value of the number in the main program: " + number);
       incrementByThree(number);
       System.out.println("The value of the number in the main program: " + number);
    }
 
    public static void incrementByThree(int number) {
       System.out.println("The value of the number in the  method: " + number);
       number = number + 3;
       System.out.println("The value of the number in the  method: " + number);
    }
 }