package com.datacanvas.superion.util;

import org.postgresql.util.PGInterval;

import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.Temporal;
import java.util.Calendar;
import java.util.Date;

public class DateTimeUtil {

    // Suppress default constructor for noninstantiability
    private DateTimeUtil() {
        throw new AssertionError();
    }

    public static String format(Date date, String format) {
        String s = "";
        try {
            if (date != null) {
                java.text.DateFormat dateFormat = new SimpleDateFormat(format);
                s = dateFormat.format(date);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }

    public static String getNowAfterMinutes(int m) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.MINUTE, m);
        return format(calendar.getTime(), "yyyy-MM-dd HH:mm:ss");
    }

    public static int getCurrentYear() {
        return Calendar.getInstance().get(Calendar.YEAR);
    }

    public static int getYear(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.YEAR);
    }

    public static int getCurrentMonth() {
        return Calendar.getInstance().get(Calendar.MONTH) + 1;
    }

    public static int getMonth(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.MONTH) + 1;
    }

    public static int getCurrentDay() {
        return Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
    }

    public static int getDay(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.DAY_OF_MONTH);
    }

    public static int getCurrentHour() {
        return Calendar.getInstance().get(Calendar.HOUR_OF_DAY);
    }

    public static int getHour(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.HOUR_OF_DAY);
    }

    public static int getCurrentMinute() {
        return Calendar.getInstance().get(Calendar.MINUTE);
    }

    public static int getMinute(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.MINUTE);
    }

    public static int getCurrentSecond() {
        return Calendar.getInstance().get(Calendar.SECOND);
    }

    public static int getSecond(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.SECOND);
    }

    public static int getCurrentMilliSecond() {
        return Calendar.getInstance().get(Calendar.MILLISECOND);
    }

    public static int getMIlliSecond(Date date) {
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        return c.get(Calendar.MILLISECOND);
    }

    public static long getCurrentTimestamp() {
        return System.currentTimeMillis();
    }

    public static long getTimestampAfter(int seconds) {
        return new Timestamp(System.currentTimeMillis() + seconds * 1000).toInstant().toEpochMilli();
    }

    public static String getYearMonthDay() {
        return String.format("%s-%s-%s", getCurrentYear(), getCurrentMonth(), getCurrentDay());
    }

    public static String getChineseYearMonthDay() {
        return String.format("%s年%s月%s日", getCurrentYear(), getCurrentMonth(), getCurrentDay());
    }

    public static String getYearMonthDayHourMinuteSecondMillisecond() {
        return String.format("%04d-%02d-%02d %02d:%02d:%02d.%03d",
                getCurrentYear(),
                getCurrentMonth(),
                getCurrentDay(),
                getCurrentHour(),
                getCurrentMinute(),
                getCurrentSecond(),
                getCurrentMilliSecond());
    }

    public static String getPgIntervalStr(PGInterval pgInterval) {
        return pgInterval.getDays() + " days "
                + pgInterval.getHours() + " hours "
                + pgInterval.getMinutes() + " mins "
                + new DecimalFormat("0.00####").format(pgInterval.getSeconds()) + " secs";
    }

    public static PGInterval convertDurationToPgInterval(Duration duration) {
        int years = 0;
        int months = 0;
        int days = (int) duration.toDays();
        int hours = ((int) duration.toHours() >= 24) ? ((int) duration.toHours() % 24) : ((int) duration.toHours());
        int minutes = ((int) duration.toMinutes() >= 60) ? ((int) duration.toMinutes() % 60) : ((int) duration.toMinutes());
        double seconds = duration.getSeconds() % 60.0;
        return new PGInterval(years, months, days, hours, minutes, seconds);
    }

    public static String convertTimestampToDate(Long timestamp) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date(timestamp);
        return simpleDateFormat.format(date);
    }

    public static void main(String[] args) {
        System.out.println(getCurrentTimestamp());
        System.out.println(getTimestampAfter(10));
        System.out.println(getChineseYearMonthDay());
        System.out.println(getYearMonthDayHourMinuteSecondMillisecond());
        Temporal startTime = LocalDateTime.now();
        Temporal endTime = LocalDateTime.now().plusDays(1).plusHours(1).plusMinutes(1).plusSeconds(1);
        Duration duration = Duration.between(startTime, endTime);
        PGInterval pgInterval = convertDurationToPgInterval(duration);
        System.out.println(getPgIntervalStr(pgInterval));
    }

}
