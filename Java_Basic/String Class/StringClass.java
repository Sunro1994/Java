/*
    String Class 는 문자열 배열 참조변수(char[]) value를 인스턴스 변수로 정해놓고 있다.
    final이 붙어 있어 다른 클래스의 조상이 될 수 없다.
    String인스턴스가 갖고 있는 문자열은 Only Read이다.

    - 변경 불가능한 클래스 String
    String a = "a" 와 String b ="b"가 있을 때, String a = a+b;를 수행하면 새로운 문장열을 가진"ab"를 참조하는 주소를 가지며, 새로운 메모리 공간을 차지하게 된다.

    -변경 가능한 클래스StringBuffer
    문자열 결합, 추출등 문자열을 다루는 작업이 많이 필요한 경우에는 String 대신 StringBuffer클래스를 사용하는 것이 좋다.
    StringBuffer인스턴스에 저장된 문자열은 변경이 가능하나 하나의 인스턴스 만으로도 문자열을 다를 수 있다.
 
    
   문자열의 비교
   
   String str1 = "abc";  문자열 리터럴 "abc"의 주소가 str1에 저장
   String str1_1 = "abc"; str1 과 str1_1을 equals로 비교하면 true

   String str2 = new String("abc");  새로운 String인스턴스 생성
    String str2_2 = new String("abc");  str2 와 str2_2를 equals로 비교하면 false(다른 주솟값을 갖기 때문)

    
   
 */

// 문자열 리터럴
class StringEx01 {
    public static void main(String[] args) {
        String a1 = "AAA";
        String a2 = "AAA";
        String a3= "BBB";

        //위의 예제를 컴파일 하면 StringEx01.class가 생성, "AAA"를 가진 인스턴스와 "BBB"를 가진 인스턴스가 하나씩만 생기며 "AAA"의 같은 주소를 a1,과a2가 참조한다.
        // 클래스 파일에는 소스파일에 포함된 모든 리터럴의 목록이 있다. 해당 클래스 파일이 클래스 로더에 의해 메모리로 올라갈 떄 리터럴들이 상수 저장소에 저장된다.
    }
}

/*String의 생성자와 메서드
    
String(String s) 
주어진 문자열 s를 갖는 String인스턴스 생성

String(char[] vlaue) 
주어진 문자열을 갖는 String인스턴스 생성

String(StringBuffer buf) 
StringBuffer인스턴스가 갖고 있는 문자열과 같은 내용의 String인스턴스를 생성

char charAt(int index)  
index에 있는 문자열을 알려준다.

int compareTo(String str)  
str과 사전순서로 비교한다. 같으면 0 사전순으로 이전이면 음수, 이후면 양수를 반호나

String concat(String str) 
문자열을 뒤에 덧붙인다.

boolean contains(CharSequence s)
s가 포함되어있는지 검사

boolean equals(Object obj)
obj와 String인스턴스의 문자열을 비교한다. 같으면 true

boolean equalsIgnoreCase(String str) 
문자열String인스턴스의 문자열을 대소문자 구분없이 비교

int indexOf(Int ch)
ch가 문자열에 존재하는지 확인하여 알려준다. 못찾으면 -1

int indexOf(int ch, int pos)
ch가 지정된 문자열에 존재하는지 pos부터 확인하여 위치를 알려준다. 못찾으면 -1반환

int indexOf(String str)
주어진 문자열이 존재하는지 확인하여 그 위치를 알려준다. 못찾으면 -1반환

String interun() 
문자열을 상수풀에 등록, 이미 상수풀에 같은 내용의 문자열이 있을 경우 주솟값 반환

int lastIndexOf(int ch)
지정된 문자 또는 문자코드를 문자열의 가장 뒤에서부터 찾아 위치를 알려준다. (index는 앞에서부터0 으로 셈, 뒤에서부터 -1아님)

int lastIndexOf(String str)
지정된 문자열을 인스턴스의 문자열 끝에서부터 찾아서 알려준다. 못 찾으면 -1반환

int length() 
길이 반환

String replace(char old, char nw)
old문자를 nw로 바꾸고 문자열을 반환

String replace(charSequence old, CharSequence replacement)
문자열 중의 old문자열을 새로운 문자열로 바꾼 문자열ㅇ르 반환

String replace(String regex, String replacement) 
문자열 중에서 지정된 문자열(regex)과 일치하는 것을 새로운 문자열로 모두 변경

String replaceFirst(String regex, String replacement)
지정된 문자열과 일치하는 것 중, 새로운 문자열로 첫 번째것만 변경

String[] split(String regex, int limit)
문자열을 지정된 분리자(regex)로 나누어 문자열 배열에 담아 반환한다. 단  limit만큼 잘라서 반환

String[] split(String regex)
regex로 나누어 문자열 배열로 담아 반환한다.

Stirng subString(int begin)
begin위치에서 범위에 포함된 문자열을 얻는다. 시작문자는 포함되지만 끝 문자는 포함되지 않는다.

String subString(int begin, int end)

String toLowerCase()
소문자 변환

String toString()
String인스턴스에 저장되어 있는 문자열 반환

String toUpperCase()
대문자 반환

String trim()
공백을 없앤 결과 반환. 중간 공백은 제거되지 않는다.

static String valueOf(boolean b)
지정된 값을 문자열로 반환하여 반환, 참조변수의 경우 toString()호출 결과를 반환




 */