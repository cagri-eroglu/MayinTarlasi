package mayinTarlasi;

import java.util.Scanner;

public class MainMayin {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int row,column ;
		System.out.println("May�n Tarlas� Oyununa Ho�geldiniz");
		System.out.println("L�tfen oynamak istedi�iniz boyutlar� giriniz");
		System.out.println("sat�r say�s�");
		row = scan.nextInt();
		System.out.println("s�tun say�s�");
		column = scan.nextInt();
		
		MayinTarlasi mayin = new MayinTarlasi(row,column);
		mayin.run();
	}

}
