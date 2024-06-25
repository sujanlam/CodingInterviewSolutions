package interviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CollectAllResourcesFromAllUrls {

    public static void main(String[] args) {
        List<String> urls = Arrays.asList(
                "http://www.example.com/resource1/v1/resource2/v2/resource",
                "http://www.example.com/resource3",
                "http://www.example.com/resource5/v1/resource4",
                "http://www.example.com/resource1/v1/resource2/v2/resource",
                "http://www.example.com/resource11/v1/v4/resource"
        );
        System.out.println(collectResources(urls));

    }

    private static List<String> collectResources(List<String> urls) {
        List<String> resultList = new ArrayList<>();
        for (String url: urls){
            String[] urlcomps = url.split("/");
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < urlcomps.length; i++) {
                //System.out.println(urlcomps[i]);
                if(urlcomps[i].startsWith("resource")){
                    sb.append("/").append(urlcomps[i]);
                }
            }
            resultList.add(sb.toString());
            sb.setLength(0);
        }

        return resultList;
    }
}


