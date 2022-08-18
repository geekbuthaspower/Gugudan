import java.util.Scanner;

public class GugudanLastMission2 {
	public static void main(String[] args) {
		System.out.println("출력할 (입력숫자)(입력숫자)단? : ");
		Scanner scanner = new Scanner(System.in);
		String j = scanner.nextLine();
		String[] splitedValue = j.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		
		
//		System.out.println("입력숫자 : " + j);
		
		
		for(int a = 1; a < first+1; a++) {
		
			for(int i = 1; i < second+1; i++) {
				System.out.println(a * i);
			}
		}
	}
}

// 입력값의 변수명을 내가 보기 쉽게 j라고 설정했다.
// 처음에 했을 때 실행이 안되기에 맨 윗줄부터 다시 보면서 뚝딱뚝딱, 테스트, 뚝딱뚝딱, 테스트 하니 됐다.
// 반복문에 있는 숫자를 처음엔 Integer.parseInt(j)로 했다가 다시 보니 first와 second로 넣을 것 같아 넣어 해결.
