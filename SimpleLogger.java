import java.time.LocalDateTime;

public interface SimpleLogger {
    static void log(String message) {
        System.out.printf("%s %s\n",LocalDateTime.now(),message);
    }
}
