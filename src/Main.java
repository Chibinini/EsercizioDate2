import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {
        // creo un oggetto OffsetDataTime
        OffsetDateTime data = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        // Formatto la data con Long
        String data1 = data.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));
        //Stampo
        System.out.println(data1);
    }
}
