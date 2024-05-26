package arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubDomainVisitsCount {
    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> allDomains = subdomainVisits(cpdomains);
        System.out.println(allDomains);
    }

    private static List<String> subdomainVisits(String[] cpdomains) {
        List<String> allVisits = new ArrayList<>();

        Map<String, Integer> mapofDoamins = new HashMap<>();

        for (String cpdomain : cpdomains) {
            String[] splitCountAndDom = cpdomain.trim().split(" ");
            int count = Integer.parseInt(splitCountAndDom[0]);
            String wholeDomain = splitCountAndDom[1];
            String[] splittedDomain = wholeDomain.split("\\.");

            mapofDoamins.put(wholeDomain, mapofDoamins.getOrDefault(wholeDomain, 0) + count);

            if (splittedDomain.length == 3) {
                String subdomain = splittedDomain[1] + "." + splittedDomain[2];
                mapofDoamins.put(subdomain, mapofDoamins.getOrDefault(subdomain, 0) + count);
                mapofDoamins.put(splittedDomain[2], mapofDoamins.getOrDefault(splittedDomain[2], 0) + count);
            } else if (splittedDomain.length == 2) {
                mapofDoamins.put(splittedDomain[1], mapofDoamins.getOrDefault(splittedDomain[1], 0) + count);
            }
            }

            for (Map.Entry<String, Integer> entry : mapofDoamins.entrySet()) {
                String res = entry.getValue() + " " + entry.getKey();
                allVisits.add(res);

        }
        return allVisits;
    }
}
