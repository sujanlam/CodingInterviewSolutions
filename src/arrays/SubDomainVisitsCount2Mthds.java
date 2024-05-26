package arrays;

import java.util.*;

public class SubDomainVisitsCount2Mthds {
    static Map<String, Integer> mapofDoamins = new HashMap<>();

    public static void main(String[] args) {
        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        List<String> allDomains = subdomainVisits(cpdomains);
        System.out.println(allDomains);
    }

    private static List<String> subdomainVisits(String[] cpdomains) {
        List<String> allVisits = new ArrayList<>();

        for (String domain : cpdomains) {
            addAllCombsToMap(domain);
        }
        System.out.println(mapofDoamins);
        for (String domm : mapofDoamins.keySet()) {
            StringBuilder sb = new StringBuilder();
            sb.append(mapofDoamins.get(domm));
            sb.append(" ");
            sb.append(domm);
            allVisits.add(sb.toString());
        }
        return allVisits;
    }

    private static void addAllCombsToMap(String domain) {
        //Extract count form domain
        int count = Integer.valueOf(domain.substring(0, domain.indexOf(" ")));
        String dom = domain.substring(domain.indexOf(" ") + 1);
        mapofDoamins.put(dom, mapofDoamins.getOrDefault(dom, 0) + count);
        System.out.println(count+" and "+dom);
        while (dom.contains(".")) {
            dom = dom.substring(dom.indexOf(".") + 1);
            mapofDoamins.put(dom, mapofDoamins.getOrDefault(dom, 0) + count);

        }
    }
}
