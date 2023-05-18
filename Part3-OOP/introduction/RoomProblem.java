package introduction;
public class RoomProblem{



        public static class Room{

                private String code;
                private int seats;

                public Room(String code, int seats){
                        this.code = code;
                        this.seats = seats;
                }

                public void printcode(){
                        System.out.println(this.code);
                }
        
        }

        public static void main(String[] args){

                Room aud1 = new Room("123",50);

                aud1.printcode();


        }
}

