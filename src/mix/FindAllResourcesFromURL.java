package mix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllResourcesFromURL {
    public static void main(String[] args) {
        List<String> resources = Arrays.asList("http//www.example.com/resource1/v1/resource2","http//www.example.com/resource3", "http//www.example.com/resource1/v1/resource4", "http//www.example.com/resource72");
        System.out.println(resources);
        getResources(resources);
    }

    public static List<String> getResources(List<String> resources){
        List<String> allResources = new ArrayList<>();
        for (String res: resources) {
            List<String> indRes = new ArrayList<>();
            String[] resource = res.split("/");
            for (String r: resource) {
                if(r.startsWith("resource")){
                    indRes.add(r);
                }
            }
            String strWithAppend = String.join("/", indRes);
            allResources.add(strWithAppend);
            System.out.print(indRes+" \n");

        }
        System.out.println(allResources);

        return allResources;

    }
}
