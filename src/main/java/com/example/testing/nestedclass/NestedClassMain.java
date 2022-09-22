package com.example.testing.nestedclass;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class NestedClassMain {

    private static final String[] DISTRICTS = {
            "abai", "ayagoz", "beskaragai", "boroduliha", "glubokoe", "zharma", "zaisan",
            "zyryan", "katon", "kokpekti", "kurchum", "urzhar", "ulan", "shemonaiha",
    };


    public static void main(String[] args) {
//        OutClass outClass = new OutClass();
//
//        String value = "00.0000000000";
//
//        BigDecimal bigDecimal = new BigDecimal(value);
//        long l = bigDecimal.multiply(BigDecimal.valueOf(100)).longValue();
//
//
//        System.out.println(l);
//
//

//        String url = "fromwebportal";
//
//        var endDate = LocalDate.now().withDayOfMonth(1);
//        var startDate = endDate.minusMonths(1);
//
//        var dateFmt = DateTimeFormatter.ofPattern("dd.MM.yyyy");
//
//
//        for (var district : DISTRICTS) {
//            var fullUrl = "http://%s.vko.ddo.kz/api/%s?start_date=%s&end_date=%s"
//                    .formatted(district, url, startDate.format(dateFmt), endDate.format(dateFmt));
//
//            System.out.println(fullUrl);
//        }


        NestedClassMain main = new NestedClassMain();
        main.crimeQuery();


    }


    public void crimeQuery(){
        Instant to = Instant.now();
        Instant from = to.minus(7, ChronoUnit.DAYS);

        System.out.println(to);
        System.out.println(from);
    }
}
