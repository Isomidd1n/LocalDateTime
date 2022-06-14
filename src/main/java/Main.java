import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Formatlashdan oldin: " + localDateTime);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("E, MMM dd yyyy HH:mm:ss");

        String formattedDate = localDateTime.format(myFormatObj);
        System.out.println("Formatlashdan keyin: " + formattedDate);
    }
}
