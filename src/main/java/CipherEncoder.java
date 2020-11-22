public class CipherEncoder {

    public String runEncoder(String word, int cipher){
        String output="";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char inputs = word.charAt(0);
        int index;
        if (Character.isUpperCase(inputs)){
            index = upperCase.indexOf(inputs);
            output += upperCase.charAt(index+cipher);
            return output;
        }else if (Character.isLowerCase(inputs)){
            index = lowerCase.indexOf(inputs);
            output += lowerCase.charAt(index+cipher);
            return output;
        }else{
            return output;
        }
    }
}
