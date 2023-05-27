/*
    StringBuffer

    String과 다르게 인스턴스에 지정한 문자열의 변경이 가능하다.
    인스턴스를 생성할 때 그 크기를 지정하는데 버퍼의 길이를 충분히 잡아주는 것이 좋다.
    default길이는 16개의 문자를 저장할 수 있는 크기의 버퍼를 생성한다.

        - StringBuffer길이를 지정하는 내용의코드 -
*/


 //StringBuffer의 비교

class StringBufferEx01{
public static void main(String[] args) {
    StringBuffer sb = new StringBuffer("abc");
    StringBuffer sb2 = new StringBuffer("abc");

    System.out.println("sb==sb2 ?  " + (sb==sb2) );
    System.out.println("sb.equals(sb2) ? "+ sb.equals(sb2));

    
}

}



/* 
    public StringBuffer(int length) {       //버퍼크기 지정
        value = new char[length];
        shared =false;
    }

    public StringBuffer() {                 //버퍼크기 미 지정시
        this(16);
    }

    public StringBuffer(String str) {       //지정한 문자열의 길이보다 16 더 크게 버퍼 생성
        thsi(str.length() + 16);
        append(str);
    }

      - 버퍼의 크기를 변경하는 내용의 코드 -

    char newValue[] = new char[newCapcity];

    System.arraycopy(value,0,Newvalue,0,count); count는 문자열의 길이
    vlaue = newValue; 새로 생성된 배열의 주소를 참조변수 value에 저장.
 */