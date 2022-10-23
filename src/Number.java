public class Number{
	public static void main(String[] args) {
		// Operator(연산자)
		System.out.println(6+2); //8
		System.out.println(6-2); //4
		System.out.println(6 * 2); //12
		System.out.println(6 / 2); //3
		
		System.out.println(Math.PI); //3.141592653589793 
		System.out.println(Math.floor(Math.PI)); // math.floor 소숫점을 안보이게끔 하는 math list 고로 3.14~~의 소숫점을 가리게끔 했음 즉 내림
		System.out.println(Math.floor(1.9234564)); // 위에 응용
		System.out.println(Math.ceil(Math.PI)); // ceil  소숫점이 있으면 그냥 올림
		System.out.println(Math.ceil(0.12)); // 용 사용해보니 반올림이 아니라 그냥 올림이여서 반올림도 어떤건지 알아 보고 싶다.
		System.out.println(Math.round(Math.PI)); // round라는 값은 반올림을 한다
		System.out.println(Math.round(3.15)); // 위에 응용하여 봄 
		System.out.println(Math.random());
		// floor= 소수점 내림 ceil=소수점 올림 round=반올림
		
	}
}	