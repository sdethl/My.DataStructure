package leetcode.Apple;

public class RemoveConsecutive {

    public String removeCon(String str){

        int len = str.length();
        if( len == 1){
            return str;
        }
        str = lowCaseLetterOnly(str);
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<len; i++){

            // Consider corner cases first
            if( i == 0 ){
                if( str.charAt(i) != str.charAt(i+1)){
                    sb.append(str.charAt(i));
                }
            }
            else if( i == len-1 ){
                if( str.charAt(i) != str.charAt(i-1) ){
                    sb.append(str.charAt(i));
                }
            }
            else if( str.charAt(i) != str.charAt(i+1) && str.charAt(i) != str.charAt(i-1)){
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    private String lowCaseLetterOnly(String str){
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
}
