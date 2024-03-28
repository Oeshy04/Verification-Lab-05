import org.junit.Assert;
import org.junit.Test;

public class BinaryToHexadecimalTest {
    @Test // Annotation to indicate this is a test method
    public void shouldConvertBinaryToHex() {
        int binaryInput = 1111;
        String hexExpected = "F"; // Use String to store hexadecimal values
        BinaryToHexadecimal bToH = new BinaryToHexadecimal(); // Use camelCase for variable names
        String hexActual = bToH.binToHex(binaryInput); // Use String to store hexadecimal values
        Assert.assertEquals(hexExpected, hexActual); // Use assertEquals to compare strings
    }
}
