import java.util.Date;

class Card {
String kind;
int number;

Card() {
    this("SPADE",1);
}
Card(String kind, int number){
    this.kind = kind;
    this.number = number;
}

}

class CardToString{
    public static void main(String[] args) {
        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.toString());
        System.out.println(c2.toString());

        //결과로 알 수 있는 것 : 클래스의 이름은 같아도 해쉬코드는 다르다.
                                // toSting()을 오버라이딩 하지 않아서 해쉬코드를 출력한다.

        String a1 = "KOREA";
        Date today = new Date();

        System.out.println("a1 : "+ a1);
        System.out.println("a1.toString() : " +a1.toString());
        System.out.println();
        System.out.println("today : " +today);
        System.out.println("today.toString() : "+ today.toString());

        //Date와 String클래스는 문자열을 그대로 반환하도록 오버라이딩 되어 있다.
    }

}