package mix;

public class CollectAllResources {
    public static void main(String[] args) {
        String str = "http://www.example.com/resource1/v1/resource2/v2/resource";
        collectResources(str);
    }

    private static String collectResources(String str) {
        String[] s = str.split("/");
        StringBuilder sb = new StringBuilder();
        for (String ss: s){
            if(ss.startsWith("resource")){
                sb.append(ss);
                System.out.println(ss);
                sb.append("/");
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
