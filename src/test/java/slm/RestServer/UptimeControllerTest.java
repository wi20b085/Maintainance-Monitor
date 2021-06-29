package slm.RestServer;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UptimeControllerTest {

    @Test
    public void test_calculateUptime_shouldBeCalculatedCorrectly()
    {
        // Arrange
        UptimeController controller=new UptimeController();

        // Act
        String actualvalue=controller.isOnline("127.0.0.1");

        // Assert
        Assertions.assertEquals("-",actualvalue);
    }
}