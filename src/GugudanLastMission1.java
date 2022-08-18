import java.util.Scanner;

public class GugudanLastMission1 {
	public static void main(String[] args) {
		System.out.println("출력할 (입력숫자)(입력숫자)단? : ");
		Scanner scanner = new Scanner(System.in);
		int j = scanner.nextInt();
		System.out.println("입력숫자 : " + j);
		
		
		for(int a = 1; a < j+1; a++) {
		
			for(int i = 1; i < j+1; i++) {
				System.out.println(a * i);
			}
		}
//		for(int i = 1; i < j+1; i++) {
//			System.out.println(2 * i);
//		}
//		for(int i = 1; i < j+1; i++) {
//			System.out.println(3 * i);
//		}
//		for(int i = 1; i < j+1; i++) {
//			System.out.println(4 * i);
//		}
//		for(int i = 1; i < j+1; i++) {
//			System.out.println(j * i);
//		}
		
	}
}


// 얻은 실적 1 : for문에서 일단 나와야한다고 하니까 1차 문제 해결. 일단 3개 이상 써두고 규칙 반복되는 것 찾기.


//8 -> 팔팔단 출력. 19 -> 십구십구단 출력
//	입력하면 값이 나온다 -> Screen 기능


//	if j =3 -> j+1=4
// if 입력값 j=8 -> 88단 
//		앞의 값을 a, 뒤의 값을 b라고 한다면 a * 1~j / a+1 * 1~j / j * 1~j
//		이중반복문이 필수이다. 왜냐하면 a도 1씩 증가, b도 1씩 증가. b가 먼저 중가하는 반복문.