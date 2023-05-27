// 형식화된 문자열을 만들어내는 간단한 방법
// pringf()와 사용법이 완전히 똑같다.


class StirngEx03{
public static void main(String[] args) {
    
    
    //기본형 값을 String으로 변환   
    int i =100;
    String str1 = i+"";                     //"100"
    String str2 = String.valueOf(i);        //"100"

    //String을 기본형 값으로 변환
    //valueOf(), parseInt()를 사용한다.

    int num1 = Integer.parseInt("100");     //100
    int num2 = Integer.valueOf("100");      //100

    //문자열"A"를 'A'로 변환하려면 ch="A".charAt(0)을 사용하면 된다.

    //문자형과 기본형간의 변환

    int val = Integer.parseInt(" 123 ".trim()); //문자열 양 끝의 공백을 제거 후 변환



    }//main

}
