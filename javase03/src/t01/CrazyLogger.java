package t01;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Locale;

/**
 * Created by Alexey on 21.06.2016.
 */
public class CrazyLogger {
    public static void main(String[] args) {
        System.out.print(CrazyLogger.FormatMessage("Hello world"));
        System.out.print(CrazyLogger.FormatMessage("Hello world"));
    }


    //StringBuilder logger;

    private static String FormatMessage (String message){
        Calendar rightNow = Calendar.getInstance();
        return String.format("%1$td-%1$tm-%1$tY : %1$tH-%1$tM - " + message + ";%n", rightNow);
    }

    public void crazyLog(String message, LogLevel logLevel){
        
    }
}
