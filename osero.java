package Problem;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;



public class osero {
	static String[][] osero = new String[7][7];
	static int x = 0;
	static int y = 0;
	static String ishi = "◯";


	public static void main(String[] args) {
		for(int i=0; i<7; i++){
			for(int j=0; j<7; j++){

				osero[i][j] = "・";
			}
		}

		while(true){

			putIshi(x,y,"◯");
			drawOsero();

			putIshi(x,y,"●");
			drawOsero();
		}

	}

	public static void putIshi(int x, int y, String ishi){

		Scanner scan = new Scanner(System.in);

		int flag =0;


		while(flag == 0){
			System.out.println(ishi + "の番です");
			System.out.print("どこにおきますか縦軸");
			x = scan.nextInt();
			System.out.print("どこにおきますか横軸");
			y = scan.nextInt();

			if(osero[x][y].equals("・")){
				if(ishi.equals("◯")){
					osero[x][y] = "◯";
					flag = 1;
					reverse(x, y, ishi);
				}else if(ishi.equals("●")){
					osero[x][y] = "●";
					flag = 1;
					reverse(x, y, ishi);
				}
			}else{
				System.out.println("そこにはすでに石ががります。");
			}
		}

	}

	public static void drawOsero(){
		System.out.println(" ０１２３４５６");
		for(int i=0; i<7; i++){
			System.out.print(i);
			for(int j=0; j<7; j++){
				
				System.out.print(osero[i][j]);
			}
			System.out.println();
		}
	}

	public static void reverse(int x, int y, String ishi){

		ArrayList<Integer> sousaX = new ArrayList<Integer>();
		ArrayList<Integer> sousaY = new ArrayList<Integer>();

		int originX =x;
		int originY =y;


		for(int i=1; i <=8; i++){
			
			//一方向のループが終わったら元の位置にx,yを戻す
			x = originX;
			y = originY;
			
			//System.out.println("i" + i);
			//次の走査に行く前にアレイを初期化
			sousaX.clear();
			sousaY.clear();
			
			while(true){

				switch(i){
				case 1://右
					x++;
					break;
				case 2://下
					y++;
					break;
				case 3://左
					x--;
					break;
				case 4://上
					y--;
					break;
				case 5://右上
					x++;
					y--;
					break;
				case 6://右下
					x++;
					y++;
					break;
				case 7://左上
					x--;
					y--;
					break;
				case 8://左下
					x--;
					y++;
					break;	
				}
				
				//System.out.println(x + " " + y);
				
				//範囲外または石がないところならループからでる
				if(x<0 || y<0 || x>=7 || y>=7 || osero[x][y].equals("・")){
					break;
				}
				

				sousaX.add(x);sousaY.add(y);
				
				//自分の石なら裏返し処理
				if(osero[x][y].equals(ishi)){

					for(int k= 0; k < sousaX.size(); k++){
						osero[sousaX.get(k)][sousaY.get(k)] = ishi;
						//System.out.println(sousaX.get(k));
						//System.out.println(sousaY.get(k));
					}
					break;
				}

			}//end while
		}//end for文

	}
}




