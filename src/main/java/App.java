import java.io.Console;
public class App {
    public static void main(String[] args){
        Console myConsole = System.console();
        CipherEncoder newEncoder = new CipherEncoder();
        CipherDecoder newDecoder = new CipherDecoder();
        System.out.println("Enter the message you wish to encode:");
        String message = myConsole.readLine();
        newEncoder.setWord(message);
        System.out.println("Enter the key:");
        int cipherKey = Integer.parseInt(myConsole.readLine());
        newEncoder.setKey(cipherKey);
        System.out.println("Encoded string: "+newEncoder.runEncoder());
        newDecoder.setWord(newEncoder.getOutput());
        newDecoder.setKey(newEncoder.getKey());
        System.out.println("Decoded string: "+newDecoder.runDecoder());
    }
}
