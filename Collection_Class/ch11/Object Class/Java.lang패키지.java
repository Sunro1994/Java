// Object Class Method

protected Object clone()  // 복사본을 반환

public boolean equals(Object obj) // 객체 자신과 객체obj가 같은 객체인지 알려준다.

protected void finalize //객체가 소멸될 때 가비지 컬렉터에 의해 자동적으로 후출. 이때 수행되어야 하는 코드가 있을 때 오버라이딩(거의 사용하지 않음)

public Class getClass()  // 객체 자신의 클래스 정보를 담고 있는 Class인스턴스를 반환

public int hashCode() // 객체 자신의 해쉬코드를 반환

public String toString() //자신의 정보를 문자여롤 반환

public void notify() //객체 자신을 사용하려고 기다리는 쓰레드를 하나만 꺠운다.

public void notifyAll() // 객체 자신을 사용하려고 기다리는 모든 쓰레드를 깨운다.

public void wait(), public void wait(long timeout), public void wait(long timeout, int nanos) //다른 쓰레드가 notify, notifyAll()을 호출 할 때까지 현재 쓰레드를 무한히 또는 지정된 시간동안 기다리게 함
                                                                                                //Timeout은 천분의 1초, nanos는 10^9분의 1초

