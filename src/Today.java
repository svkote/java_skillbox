import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Today {
//    public static void Main(String[] args) {
//        DateFormat format = new SimpleDateFormat( "yyyyddMM_HHmm");
//        System.out.println(format.format(new Date()));
//    }
    public String owner(String[] args) {
        DateFormat now = new SimpleDateFormat( "yyyyddMM_HHmm");
        System.out.println(now.format(new Date()));
        return now.toString();
    }
}
