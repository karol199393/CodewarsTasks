import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Task18 {
    private static int currentValue = 1;

    public static int getNumber() {
        int result = currentValue;
        currentValue *= 2;
        return result;
    }

    @Test
    public void basicTests() {
        assertEquals(1, Task18.getNumber());
        assertEquals(2, Task18.getNumber());
        assertEquals(4, Task18.getNumber());
        assertEquals(8, Task18.getNumber());
        assertEquals(16, Task18.getNumber());
    }
}
