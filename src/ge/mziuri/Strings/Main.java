
package ge.mziuri.Strings;

public class Main {
    public static void main(String[] args) {
        System.out.println(numberofnumbers("mdaa01278"));
        System.out.println(phrases("modi aq. saswrafod!"));
        System.out.println(isSubstring("modi", "od"));
        System.out.println(theLongest("programming is the best thing around the world"));
        System.out.println(mostPopular("yo yo wazza nigga"));
        System.out.println(caesarCipher("akz", 100));
    }
    public static int numberofnumbers(String s) {
        int x = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)>='0' && s.charAt(i) <= '9') {
                x++;
            }
        }
        return x;
    }
    public static int phrases(String s) {
        int x = 0;
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '!' || s.charAt(i) == '.' || s.charAt(i) == ';' || s.charAt(i) == '?') {
                x++;
            }
        }
        return x;
    }
    public static boolean isSubstring(String s1, String s2) {
        char first = s2.charAt(0);
        char second = s2.charAt(s2.length()-1);
        int firstIndex = 0;
        int secondIndex = 0;
        for(int i=0; i<s1.length(); i++) {
            if(s1.charAt(i) == first) firstIndex = i;
            if(s1.charAt(i) == second) secondIndex = i;
        }
        return s1.substring(firstIndex, secondIndex+1).equals(s2);
    }
    public static String theLongest(String s) {
        String[] tokens = s.split(" ");
        String dunno = tokens[0];
        for(int i=0; i<tokens.length; i++) {
            if(tokens[i].length() > dunno.length()) dunno = tokens[i];
        }
        return dunno;
    }
    public static String mostPopular(String s) {
        String[] tokens = s.split(" ");
        int count = 1, tempCount;
        String popular = tokens[0];
        String masker;
        for (int i = 0; i < (tokens.length - 1); i++) {
         masker = tokens[i];
         tempCount = 0;
         for (int j = 1; j < tokens.length; j++) {
         if (masker.equals(tokens[j]))
        tempCount++;
    }
        if (tempCount > count) {
      popular = masker;
      count = tempCount;
    }
  }
      return popular;
    }
    public static String caesarCipher(String s, int p) {
        char c = ' ';
        p=p%26;
        String ciphering = "";
        for(int i=0; i<s.length(); i++) {
             if(s.charAt(i) + p <= 'z') {
             c = (char)(s.charAt(i) + p);
             ciphering+=c;
             }
             else {
                 
                 c = (char)(-1+'a' + (p-('z'-s.charAt(i))));
                 ciphering+=c;
             }
        }
        return ciphering;
    }
}
