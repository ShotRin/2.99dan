import java.util.Scanner;

public class gudan {
	public static void main(String[] args) {
		
//		//2단
//		System.out.println("2단");
//		System.out.println(2*1);
//		System.out.println(2*2);
//		System.out.println(2*3);
//		System.out.println(2*4);
//		System.out.println(2*5);
//		System.out.println(2*6);
//		System.out.println(2*7);
//		System.out.println(2*8);
//		System.out.println(2*9);
//		
//		
//		//3단
//		System.out.println("3단");
//		System.out.println(3*1);
//		System.out.println(3*2);
//		System.out.println(3*3);
//		System.out.println(3*4);
//		System.out.println(3*5);
//		System.out.println(3*6);
//		System.out.println(3*7);
//		System.out.println(3*8);
//		System.out.println(3*9);
//		
//		
//		//4단
//		int result;
//		System.out.println("4단");
//		result = 4*1;
//		System.out.println(result);
//		result = 4*2;
//		System.out.println(result);
//		result = 4*3;
//		System.out.println(result);
//		result = 4*4;
//		System.out.println(result);
//		result = 4*5;
//		System.out.println(result);
//		result = 4*6;
//		System.out.println(result);
//		result = 4*7;
//		System.out.println(result);
//		result = 4*8;
//		System.out.println(result);
//		result = 4*9;
//		System.out.println(result);
//		
//		System.out.println("구구단 중 출력할 답은? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		if ( number < 2 || number > 9)
//		{
//			for(int j=1; j<10 ; j++) {
//				System.out.println(number+"*"+j+"="+number*j);
//			}
//		}
//		else {
//			System.out.println("알맞은 값을 입력해주세요.");
//		}
//		
//		for(int i =2 ; i < 10 ; i++) {
//			for(int j=1; j<10 ; j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//			}
//			System.out.println("");
//		}
//		int i = 2;
//		int j = 1;
//		while (i < 10) {
//			while(j<10) {
//				System.out.println(i+"*"+j+"="+i*j);
//				j++;
//			}
//			System.out.println("");
//			i++;
//			j=1;
//		}
		
		int[] result = new int[9];
		for(int i = 0 ; i < result.length; i++)
		{
			result[i]= 2*(i+1);
			System.out.println(result[i]);
		}
		int[] result2 = new int[9];
		for(int i = 0 ; i < result2.length; i++)
		{
			result2[i]= 3*(i+1);
			System.out.println(result2[i]);
		}
		
	}
}