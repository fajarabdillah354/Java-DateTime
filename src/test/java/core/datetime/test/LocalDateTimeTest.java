package core.datetime.test;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class LocalDateTimeTest {
    @Test
    void testCreateLocalDateTime() {

        //Membuat LocalDateTime

        LocalDateTime localDateTime1 = LocalDateTime.now();//MEMBUAT WAKTU SEKARANg
        LocalDateTime localDateTime2 = LocalDateTime.of(2000, Month.DECEMBER, 30, 11,50,40);//Membuat waktu sendiri

        LocalDateTime localDateTime3 = LocalDateTime.parse("2000-12-30T11:50:40");//parsing string ke datetime

        System.out.println(localDateTime1);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);



    }

    @Test
    void testChangeDateTime() {
        LocalDateTime waktuSekarang = LocalDateTime.now();
        //Mengubah LocalDateTime
        LocalDateTime ubah1 = waktuSekarang.withYear(1999);
        LocalDateTime ubah2 = waktuSekarang.withMinute(10);

        System.out.println(ubah1);
        System.out.println(ubah2);

    }

    @Test
    void testModifyDateTime() {
        LocalDateTime waktuSekarang = LocalDateTime.now();

        LocalDateTime plusBulan = waktuSekarang.plusMonths(2);//menambah 2 bulan ke bulan sekarang
        LocalDateTime minusHari = waktuSekarang.minusDays(20);//mengurangi dari tanggal sekarang
        LocalDateTime minusYearplusMonth = waktuSekarang.minusYears(4).plusMonths(1);
        System.out.println(plusBulan);
        System.out.println(minusHari);
        System.out.println(minusYearplusMonth);


    }


    @Test
    void testGet() {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getYear());


    }


    @Test
    void testKonversi() {
        // konversi dari LocalDateTime ke LocalDate

        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDate localDate = localDateTime.toLocalDate();
        System.out.println(localDate);


        //konversi dari LocalDate ke LocalDateTime
        LocalDate localDate1 = LocalDate.now();
        LocalDateTime localDateTime1 = localDate1.atTime(LocalTime.now());// karna kita sudah ada Date tinggal nambahin Time untuk jadi LocalDateTime
        System.out.println(localDateTime1);


        //konversi dari LocalDateTime ke LocalTime
        LocalDateTime now = LocalDateTime.now();
        LocalTime localTime = now.toLocalTime();
        System.out.println(localTime);


        //konversi dari LocalTime ke LocalDateTime
        LocalDateTime result = localTime.atDate(LocalDate.of(2005,6,10));
        System.out.println(result);




    }
}
