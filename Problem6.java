package Problem;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("数字を入力してください（2桁以上の整数）：");
		String N = scan.next();
		
		try{
			int errorHantei = Integer.parseInt(N);
		}catch(NumberFormatException e){
			System.out.println("数字以外は入力しないでください");
			return;
		}
		
	
		int keta = N.length();
		
		if(keta <2){
			System.out.println("２桁以上の数値を入力したください");
			return;
		}
		
		int maxNum = 2 * keta -1;
		
		String [][] number = new String[maxNum][maxNum];

		//初期値
		for(int i=0; i< maxNum; i++){
			if(i%2==0){
				number[0][i] = N.substring(i / 2, i / 2 + 1);
			}else{
				number[0][i] = " ";
			}
		}

		for(int i =1; i<maxNum; i++){
			for(int j=0; j<maxNum; j++){

				if(i %2 ==0){
					//偶数行は偶数列のみ値をつめる 配列に詰めるのはi行目はi列からmaxNum-i行まで
					if(j % 2==0 && j >=i && j< maxNum -i ){
						
						if(!number[i-1][j-1].equals(" ") && !number[i-1][j-1].equals(" ") ){
							int tmp =  Integer.parseInt(number[i-1][j-1]) +  Integer.parseInt(number[i-1][j+1]);
							if(tmp >= 10){
								tmp = tmp - 10 * ((int) tmp / 10 );
							}
							number[i][j] = Integer.toString(tmp);
						}
						
					}else{
						number[i][j] = " ";
					}
					
					

				}else{
					//奇数列は帰趨行のみ値をつめる　 配列に詰めるのはi行目はi列からmaxNum-i行まで
					if(j % 2==1 && j >=i && j< maxNum -i){
						
						if(!number[i-1][j-1].equals(" ") && !number[i-1][j-1].equals(" ") ){
							int tmp =  Integer.parseInt(number[i-1][j-1]) +  Integer.parseInt(number[i-1][j+1]);
							if(tmp >= 10){
								tmp = tmp - 10 * ((int) tmp / 10 );
							}
							number[i][j] = Integer.toString(tmp);
						}
						
					}else{
						number[i][j] = " ";
					}


				}

			}

		}

		for(int i=0; i<maxNum; i++){
			for(int j=0; j<maxNum; j++){
				System.out.print(number[i][j]);
			}
			System.out.println();
		}
	}

}
