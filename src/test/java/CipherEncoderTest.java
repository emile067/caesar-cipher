import org.junit.*;

import static org.junit.Assert.*;

public class CipherEncoderTest {

    @Test
    public void runCipher_oneCharacter(){
        CipherEncoder testCipher = new CipherEncoder();
        String expectedOutput = "f";
        assertEquals(expectedOutput, testCipher.runEncoder("e",1));
    }
    @Test
    public void runCipher_oneCharacter_includeUpperCAse(){
        CipherEncoder testCipher = new CipherEncoder();
        String expectedOutput = "F";
        assertEquals(expectedOutput, testCipher.runEncoder("E",1));
    }
    @Test
    public void runCipher_oneCharacter_encodedExceedsRangeA_Z(){
        CipherEncoder testCipher = new CipherEncoder();
        String expectedOutput = "b";
        assertEquals(expectedOutput, testCipher.runEncoder("x",4));
    }
}