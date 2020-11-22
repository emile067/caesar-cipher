import java.io.Console;
public class App {
    public static void main(String[] args){
        Console myConsole = System.console();
        CipherEncoder newEncoder = new CipherEncoder();
        CipherDecoder newDecoder = new CipherDecoder();
        System.out.println("Enter the message you wish to encode:");
        String message = myConsole.readLine();
        System.out.println(message);
        System.out.println("Enter the key:");
        int cipherKey = Integer.parseInt(myConsole.readLine());
        System.out.println(message);
////        String encodedString = newEncoder.runEncoder();
//        System.out.println("Encoded String:" + encodedString);
    }
}
