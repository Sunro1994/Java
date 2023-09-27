class Point implements Cloneable {  //Cloneableㅇ니터페이스를 구현한 클래스에서만 clone()을 호출할 수 있다. 인스턴스 데이터의 보호를 위해!
    int x, y;

    Point(int x, int y ) {
        this.x =x;
        this.y = y;
    }

    public String toString() {
        return "x = " +x + " y ="+ y;
    }



public Object clone() {     //오버라이딩하면서 접근 제어자를 protected에서 public으로 변경하여 다른 클래스에섯 clone()호출 가능
    Object obj = null;
    try{
        obj = super.clone();

    }catch(CloneNotSupportedException e) {

    }
    return obj;
}

public Point clone1() {     
    Object obj = null;
    try{
        obj = super.clone();

    }catch(CloneNotSupportedException e) {

    }
    return (Point) obj;
}

}
/*
    JDK1.5부터 공변 반환타입이 추가되었다.
    오버라이딩 할 때 조상 메서드의 반환타입을 자손 클래스의 타입으로 변경을 허용하는 것
    
 */

 

class CloneEx01{
    public static void main(String[] args) {
        Point original = new Point(3,5);
        Point copy = (Point)original.clone();
        Point copy2 = original.clone1();
        System.out.println("original : " +original);
        System.out.println("copy = " + copy);
        System.out.println("copy2 = " + copy2);     //공변 반환타입을 사용하면 번거로운 형변환이 줄어든다.
    }

}