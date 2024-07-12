package core.datetime.test;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.Locale;

public class DateTimeFormatterTest {




    @Test
    void testCreateDateParse() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy MM dd");//kita bisa membuat pattern sesuai yang kita mau

        LocalDate localDate = LocalDate.parse("2000 12 30",dateTimeFormatter);
        //setelah ditambah paramater DateTimeFormatter kita bisa menentukan format Date sesuai pattern yang kita buat
        System.out.println(localDate);
    }

    @Test
    void testCreateDateFormat() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MM yyyy");

        String formatBaru = LocalDate.now().format(dateTimeFormatter);
        /*
        jika menggunakan method format() maka ouput akan sesuai dengan pattern yang kita inginkan
        SEMUA TURUNAN DARI TEMPORAL BISA MENGGUNAKAN METHOD format()
        - jika kita tidak membuat pattern maka akan menggunakan default formatter, jadi kita tidak perlu buat ulang
         */

        System.out.println(formatBaru);

        String defaultformat = LocalDate.now().format(DateTimeFormatter.ISO_LOCAL_DATE);//masih banyak default yang disediakan oleh DateFormat
        System.out.println(defaultformat);

    }


    @Test
    void testDateFormatInternalization() {

        //kita juga bisa menambahkan I18N dalam class DateTimeFormatter dengan cara menambahkan Locale lalu set local yang diinginkan
        Locale locale = new Locale("id","ID");
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd MMMM, yyyy",locale);//kita tambahkan locale ke dalam dateFormatter supaya ouput bahasa sesuai dengan locale yang dipilih
        LocalDate localDate = LocalDate.now();
        String lokalIndo = localDate.format(dateTimeFormatter);
        System.out.println(lokalIndo);

    }
}
