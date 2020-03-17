import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Vector2DTest {
    private final double EPS = 1e-9;
    private static Vector2D v1;

    @BeforeClass
    public static void createNewVector() {
        v1 = new Vector2D();
    }

    @Test
    public void newVectorShouldHaveZeroLenght() {
//        Vector2D v1 = new Vector2D(); // action , create @Before , close @After
        // assertion
        // 1e-9 = 0.0000000001
        Assert.assertEquals(0, v1.lenght(), EPS);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
//        Vector2D x1 = new Vector2D();
        Assert.assertEquals(0, v1.getX(), EPS);
    }

    @Test
    public void newVextorShouldZeroY() {
//        Vector2D y1 = new Vector2D();
        Assert.assertEquals(0, v1.getY(), EPS);
    }
}
