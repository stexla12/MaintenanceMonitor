package technikum.at.maintenancemonitor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaintenanceControllerTest {

    @Test
    void defaultMessage() {
        String ABC = "Everything operates as expected";
        assertEquals(ABC, MaintenanceMonitorController.currentMessage);
    }
}
