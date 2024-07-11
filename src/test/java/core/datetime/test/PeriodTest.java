package core.datetime.test;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {
    @Test
    void testCreatePeriod() {

        Period period1 = Period.ofWeeks(10);
        Period period2 = Period.ofDays(10);
        Period period3 = Period.ofMonths(10);
        Period period4 = Period.ofYears(1);
        Period period5 = Period.of(2,4,70);

        System.out.println(period1);
        System.out.println(period2);
        System.out.println(period3);
        System.out.println(period4);
        System.out.println(period5);
    }


    @Test
    void testGetPeriod() {

        /**
         * untuk periode tidak dikonversi berbeda dengan Duration
         */
        Period period = Period.of(10,10,10);
        System.out.println(period.getDays());
        System.out.println(period.getMonths());
        System.out.println(period.getYears());

        // nb = jika yang ada pada Class Duration menggunakan to karna kita mengkonversi ke ... ,jika ini kita mengambil jumlah hari,bulan,tahun


    }


    @Test
    void testBetweenPeriod(){

        Period period = Period.between(LocalDate.of(1985,10,10), LocalDate.now());

        System.out.println(period);
        System.out.println(period.getYears());//akan menampil berapa tahun sampe now
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        //nb = kita bisa mengetahui umur seseorang dengan menggunakan Period

    }
}
