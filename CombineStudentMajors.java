package test;

import java.util.*;

public class CombineStudentMajors {
    public static void combineMajors(String[][] enrollments) {
        Map<Integer, Set<String>> majorsMap = new HashMap<Integer, Set<String>>();
        for (String[] enrollment : enrollments) {
            int id = Integer.parseInt(enrollment[0]);
            String major = enrollment[1];
            majorsMap.computeIfAbsent(id, k-> new HashSet<String>()).add(major);
        }
        List<Integer> idList= new ArrayList<>(majorsMap.keySet());
        Collections.sort(idList);
        Map<String, Set<String>> cmbMajors = new LinkedHashMap<>();

        for (int i = 0; i < idList.size(); i++) {
            for (int j = i+1; j < idList.size(); j++) {
                int id1 = idList.get(i);
                int id2 = idList.get(j);
                String keyCombo = id1+" "+id2;
                Set<String> majorsCombo = new HashSet<>(majorsMap.get(id1));
                majorsCombo.retainAll(majorsMap.get(id2));
                cmbMajors.put(keyCombo, majorsCombo);
            }
        }
        for (Map.Entry<String, Set<String>> entry : cmbMajors.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
    public static void main(String[] args) {
        String[][] enrollments = {
                {"101", "Computer Science"},
                {"102", "Mechanical Engineering"},
                {"103", "Electrical Engineering"},
                {"104", "Computer Science"},
                {"105", "Civil Engineering"},
                {"101", "Mechanical Engineering"},
                {"102", "Computer Science"},
                {"106", "Computer Science"},
                {"103", "Civil Engineering"},
                {"104", "Electrical Engineering"}
        };
        combineMajors(enrollments);
    }

}
