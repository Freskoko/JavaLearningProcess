package introduction;

public class WhistleProblem {

        public static class Whistle{

            private String sound;

            public Whistle (String sound){
                this.sound = sound;
            }

            public void playsound(){
                System.out.println(this.sound);
            }

        }

    public static void main(String[] args){

        Whistle duckWhistle = new Whistle("Kvaak");
        // duckWhistle.sound = "bla";
    
        duckWhistle.playsound();
    
        
    }
    
}
