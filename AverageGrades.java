package org.example;

import java.util.HashMap;
import java.util.Map;

public class AverageGrades {
    public static void main(String[] args) {
        String[] studentsWithGrades = { "Haley: 4.6", "James: 2", "Sophia: 4.1", "Michael: 4.8", "Emma: 1", "Haley: 4.7",
                "James: 4", "Sophia: 3", "Michael: 4.9", "Emma: 5"};
        System.out.println("Highest Grade: "+ highestGrade(studentsWithGrades));
    }

    private static String highestGrade(String[] studentsWithGrades) {
        Map<String, double[]> detailsMap = new HashMap<>();
        for (String student : studentsWithGrades) {
            String[] stdDtl = student.split(":");
            String name = stdDtl[0].trim();
            double grade = Double.parseDouble(stdDtl[1].trim());
            detailsMap.putIfAbsent(name, new double[2]);
            detailsMap.get(name)[0] += grade;
            detailsMap.get(name)[1] += 1;
        }
        //detailsMap.entrySet().stream().forEach((k, v) -> );
        double maxGrade = 0;
        String highestGradeGetter = "";
        for(Map.Entry<String, double[]> entry : detailsMap.entrySet()) {
            String nameofStd = entry.getKey();
            double grade = entry.getValue()[0];
            double count = entry.getValue()[1];
            System.out.println(nameofStd+" "+grade+" "+count);
            double avgGrade = grade/count;
            //System.out.println(nameofStd+ avgGrade);
            if(avgGrade > maxGrade) {
                maxGrade = avgGrade;
                highestGradeGetter = nameofStd;
            }
        }

        return highestGradeGetter;
    }
}
