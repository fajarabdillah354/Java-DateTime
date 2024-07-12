package core.datetime.test;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.time.*;
import java.time.temporal.TemporalUnit;

public class InstantTest {


    @Test
    void testCreateInstans() {
/*
Instant adalah representasi milisecond dijava
Instant juga sama seperti class Date , dia menggunakan milisecond setelah UnixEpoch 1970-01-01T00:00:00Z
Artinya secara time zone Instant menggunakan zona UTC

 */
        Instant instant = Instant.now();
        Instant instant1 = instant.ofEpochMilli(1000);
        Instant instant2 = instant1.ofEpochSecond(1000);


        System.out.println(instant);
        System.out.println(instant1);
        System.out.println(instant2);

    }


    @Test
    void testModifyInstant() {
        Instant instant = Instant.now();
        Instant instant1 = instant.plusMillis(1000);
        Instant instant2 = instant.plusSeconds(1000);
        Instant instant3 = instant.minusMillis(2000);
        Instant instant4 = instant.minusSeconds(1000);

        System.out.println(instant);
        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);
        System.out.println(instant4);

    }

    @Test
    void testGetInstant() {
        Instant instant = Instant.now();
        long getEpoch = instant.toEpochMilli();
        long getEpocSecond = instant.getEpochSecond();

        System.out.println(instant.getNano());
        System.out.println(instant.getEpochSecond());
        System.out.println(instant.toEpochMilli());


    }


    @Test
    void testKonversiInstant() {

        /*
        karna instant berisi millisecond jadi kita bisa mengkonversi kemanapun class yangg kita mau
        contohnya kita bisa konversi ke dalam LocalDate,LocalTime bahkan ke ZoneDateTime
        semua dilakukan dengan method ofInstant(), lalu kita juga butuh time zonenya untuk melakukan konversi dari Instant ke class yang kita inginkan

         */

        Instant instant = Instant.now();
        LocalTime localTime = LocalTime.ofInstant(instant, ZoneId.of("Asia/Jakarta"));
        LocalDate localDate = LocalDate.ofInstant(instant, ZoneId.of("Asia/Jakarta"));
        ZonedDateTime zonedDateTime = ZonedDateTime.ofInstant(instant, ZoneId.of("Asia/Jakarta"));

        System.out.println(instant);
        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(zonedDateTime);



        //kita juga bisa melakukan konversi ke instant tapi ingat karna instant detail maka harus ada Date dan Timenya
        //jika belmm ada tambahkan dulu
        //karna instant menggunakan time zone UTC maka kita perllu menambahkan ZoneOffset jika konversi dari tipe data ytang tidak mempunyai time zone

        Instant instant1 = Instant.now();
        Instant instant2 = LocalDateTime.now().toInstant(ZoneOffset.ofHours(7));
        Instant instant3 = ZonedDateTime.now().toInstant();
        Instant offsetDateTime = OffsetDateTime.now().toInstant();


        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);
        System.out.println(offsetDateTime);



    }
}
