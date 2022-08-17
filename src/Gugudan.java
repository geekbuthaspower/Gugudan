public class Gugudan {
	public static void main(String[] args) {
		
		// 2,3,4,5,6,7,8,9 -> 1. i로 설정  2. 새로운 변수 설정

		// TRY 1 -> 2를 i+2로 표현 (예상 문제 : 9초과)
		// 2단 생성 시 2로 고정되어야 하는데 숫자가 계속 증가함.
		

		// TRY 2 -> 새로운 변수 설정
		// 이중 for문 성공! (3 누르면 3단만 나오는 그건 모르겠음)
		for(int j = 2; j < 10; j++) {
		
			int[] result = new int[9];
			for(int i = 0; i < result.length; i++) {
				result[i] = j * (i + 1);
			}
			for(int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
		}
	}
}


		

//public class Gugudan {
//	public static void main(String[] args) {
//		int[] result = new int[9];
//		for(int i = 0; i < result.length; i++) {
//			result[i] = 2 * (i + 1);
//		}
//		
//		for(int i = 0; i < result.length; i++) {
//			System.out.println(result[i]);
//		}
//		
//		int[] times3 = new int[9];
//		for(int i = 0; i < times3.length; i++) {
//			times3[i] = 3 * (i + 1);
//		}
//		
//		for(int i = 0; i < times3.length; i++) {
//			System.out.println(times3[i]);
//		}
//	}
//}





	// 2단
//	System.out.println("");
//	System.out.println("2단");
//	System.out.println(2 * 1);
//	System.out.println(2 * 2);
//	System.out.println(2 * 3);
//	System.out.println(2 * 4);
//	System.out.println(2 * 5);
//	System.out.println(2 * 6);
//	System.out.println(2 * 7);
//	System.out.println(2 * 8);
//	System.out.println(2 * 9);
//	System.out.println(2 * 10);
	
		
	// 3단 
//	System.out.println("");
//	System.out.println("3단");
//	System.out.println(3 * 1);
//	System.out.println(3 * 2);
//	System.out.println(3 * 3);
//	System.out.println(3 * 4);
//	System.out.println(3 * 5);
//	System.out.println(3 * 6);
//	System.out.println(3 * 7);
//	System.out.println(3 * 8);
//	System.out.println(3 * 9);
	
		
		
		
		
	// 4단
//	System.out.println("");
//	System.out.println("4단");
//	int result = 4 * 1;
//	System.out.println(result);
//	result = 4 * 2;
//	System.out.println(result);
//	result = 4 * 3;
//	System.out.println(result);
//	result = 4 * 4;
//	System.out.println(result);
//	result = 4 * 5;
//	System.out.println(result);	
//	result = 4 * 6;
//	System.out.println(result);
//	result = 4 * 7;
//	System.out.println(result);
//	result = 4 * 8;
//	System.out.println(result);
//	result = 4 * 9;
//	System.out.println(result);
	
		
		
		
		
	// 5단
//import java.util.Scanner;

//	System.out.println("구구단 중 출력할 단은? : ");
//	Scanner scanner = new Scanner(System.in);
//	int number = scanner.nextInt();
//	System.out.println(number * 1);
//	System.out.println(number * 2);
//	System.out.println(number * 3);
//	System.out.println(number * 4);
//	System.out.println(number * 5);
//	System.out.println(number * 6);
//	System.out.println(number * 7);
//	System.out.println(number * 8);
//	System.out.println(number * 9);
		
		
		
		
		
		// 6단
//		int i = 1;
//		while(i < 10) {
//			System.out.println(6 * i);
//			i = i + 1;
//		}
	
		
		// 7단
//		for(int j = 1; j < 10; j++) {
//			System.out.println(7 * j);
//		}
		
		
		
		
		
		// 8,9단
//import java.util.Scanner;

//		System.out.println("구구단 중 출력할 단은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println("사용자가 입력한 값 : " + number);
//		
//		if(number < 2) {
//			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
//		} else if(number > 9) {
//			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다.");
//		} else {
//			for(int i = 1; i < 10; i++)
//				System.out.println(number * i);
//		}
//	}		
//}
		