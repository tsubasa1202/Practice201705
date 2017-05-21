package Problem;

import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MaximizeAction;

public class Problem4 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("一つ目の整数を入力");
		int num1 = scan.nextInt();
		System.out.print("二つ目の整数を入力");
		int num2 = scan.nextInt();
		
		for(int i=1; i<= Math.max(num1, num2); i++){
			
			if(num1 % i ==0 && num2 % i ==0){
				System.out.print(i + " ");
				
			}
			
		}
		
		
	}

}
