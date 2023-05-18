package introduction;

public class DecreasingCounter {

    public static class Counter{
        private int value;   // a variable that remembers the value of the counter

        public Counter(int initialValue) {
            this.value = initialValue;
        }

        public void ValOut() {
            System.out.println(this.value);
        }

        public void decrement() {
            if (this.value == 0 || this.value < 0)
                System.out.println("value cannot be lower than 0");
            else{
                this.value = this.value -1;
            }
        }

        public void reset(){
            this.value = 0;
        }

    }

    public static void main(String[] args){
        Counter clock = new Counter(3);

        clock.ValOut();
        clock.decrement();
        clock.decrement();
        clock.decrement();
        clock.decrement();
        clock.decrement();

        clock.ValOut();

    }
}
    

