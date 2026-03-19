public class ContainsDuplicateChar {
    public static boolean hasDuplicate(String str) {
        boolean result = false;

        int strLen = str.length();
        for (int i = 0; i < strLen; i++) {
            for (int j = 0; j < strLen; j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    result = true;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String a = "apple";
        String b = "Orange";
        String c = "";

        System.out.println('\'' + a + '\'' + " : " + hasDuplicate(a));
        System.out.println('\'' + b + '\'' + " : " + hasDuplicate(b));
        System.out.println('\'' + c + '\'' + " : " + hasDuplicate(c));
    }
}