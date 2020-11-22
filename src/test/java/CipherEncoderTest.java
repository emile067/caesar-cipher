import org.junit.*;

import static org.junit.Assert.*;

public class CipherEncoderTest {

    @Test
    public void runCipher_oneCharacter(){
        CipherEncoder testCipher = new CipherEncoder();
        String expectedOutput = "f";
        testCipher.setWord("e");
        testCipher.setKey(1);
        assertEquals(expectedOutput, testCipher.runEncoder());
    }
    @Test
    public void runCipher_oneCharacter_includeUpperCAse(){
        CipherEncoder testCipher = new CipherEncoder();
        String expectedOutput = "F";
        testCipher.setWord("E");
        testCipher.setKey(1);
        assertEquals(expectedOutput, testCipher.runEncoder());
    }
    @Test
    public void runCipher_oneCharacter_encodedExceedsRangeRightShiftA_Z(){
        CipherEncoder testCipher = new CipherEncoder();
        String expectedOutput = "b";
        testCipher.setWord("x");
        testCipher.setKey(4);
        assertEquals(expectedOutput, testCipher.runEncoder());
    }
    @Test
    public void runCipher_oneCharacter_encodedExceedsRangeLeftShiftA_Z(){
        CipherEncoder testCipher = new CipherEncoder();
        String expectedOutput = "x";
        testCipher.setWord("b");
        testCipher.setKey(-4);
        assertEquals(expectedOutput, testCipher.runEncoder());
    }
    @Test
    public void runCipher_oneWordString(){
        CipherEncoder testCipher = new CipherEncoder();
        String expectedOutput = "jgnnq";
        testCipher.setWord("hello");
        testCipher.setKey(2);
        assertEquals(expectedOutput, testCipher.runEncoder());
    }
    @Test
    public void runCipher_oneWordString_withUpperCase(){
        CipherEncoder testCipher = new CipherEncoder();
        String expectedOutput = "JgnnQ";
        testCipher.setWord("HellO");
        testCipher.setKey(2);
        assertEquals(expectedOutput, testCipher.runEncoder());
    }
    @Test
    public void runCipher_multipleWords_withSpacing(){
        CipherEncoder testCipher = new CipherEncoder();
        String expectedOutput = "QEB NRFZH YOLTK CLU GRJMP LSBO QEB IXWV ALD";
        testCipher.setWord("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG");
        testCipher.setKey(23);
        assertEquals(expectedOutput, testCipher.runEncoder());
    }
}