package technikum.at.maintenancemonitor;
import org.springframework.web.bind.annotation.*;


@RestController
public class MaintenanceMonitorController {
    static String defaultMessage = "Everything operates as expected";
    static String currentMessage = defaultMessage;


    @GetMapping("/api/message")
    public String getMessage() {
        return currentMessage;
    }


}
