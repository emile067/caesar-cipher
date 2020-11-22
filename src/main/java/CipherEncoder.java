public class CipherEncoder {

    public String runEncoder(String word, int key){
        String output="";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char inputs = word.charAt(0);
        int index;
        if (Character.isUpperCase(inputs)){
            index = upperCase.indexOf(inputs)+key;
            if (index>25){index=index-26;}else if (index<0){index=index+26;}
            output += upperCase.charAt(index);
        }else if (Character.isLowerCase(inputs)){
            index = lowerCase.indexOf(inputs)+key;
            if (index>25){index=index-26;}else if (index<0){index=index+26;}
            output += lowerCase.charAt(index);
        }
        return output;
    }
}
