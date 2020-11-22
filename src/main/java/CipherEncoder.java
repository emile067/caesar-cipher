public class CipherEncoder {
    private String word;
    private int key;
    public String getOutput() {
        return output;
    }
    private String output="";
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }
    public String runEncoder(){
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] inputs = word.toCharArray();
        for (char input : inputs) {
            int index;
            if (Character.isUpperCase(input)) {
                index = upperCase.indexOf(input) + key;
                if (index > 25) {
                    index = index - 26;
                } else if (index < 0) {
                    index = index + 26;
                }
                output += upperCase.charAt(index);
            } else if (Character.isLowerCase(input)) {
                index = lowerCase.indexOf(input) + key;
                if (index > 25) {
                    index = index - 26;
                } else if (index < 0) {
                    index = index + 26;
                }
                output += lowerCase.charAt(index);
            }else {
                output = output + input;
            }
        }
        return output;
    }
}
