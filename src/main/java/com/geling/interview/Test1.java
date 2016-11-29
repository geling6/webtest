package com.geling.interview;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Administrator
 *
 */
public class Test1 {
    public static void main(String[] args) throws Exception{
        String dateStr = "2016-06-03 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        Date date = sdf.parse(dateStr);
        Long incre41 = 60*60*24*41*1000L;
        long dd = date.getTime() + incre41;
        
        Date ddd = new Date(dd);
        Date now = new Date();
        System.out.println(now.compareTo(ddd));
    }
}
