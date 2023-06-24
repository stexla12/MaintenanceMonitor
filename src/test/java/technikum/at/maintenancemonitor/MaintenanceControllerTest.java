package technikum.at.maintenancemonitor;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaintenanceControllerTest {

    @Test
    void defaultMessage() {
        String ABC = "Everything operates as expected";
        assertEquals(ABC, MaintenanceMonitorController.currentMessage);
    }
    @Test
    void testSetMessage() {
        String test = "Roland";
        MaintenanceMonitorController.setMessage(test);
        assertEquals(MaintenanceMonitorController.getcurrentMessage(), test);
    }

    @Test
    void testResetMessage() {
        MaintenanceMonitorController.resetMessage();
        assertEquals(MaintenanceMonitorController.getcurrentMessage(),MaintenanceMonitorController.getDefaultMessage());
    }
}
