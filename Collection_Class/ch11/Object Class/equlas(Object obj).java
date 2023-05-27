class EqualsEx1 {
    public static void main(String[] args) {
        String a = "A";
        String b = "B";

        if(a.equals(b))
        System.out.println("a는b와 같다.");
        else {
            System.out.println("a는 b와 다르다.");
        }

        a=b;    // 같은 주소값이 저장된다.

        if(a.equals(b))
        System.out.println("a는b와 같다.");
        else {
            System.out.println("a는 b와 다르다.");
        }

        System.out.println("=============두 번째 예제 ===========");

        Person p1 = new Person(8011081111222L);
        Person p2 = new Person(8011081111222L);

        if(p1 == p2) System.out.println("p1 = p2"); //      //해쉬코드를 비교
        else System.out.println("p1 != p2");


        if(p1.equals(p2)) System.out.println("p1= pw");     // 오버라이딩을 통해 String인스턴스가 갖는 문자열 값을 비교
        else System.out.println("p1 != p2");





    }
    


}

class Person{
    long id;

    public boolean equals(Object obj) {
        if(obj instanceof Person) return id == ((Person)obj).id;
        else return false;
    }

    Person(long id) {
        this.id = id;
    }
}