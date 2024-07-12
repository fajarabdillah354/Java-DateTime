package core.datetime.test;

import org.junit.jupiter.api.Test;

import java.time.LocalTime;

public class LocalTimeTest {

    @Test
    void testCreateLocalTime() {

        /*
        CATATAN
        -   jika kita melakukan modifikasi maka sama saja membuat object baru sehingga tidak mempengaruhi object yang sebenarnya
        contoh
        LocalTime time1 = LocalTime.now();
        time1.plusHour(2);

        sout(date1);  saat kita panggil date1 disini isinya tetep tanggal sekarang, operasi plus tidak akan berfunggi sehingga membuat object LocalTime baru
         */


        //membuat LocalTime
        LocalTime localTime1 = LocalTime.now();
        LocalTime localTime2 = LocalTime.of(9,45);//membuat jam dengan menentukan sendiri
        LocalTime localTime3 = LocalTime.parse("22:00:00");//parsing string ke date(harus sesuai format HH:mm:ss)

        ///Memanipulasi LocalTime
        LocalTime time1 = localTime1.withHour(8);//mengubah jamnya
        LocalTime time2 = localTime1.withHour(9).withMinute(20);//mengubah jam dan menitnya

        //Memodifikasi LocalTime
        LocalTime time3 = localTime1.minusHours(3);
        LocalTime time4 = localTime1.plusMinutes(30);




        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time4);

        System.out.println(time1.getMinute());
        System.out.println(time2.getHour());
    }
}
