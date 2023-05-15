public class IsItTrue {

    public static void main(String[] args){

        String str = "true";
        System.out.println( IsItTrueMaybe(str) );

    }

    public static boolean IsItTrueMaybe(String stringin){

        if ( stringin.equals("true") ) {
            return true;
        }
        else {
            return false;
        }
        
    }
    
}
