import java.sql.SQLOutput;

public class Datatype {
	public static void main(String[] args) {
		System.out.println(6); // Number 표시
		System.out.println("six"); // String 문자 표시
		
		System.out.println("6"); // Stirng 6 라는 말
		System.out.println(6+6); // 12숫자
		System.out.println("6"+"6"); //66 문자열 타입은 절대 사칙연산을 할 수 없다
		
		System.out.println(6*6); //36
//		System.out.println("6"*"6");
		System.out.println("1111".length()); // 4 length는 문자의 길이를 나타낸다 1111(4)가 이다.
//		System.out.println(1111.length());  ""표가 없는경우 문자로 해석하지않아 숫자 1111으로 해석해서 오류가 나옴
	}
}	