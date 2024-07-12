package core.datetime.test;

import org.junit.jupiter.api.Test;

import java.time.DayOfWeek;

public class DayOfWeakTest {


    /*
    pada class ini berisi enum data dari hari yang ada yaitu senin - minggu, dimana hari tidak bisa diubah

    Data hari ini beruba Enum DayOfWeek, namun dia adalah turunan dari Temporal, sehingga operasi yang bisa dilakukan di Temporal bisa kita lakukan disini, seperti menambah atau mengurangi
     */

    @Test
    void testCreate() {

        DayOfWeek dayOfWeek = DayOfWeek.FRIDAY;//ini adalah contoh enum dari data Hari
        DayOfWeek dayOfWeek1 = dayOfWeek.plus(3);//dari hari jumat ditambah 3 hari
        DayOfWeek dayOfWeek2 = dayOfWeek1.minus(5);//setelah ditambah 3 hari dikurang 5 hari


        System.out.println(dayOfWeek);
        System.out.println(dayOfWeek1);
        System.out.println(dayOfWeek2);
    }
}
