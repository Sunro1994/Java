class StringEx04{
    public static void main(String[] args) {
        String fullname = "Hello.java";

        int index = fullname.indexOf('.');

        String fileName= fullname.substring(0, index);

        String ext = fullname.substring(index+1, fullname.length());

        System.out.println("fullName의 확장자를 제외한 이름 : " + fileName);
        System.out.println("FullName의 확장자 :" + ext);
    }
}