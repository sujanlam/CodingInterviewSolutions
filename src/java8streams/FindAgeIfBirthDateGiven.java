package java8streams;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class FindAgeIfBirthDateGiven {
    public static void main(String[] args) {
        LocalDate birthDate = LocalDate.parse("1969-07-23");
        getResult(birthDate);
    }

    private static void getResult(LocalDate b_date) {
        LocalDate today = LocalDate.now();
        Period age = Period.between(b_date, today);
        int year = age.getYears();
        int month = age.getMonths();
        int day = age.getDays();
        System.out.println("Age is: " + year + " year(s) " + month + " month(s) " + day + " day(s).");
    }

}
