import java.util.Scanner;

public class gudan {
	public static void main(String[] args) {
		
//		//2��
//		System.out.println("2��");
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
//		//3��
//		System.out.println("3��");
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
//		//4��
//		int result;
//		System.out.println("4��");
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
		
//		System.out.println("������ �� ����� ����? : ");
//		Scanner scanner = new Scanner(System.in);
//		int number = scanner.nextInt();
//		System.out.println(number * 1);
//		System.out.println(number * 2);
//		System.out.println(number * 3);
//		System.out.println(number * 4);
//		System.out.println(number * 5);
//		System.out.println(number * 6);
//		System.out.println(number * 7);
//		System.out.println(number * 8);
//		System.out.println(number * 9);
		
		for(int i =2 ; i < 10 ; i++) {
			for(int j=1; j<10 ; j++) {
				System.out.println(i+"*"+j+"="+i*j);
			}
			System.out.println("");
		}
		int i = 2;
		int j = 1;
		while (i < 10) {
			while(j<10) {
				System.out.println(i+"*"+j+"="+i*j);
				j++;
			}
			System.out.println("");
			i++;
			j=1;
		}
	}
}