package Problem;

import java.util.Scanner;

public class Problem5 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("整数を入力");
		int num = scan.nextInt();
		
		for(int i=1; i<= num; i++){
			hantei(i);
		}
		
	}
	
	public static void hantei(int number){
		
		String result = Integer.toString(number);
		
		if(number %3 == 0 && number % 5 != 0){
			result = "Fizz";
		}else if(number % 5 ==0 && number % 3 != 0){
			result = "Buzz";
		}else if(number % 3 == 0 && number % 5 ==0){
			result = "FizzBuzz";
		}
	
			System.out.print(result + " ");
		
	}

}
