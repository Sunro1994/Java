/*
    Clone은 단순히 객체에 저장된 값을 그대로 복제할 뿐 객체까지 복제하지는 않는다.
    객체배열을 clone()으로 복제하는 경우에는 원본과 복제본이 같은 객체를 공유하므로 완전한 복제라고 할 수 없다.
    이러한 복사를 얕은복사(swallow copy)라고 한다.

    반면 원본이 참조하고 있는 객체까지 복제하는 것을 깊은복사(deep copy) 라고 하며, 원본과 복사본이 서로 다른 객체를 참조하기 때문에 원본의 변경이 복사본에 영향을 미치지 않는다.


 */

 class Circle implements Cloneable{
    Point p;
    double r;

    Circle(Point p, double r) {
        this.p =p;
        this.r= r;
    }


 public Circle shallowCopy() {
    Object obj = null;

    try {
        obj = super.clone();
    } catch (CloneNotSupportedException e) {
        
    }

    return (Circle)obj;
 }

 public Circle deepCopy() {
    Object obj = null;

    try {
        obj = super.clone();
    } catch (CloneNotSupportedException e) {

    }
    Circle c = (Circle)obj;
    c.p = new Point(this.p.x, this.p.y);

    return c;
 }
 public String toString() {
    return "[p= " + p + ", r=" + r +"]";
 }
}

 class Point {
    int x,y;

    Point(int x, int y) {
        this.x = x;
        this.y =y;
    }
    public String toString() {
        return "("+x+", "+y+")" ;
    }
 }


 class ShallowDeepCopy{
public static void main(String[] args) {
    Circle c1 = new Circle(new Point(1, 1), 2.0);
    Circle c2 = c1.shallowCopy();
    Circle c3 = c1.deepCopy();

    System.out.println("c1= " + c1);
    System.out.println("c2= " + c2);
    System.out.println("c3= " + c3);

    c1.p.x = 9;
    c1.p.y = 9;
System.out.println("변경 후 ==");
    System.out.println("c1= " + c1);
    System.out.println("c2= " + c2);
    System.out.println("c3= " + c3);

}

 }

