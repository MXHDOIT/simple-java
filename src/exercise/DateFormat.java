package exercise;

import com.sun.deploy.util.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * @author: maxinhang.
 */
public class DateFormat {
    private static final DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyyMMdd");

    public static void main(String[] args) {
        LocalDate begin = LocalDate.parse("20240101", dateTimeFormatter);
        // end前一天
        LocalDate end = LocalDate.parse("20240801", dateTimeFormatter);
        List<String> partition = new ArrayList<>();

        while (begin.isBefore(end)) {
            partition.add(("p" + dateTimeFormatter.format(begin)).substring(0,7));
            begin = begin.plusMonths(1);
        }

        System.out.println(StringUtils.join(partition, ","));
    }

}
