import org.junit.Assert;
import org.junit.Test;

public class Vector2DTest {
    @Test
    public void newVectorShouldHaveZeroLenght() {
        Vector2D v1 = new Vector2D(); // action
        // assertion
        // 1e-9 = 0.0000000001
        Assert.assertEquals(0, v1.lenght(), 1e-9);
    }

    @Test
    public void newVectorShouldHaveZeroX() {
        Vector2D x1 = new Vector2D();
        Assert.assertEquals(0, x1.getX(), 1e-9);
    }

    @Test
    public void newVextorShouldZeroY() {
        Vector2D y1 = new Vector2D();
        Assert.assertEquals(0, y1.getX(), 1e-9);
    }
}
