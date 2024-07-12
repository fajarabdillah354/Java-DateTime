package core.datetime.test;

import org.junit.jupiter.api.Test;

import java.time.*;

public class ZonedDateTimeTest {

    @Test
    void testCreateZonedDateTime() {
        //membuat zoneDateTime
        ZonedDateTime sekarang = ZonedDateTime.now();//akan mengambil default dari device yng digunakan
        ZonedDateTime withGmt = ZonedDateTime.now(ZoneId.of("UTC"));
        ZonedDateTime zona3 = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("GMT"));


        //parsing dari text ke ZonedDateTime
        ZonedDateTime parsing = ZonedDateTime.parse("2000-12-30T23:50:20+02:00[Asia/Jakarta]");
        System.out.println(parsing);

        System.out.println(sekarang);
        System.out.println(withGmt);
        System.out.println(zona3);



        //Merubah Timezone
        ZonedDateTime time1 = ZonedDateTime.now();//default zone yang ada di device
        ZonedDateTime time2 = time1.withZoneSameLocal(ZoneId.of("GMT")); //mengubah local zone yang digunakan dengan Class ZoneId
        ZonedDateTime time3 = time1.withZoneSameInstant(ZoneId.of("UTC"));//Merubah waktu zone berdasarkan local zona yang dipilih


        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);



    }
}
