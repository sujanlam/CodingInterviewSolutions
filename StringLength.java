package test;

public class StringLength {
    public static void main(String[] args) {
        String str = "Unicode Characters (Supplementary Characters): If you need to consider the number of actual characters (graphemes), rather than just the length in terms of UTF-16 code units (which .length() returns), you would need a more complex solution involving Character.codePointCount(). However, this is only necessary for handling strings with supplementary characters (those outside the Basic Multilingual Plane).\n" +
                "For example, the following code counts Unicode code points (i.e., actual characters, including supplementary ones):";
        System.out.println(str.length());
        int codePoint = str.codePointCount(0, str.length());
        System.out.println(codePoint);
    }
}
