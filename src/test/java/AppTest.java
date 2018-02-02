import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by kbriggs on 2/1/18.
 */
public class AppTest {
    App app;
    @Test
    public void addTwoTest() {
        app = new App();
        int ans = app.addTwo(1, 2);
        assertEquals(ans, 3);
    }
}
