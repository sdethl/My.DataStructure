package common;

public class Util {

    public static void swap(int[] array, int i, int j){
        if( i== j ){
            return;
        }
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }

    public static String lowCaseLetterOnly(String str){
        char[] chars = new char[str.length()];
        int j=0;
        for( int i=0; i< chars.length; i++){
            if( Character.isLetter(str.charAt(i))){
                chars[j] = str.charAt(i);
                j++;
            }
        }
        String result = String.copyValueOf(chars).toLowerCase();
        System.out.println("String with letters only: " + result);
        return result;
    }

    public void logFileParser(){

    }

    public void databaseConnection(){

    }

    public int generateRamdomInteger(){
        return 0;
    }

    public boolean isValidEmail(String email){
        return true;
    }
}
