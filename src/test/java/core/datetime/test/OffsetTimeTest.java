package core.datetime.test;

import org.junit.jupiter.api.Test;

import java.time.*;

public class OffsetTimeTest {

    @Test
    void testCreateOffsetTime() {
        OffsetTime offsetTime1 = OffsetTime.now();
        OffsetTime offsetTime2 = OffsetTime.now(ZoneId.of("UTC"));//meskipun kita menggunakan ZoneId tapi yang kita ambil adalah ZoneOffset nya
        OffsetTime offsetTime3 = OffsetTime.of(10,30, 14, 100, ZoneOffset.ofHours(7));
        OffsetTime offsetTimex = OffsetTime.of(LocalTime.now(), ZoneOffset.ofHours(7));

        System.out.println(offsetTime1);
        System.out.println(offsetTime2);
        System.out.println(offsetTime3);
        System.out.println(offsetTimex);


        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        OffsetDateTime offsetDateTime1 = OffsetDateTime.now(ZoneId.of("GMT"));
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(LocalDate.now(), LocalTime.of(5,30), ZoneOffset.ofHours(7));

        System.out.println(offsetDateTime);
        System.out.println(offsetDateTime1);
        System.out.println(offsetDateTime2);


    }


    @Test
    void testOffsetDateTime() {
        //jika butuh tipe date Tanggal dan waktu time yang butuh timezone dengan offset saja tidak butuh dengan ZoneId
        OffsetDateTime offsetDateTime = OffsetDateTime.now();
        OffsetDateTime offsetDateTime1 = OffsetDateTime.now(ZoneId.of("GMT"));
        OffsetDateTime offsetDateTime2 = OffsetDateTime.of(LocalDate.now(), LocalTime.of(5,30), ZoneOffset.ofHours(7));
        OffsetDateTime offsetDateTime3 = OffsetDateTime.parse("2000-12-30T11:00:13+07:00");

        System.out.println(offsetDateTime);
        System.out.println(offsetDateTime1);
        System.out.println(offsetDateTime2);
        System.out.println(offsetDateTime3);
    }
}
