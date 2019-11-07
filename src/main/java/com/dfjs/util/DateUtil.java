package com.dfjs.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateUtil {


    private static final String DEFAULTFORMATSTR = "yyyy-MM-dd HH:mm:ss";

    public static void main(String[] args) throws Exception{
        int distMinutes = getDistMinutes("2019-06-04 17:30:22", "2019-06-04 17:32:23");
        System.out.println("分钟数:"+distMinutes);
    }




    /**
     *
     * @param startDateStr
     * @param endDateStr
     * @return
     */
    public static int getDistMinutes(String startDateStr,String endDateStr) throws ParseException {
        int dist = 0;
        Date startDate = parse(startDateStr, DEFAULTFORMATSTR);
        Date endDate = parse(endDateStr, DEFAULTFORMATSTR);
        //开始时间
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(startDate);
        long timeStart = calendar.getTimeInMillis();
        //结束时间
        calendar.setTime(endDate);
        long timeEnd = calendar.getTimeInMillis();
        float abs = Math.abs(timeEnd - timeStart);
        System.out.println("timeEnd"+timeEnd+",timeStart:"+timeStart+",abs"+abs+",abs/60000:"+abs/60000);
        dist =(int)Math.ceil(abs/60000) ;
        return dist;
    }

    /**
     * 将字符串类型转成日期类型
     *
     * @param dateStr   传入的时间
     * @param formatStr 格式化类型
     * @return
     * @throws ParseException
     */
    public static Date parse(String dateStr, String formatStr) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat(formatStr);
        return dateFormat.parse(dateStr);
    }
}
