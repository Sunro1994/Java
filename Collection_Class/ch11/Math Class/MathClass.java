/*
  Math클래스는 내부에 인스턴스변수가 하나도 없어 private로 되어있다.
  모두 static메서드이며, 2개의 상수만 정의되어 있다.

  public static final double E = 2.71828118284590452354; //자연로그의 밑
  public static final double PI = 3.14159265358979323846; //원주율
 */


/*
 static double abs(double a)
 static float abs(float f)
 static int abs(int f)
 static long abs(long f)

 절대값 반환

 static double ceil(double a)
 올림

 static double floor(double a)
 버림

 static double max(double a, double b)
 static float max(float a, float b)
 static int max(int a, int b)
 static long max(long a, long b)
최대값

min = 최소값

static double random()
0.0~1.0사이의 double값 반환(1.0은 포함하지 않는다.)

static double rint(double a)
가장 가까운 정수값을 double로 반환 두 정수 정가운데 있는 값은 짝수를 반환

static long round(double a)
static long round(float a)

수섲ㅁ 첫번째 자리에서 반올림한 정수값을 반환 음수인경우 round와 rint의 값이 다르다는 것에 주의
 */


 //올림, 버림, 반올림

 class MathEx01{
    public static void main(String[] args) {
        //소수점 두자리수까지만 얻고 싶을 때

        //1. 100을 곱해 소수점 아래를 반올림할 준비
        double a = 90.7552*100;
        
        //2. 반올림
         a = Math.round(a);     //rint메서드는 첫번째 자리에서 반올림하여 double을 반환, 두 정수의 정가운데 있는 값은 가장 가까운 짝수 정수를 반환
                                //round는 더 큰 값으로 반올림 만약 -1.5를 round와 rint로 반올ㄹ미하면 rint는 짝수음수 -2, round는 1을 반환

        //3. 다시 100으로 나눈다.
        a /= 100;


    }
 }

 