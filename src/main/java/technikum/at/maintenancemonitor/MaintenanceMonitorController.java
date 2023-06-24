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
    @GetMapping("/api/message/set")
    public static String setMessage(@RequestParam String a) {
        currentMessage = a;
        return a;
    }
    public static String getcurrentMessage(){
        return currentMessage;
    }

    @GetMapping("/api/message/reset")
    public static String resetMessage() {
        currentMessage = defaultMessage;
        return defaultMessage;
    }

    public static String getDefaultMessage() {
        return defaultMessage;
    }


}
