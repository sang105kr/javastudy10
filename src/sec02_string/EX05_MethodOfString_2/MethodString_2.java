package sec02_string.EX05_MethodOfString_2;

import java.util.Arrays;

public class MethodString_2 {
  public static void main(String[] args) {
    //#5. 문자열 수정
    //@toLowerCase(), toUpperCase()
    String str1 = "Java Study";
    System.out.println(str1.toLowerCase()); //java study
    System.out.println(str1.toUpperCase()); //JAVA STUDY

    //@ replace(,)
    System.out.println(str1.replace("Study", "공부")); //

    //@ substring(.)
    System.out.println(str1.substring(0,5)); //Java

    //@ split()
    String[] strArray = "abc/def-ghi jkl".split("/|-| ");
    System.out.println(Arrays.toString(strArray)); //[abc, def, ghi, jkl]

    //@ trim()
    System.out.println("   abc   ".trim());

    System.out.println();

    //#6. 문자열의 내용 비교 (equals(), equalsIgnoreCase())
    String str2 = new String("Java");
    String str3 = new String("Java");
    String str4 = new String("java");

    //@ stack 메모리 비교 (==)
    System.out.println(str2 == str3); //false
    System.out.println(str3 == str4); //false
    System.out.println(str4 == str2); //false
    System.out.println(System.identityHashCode(str2));
    System.out.println(System.identityHashCode(str3));
    System.out.println(System.identityHashCode(str4));


    //@ equals(), equalsIgnoreCase() : 내용비교
    System.out.println(str2.equals(str3)); //true
    System.out.println(str3.equals(str4)); //false
    System.out.println(str3.equalsIgnoreCase(str4)); //true

    String str5 = "JAVA";
    String str6 = "JAVA";
    String str7 = "JAVA";
    System.out.println(System.identityHashCode(str5));
    System.out.println(System.identityHashCode(str6));
    System.out.println(System.identityHashCode(str7));
  }
}
