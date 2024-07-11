package core.datetime.test;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ClockTest {
    /**
     * clock adalah representasi tanggal dan waktu saat ini mengikuti time zone yang kita pilih
     * best practice jika kita ingin menggunakan tipe data Date dan Time API yang multi timezone adalah dengan menggunakan Clock, sehingga jika kita ingin membuat data baru, kita bisa memanfaatkan Clock

     */

    /**Mendapatkan Instant di Clock
     * Clock akan selalu berjalan tidak pernah berhenti
     * dan representasi milisecond di Date & Time API baru adalah Instant
     * oleh karena itu, untuk mendapatkan tangga dan waktu saat ini sesuai dengan time zone di Clock kita bisa menggunakan method instant(), dan otomatis akan mengembalikan instant saat ini sesuai dengna Clocknya
     * PERLU DIINGAT karena instant itu selalu menggunakan time zone UTC, jadi jika clocknya tidak menggunakan UTC maka secara otomatis dikonversi ke time zone UTC
     *
     */

    /**Membuat Tanggal dan Waktu dari Clock
     * karena jika menggunakan instant kita harus melakukan konversi secara manual ke LocalDateTime atau ZoneDateTime, karena zonenya bisa saja berbeda
     * untungnya, kita juga bisa membuat tipe data tanggal dan waktu langsung menggunakan Clock, caranya menggunakan method now(Clock)
     * secara otomatis informasi timezone Clock akan dibawa di tipe data tanggal dan waktu yang kita buat
     *
     */
    @Test
    void testCreateClock() {


        Clock clock1 = Clock.systemDefaultZone();//default clock yang ada di system operasi kita
        System.out.println(clock1);

        Clock clock2 = Clock.systemUTC();//ini adalah default zone dari Class Clock
        System.out.println(clock2);

        Clock clock3 = Clock.system(ZoneId.of("GMT"));//kita juga bisa memilih time zone mana yang akan kita pakai dengan system(ZoneId.of())
        System.out.println(clock3);


    }

    @Test
    void testInstantClock() throws  Throwable{

        Clock clock = Clock.system(ZoneId.of("Asia/Jakarta"));

        Instant instant = clock.instant();
        System.out.println(instant);
        Thread.sleep(3_000);//membuat sytem berhenti sementara untuk melihat kecocokan waktu


        Instant instant1 = clock.instant();
        System.out.println(instant1);
    }


    @Test
    void testCreateDataFromClock() {
        /**
         * bestpraticenya jika ingin membuat waktu saat ini kita harus membuat clocknya terlebih dahulu
         * jika kita ingin merubah timezonenya sesimpel ubah clocknya saja
         */


        Clock clockJakarta = Clock.system(ZoneId.of("Asia/Jakarta"));

        Year year = Year.now(clockJakarta);
        YearMonth yearMonth = YearMonth.now(clockJakarta);
        LocalTime localTime = LocalTime.now(clockJakarta);
        LocalDate localDate = LocalDate.now(clockJakarta);
        ZonedDateTime zonedDateTime = ZonedDateTime.now(clockJakarta);
        OffsetDateTime offsetDateTime = OffsetDateTime.now(clockJakarta);
        LocalDateTime localDateTime = LocalDateTime.now(clockJakarta);

        System.out.println(year);
        System.out.println(yearMonth);
        System.out.println(localTime);
        System.out.println(localDate);
        System.out.println(zonedDateTime);
        System.out.println(offsetDateTime);
        System.out.println(localDateTime);
    }
}
