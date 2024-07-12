package core.datetime.test;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DurationTest {


    /**Duration Class
     * class Duration adalah representasi dari data durasi waktu
     * dengan menggunakan class Duration, kita bisa dengan mudah mengkonversi durasi ke waktu yang kita inginkann , misal hour, minute, second
     */
    @Test
    void testCreateDuration() {

        Duration duration = Duration.ofDays(3);
        Duration duration1 = Duration.ofHours(60);
        Duration duration2 = Duration.ofMinutes(10000);

        System.out.println(duration);
        System.out.println(duration1);
        System.out.println(duration2);

    }


    @Test
    void testGetDuration() {
        /*
        kita bisa mengambill beberapa data yang ada di Duration dengan method toDays() dan seterusnya
         */

        Duration duration = Duration.ofDays(5);

        System.out.println(duration.toDays());//disini kita mau tau kalo object duration diatas berapa days
        System.out.println(duration.toHours());//dari object diatas kita mau ambill jamnya(jadi 5 hari itu berapa jam) begitupun seterrusnya
        System.out.println(duration.toMinutes());
        System.out.println(duration.toSeconds());
        System.out.println(duration.toMillis());
        System.out.println(duration.toNanos());


    }


    @Test
    void testCountDuration() {

        /*
        kita bisa juga menghitung durasi antara waktu A dan waktu B
        Duration.between(waktu mulai, waktu selesai)
         */
        Duration duration = Duration.between(LocalTime.now(), LocalTime.now().plusMinutes(90));
        System.out.println(duration);
        System.out.println(duration.toHours());
        System.out.println(duration.toMinutes());

        //kita juga bisa membuar durasi negativ
        Duration duration1 = Duration.between(LocalDateTime.now().plusHours(10), LocalDateTime.now());
        System.out.println(duration1);
        System.out.println(duration1.toHours());
        System.out.println(duration1.toMinutes());

    }
}
