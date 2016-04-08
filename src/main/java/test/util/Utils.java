package test.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created on 08.04.16.
 */
public class Utils {

    private static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");


    public static Date parseStringToDate(String date) {
        Date newDate;
        try {
            newDate = dateFormat.parse(date);
        } catch (ParseException e) {
            newDate = null;
        }
        return newDate;
    }

    public static Double parseStringToDouble(String salary){


        Double newSalary ;

        try{
            newSalary  = Double.parseDouble(salary);
        }
        catch (NumberFormatException e){
            newSalary = null;
        }

        return  newSalary;
    }

}
