/*
    StringBuffer()
    16문자를 담을 수 있는 버퍼를 가진 인스턴스
    
    StringBuffer(int length)
    지정된 개수만큼의 문자를 담을 수 있는 인스턴스 생성

    StringBuffer(String str)
    str을 갖는 인스턴스를 생성

    StringBuffer append(Object ..args)
    매개변수로 입력된 값을 문자열로 변환하여 저장하고 문자열 뒤에 덧붙임

    int capacity()
    인스턴스의 버퍼크기를 알려줌

    char charAt(int indx)
    index에 있는 문자를 반환

    StringBuffer delete(int start, int end)
    시작위치부터 끝위치 사이에 있는 문자를 제거

    StringBuffer deleteCharAt(int index)
    지정된 위치의 문자를 제거

    int length() 
    길이 반환

    StringBuffer replace(int start, int end, String str)
    지정된 범위의 문자들을 주어진 문자열로 바꿈 end는 포함되지 않는다.

    StringBuffer reverse()
    문자열의 순서를 뒤집는다.

    void setCharAt(int index, char ch)
    index위치의 문자를 ch로 바꾼다.

    void setLength(int newLength)
    새로 지정된 길이로 문자열 길이를 변경한다.

    String toStirng()
    문자열 String으로 변환

    String substring(int start)
    String substring(int start, int end)
    지정된 범위 내의 문자열ㅇ르 String으로 뽑아서 반환한다.


 */