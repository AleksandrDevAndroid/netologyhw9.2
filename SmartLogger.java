import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public interface SmartLogger {
    AtomicInteger callCounter = new AtomicInteger(0);


    static void log(String message) {
        int currentCount = callCounter.incrementAndGet();

        if (message.toLowerCase().equals("error")) {
            System.out.println("ERROR");
        } else
            System.out.printf("INFO#%d %s %s\n", currentCount, LocalDateTime.now(), message);

    }
}

