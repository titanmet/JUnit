import org.junit.Test;
import org.junit.rules.Timeout;

public class NetworkUtilsTest {
    @Test(timeout = 1000)
    public void getConnectionShouldFasterThanOneSecond() {
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        NetworkUtils.getConnection();
    }
}
