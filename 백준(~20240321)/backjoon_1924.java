import java.io.*;
import java.util.Calendar;

public class DayOfTheWeek {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int month = Integer.parseInt(input[0]);
        int day = Integer.parseInt(input[1]);

        Calendar calendar = Calendar.getInstance();
        calendar.set(2007, month - 1, day);

        int dayOfWeek = calendar.get(Calendar.DAY_OF_WEEK);
        String[] days = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        System.out.println(days[dayOfWeek - 1]);
    }
}
