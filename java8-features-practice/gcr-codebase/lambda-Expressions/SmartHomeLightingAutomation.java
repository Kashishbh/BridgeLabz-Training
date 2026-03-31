import java.util.HashMap;
import java.util.Map;

@FunctionalInterface
interface LightAction {
    void activate();
}

public class SmartHomeLightingAutomation {

    public static void main(String[] args) {

        Map<String, LightAction> triggers = new HashMap<>();

        // Motion trigger
        triggers.put("motion",() -> System.out.println("Motion detected: Lights ON at full brightness"));

        // Time of day triggers
        triggers.put("morning",() -> System.out.println("Morning: Soft white lights ON"));

        triggers.put("evening",() -> System.out.println("Evening: Warm dim lights"));

        triggers.put("night",() -> System.out.println("Night: Night lamps ON"));

        // Voice trigger
        triggers.put("voice",
                () -> System.out.println("Voice command: Color light pattern ON"));

        triggers.get("motion").activate();
        triggers.get("morning").activate();
        triggers.get("evening").activate();
        triggers.get("night").activate();
        triggers.get("voice").activate();
    }
}

