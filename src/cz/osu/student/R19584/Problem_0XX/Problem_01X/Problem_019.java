package cz.osu.student.R19584.Problem_0XX.Problem_01X;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

/*

You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901 to 31 Dec 2000)?

 */

public class Problem_019 {
    public static long main() {
        ArrayList<String> sundays = new ArrayList<>();
        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
        SimpleDateFormat getDay = new SimpleDateFormat("dd");
        SimpleDateFormat getYear = new SimpleDateFormat("yyyy");
        Calendar calendar = Calendar.getInstance();
        try {
            calendar.setTime(formatter.parse("0.1.1900"));
            while(Integer.parseInt(getYear.format(calendar.getTime())) < 2001) {
                calendar.add(Calendar.DATE, 7);
                if(Integer.parseInt(getYear.format(calendar.getTime())) > 1900)
                    if(Integer.parseInt(getYear.format(calendar.getTime())) < 2001)
                        if(Integer.parseInt(getDay.format(calendar.getTime())) == 1)
                            sundays.add(formatter.format(calendar.getTime()));
            }
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return sundays.size();
    }
}
