package mayinTarlasi;

import java.util.Scanner;

public class MainMayin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row,column ;
		System.out.println("Mayýn Tarlasý Oyununa Hoþgeldiniz");
		System.out.println("Lütfen oynamak istediðiniz boyutlarý giriniz");
		System.out.println("satýr sayýsý");
		row = scan.nextInt();
		System.out.println("sütun sayýsý");
		column = scan.nextInt();
		
		MayinTarlasi mayin = new MayinTarlasi(row,column);
		mayin.run();
	}

}
