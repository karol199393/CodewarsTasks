import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class NextPowers2 {
    private static int currentValue = 1;

    public static int getNumber() {
        int result = currentValue;
        currentValue *= 2;
        return result;
    }

    @Test
    public void basicTests() {
        assertEquals(1, NextPowers2.getNumber());
        assertEquals(2, NextPowers2.getNumber());
        assertEquals(4, NextPowers2.getNumber());
        assertEquals(8, NextPowers2.getNumber());
        assertEquals(16, NextPowers2.getNumber());
    }
}
