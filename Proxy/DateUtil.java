import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateUtil {
    public static String getCurrentTime() {
        Calendar c = Calendar.getInstance();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        return simpleDateFormat.format(c.getTime());
    }
}
