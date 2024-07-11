package core.datetime.test;

import org.junit.jupiter.api.Test;
import org.w3c.dom.ls.LSOutput;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.Set;

public class ZoneIdTest {

    /*
    ZoneId dan ZoneOffset bersifat immutable sehingga jika kita ingin mengubah
    harus membuat object baru
     */

    @Test
    void testZoneOffset() {
        ZoneOffset zoneOffset = ZoneOffset.of("+07:00");//ini berarti zone yang dipake adalah lebih 07:00 dari zoneId yang digunakan
        System.out.println(zoneOffset);
        ZoneOffset zoneOffset1 = ZoneOffset.ofHours(-7);//membuat Offset -07:00
        System.out.println(zoneOffset1);
        ZoneOffset zoneOffset2 = ZoneOffset.ofHoursMinutes(4,20);
        System.out.println(zoneOffset2);


    }

    @Test
    void testCreateZoneId() {


        ZoneId zonaWaktu = ZoneId.systemDefault();//default zoneId
        System.out.println(zonaWaktu);

        ZoneId zoneId = ZoneId.of("GMT");//membuat zoneId sendiri
        System.out.println(zoneId);


        Set<String> listZona = zonaWaktu.getAvailableZoneIds();
        for (var getZona : listZona) {
            System.out.println(getZona);
        }




    }



}
