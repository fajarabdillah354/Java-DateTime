package core.datetime.test;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalDateTest {

    @Test
    void testLocalDate() {
        /*
        CATATAN
        -   jika kita melakukan modifikasi maka sama saja membuat object baru sehingga tidak mempengaruhi object yang sebenarnya
        contoh
        LocalDate date1 = LocalDate.now();
        date1.plusYear(2);

        sout(date1);  saat kita panggil date1 disini isinya tetep tanggal sekarang, operasi plus tidak akan berfunggi sehingga membuat object LocalDate baru
         */

        //Membuat LocalDate
        LocalDate date1 = LocalDate.now();
        LocalDate date2 = LocalDate.of(2000,12,30);
        LocalDate date3 = LocalDate.parse("2000-12-30");

        //Memodifikasi LocalDate
        LocalDate local1 = date1.minusYears(4);
        LocalDate local2 = date1.minusDays(3);
        LocalDate local3 = date1.plusMonths(2);

        //Mengambil LocalDate
        System.out.println(date1.getDayOfMonth());
        System.out.println(date1.getYear());



        System.out.println(date1);
        System.out.println(date2);
        System.out.println(date3);
        System.out.println(local1);
        System.out.println(local2);
        System.out.println(local3);
    }
}
