public class StringApp {

public static void main(String[] args) {

System.out.println("Hello world"); // String 문자열
System.out.println('H'); //작은 따옴표는 특수한 데이터 타입을 가르킨다. Character <- 한글자를 사용하는 데이터 타입
System.out.println("H"); // 한글자지만 "를 사용 했으니 문자열 즉 String

System.out.println("Hello " + "World ");

// - [ \n ] 는 New라인 즉 줄바꿈
System.out.println("Hello \nWorld");

// [ \ ] 역 슬래시는 escape " 같은 임무를 일시적으로 도망시키는것 즉 기호와 문자 사이의 충돌을 방지한다.
System.out.println("Hello \"World\"");

}

}