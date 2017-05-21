package Problem;

import java.util.Scanner;

public class Problem3 {
	
	static String[][] tmp = new String[8][4];
	
	public static void main(String[] args) {

		int[] enterNum = new int[4];
	
		Scanner scan = new Scanner(System.in);
		int N = scan.nextInt();
		enterNum[0] = (int) N /1000;;//千の位
		enterNum[1] = (int)( (N - 1000 * enterNum[0])/100);//百の位
		enterNum[2] = (int) ((N- 1000 * enterNum[0] - 100 *  enterNum[1]) / 10 );//十の位
		enterNum[3] = N- 1000 * enterNum[0] - 100 *  enterNum[1] - 10 * enterNum[2];//一の位

		for(int i=0; i<enterNum.length; i++){
			soroban(enterNum[i], i);
			//System.out.print(enterNum[i]);
		}
		
		for(int i= 0; i<8; i++){
			for(int j=0; j<4; j++){
				System.out.print(tmp[i][j]);
			}
			System.out.println();
		}
		
		//System.out.println(thousand +" "+ hundred + " "+  ten + " " + one);



	}

	public static void soroban(int num, int column){

		
		
		if(num<=4){
			tmp[0][column] = "*";
			tmp[1][column] = " ";
		}else{
			tmp[0][column] = " ";
			tmp[1][column] = "*";
		}
		
		tmp[2][column] = "=";

		for(int i = 3; i < tmp.length; i++){
			tmp[i][column] = "*";	
		}

		tmp[3 + num % 5][column] = " "; 
		
		




	}



}
