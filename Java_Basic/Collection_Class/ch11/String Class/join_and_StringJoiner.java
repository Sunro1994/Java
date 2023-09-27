/*
    joni()은 여러 문자열 사이에 구분자를 넣어서 결합한다.
    split()과 반대되는 작업

    String animals = "dog,cat,bear";
    String[] arr = animals.split(",");      [dog,cat,bear]
    String str = String.join("-",arr);      dog-cat-bear

    StringJoiner클래스로 문자열 결합이 가능하다.
    StringJoiner sj = new StringJoiner(",","[","]");
    String[] stArr = {"aaa","bbb","ccc"};

    for(String s: strArr) {
        sj.add(s.toUpperCase());  [AAA,BBB,CCC]
    }
 */

import java.util.StringJoiner;

class StringEx02 {
    public static void main(String[] args) {
        String animals="dog,cat,bear";
        String[] arr = animals.split(",");

        System.out.println(String.join("-", arr));

        StringJoiner sj = new StringJoiner("/", "[]", "]");
        for(String s : arr) sj.add(s);

        System.out.println(sj.toString());
    }
 }