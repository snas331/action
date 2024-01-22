import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EpicTest {
    @Test
    public void testSimpleTaskMatches() {
        SimpleTask task = new SimpleTask(123,"Молоко, Яйца, Хлеб");

        boolean actual = task.matches("Хлеб");
        boolean expected = true;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testSimpleTaskNotMatches() {
        SimpleTask task = new SimpleTask(123,"Молоко, Яйца, Хлеб");

        boolean actual = task.matches("Рис");
        boolean expected = false;

        Assertions.assertEquals(expected, actual);

    }

}