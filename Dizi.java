import java.util.Collection;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Dizi {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		/*int[] sayilar=new int[10];
		
		for(int i=1;i<=9;i++)
		{
			
			System.out.print(i+"= ");
			sayilar[i]=scan.nextInt();
			}
		System.out.print("8.say� = "+sayilar[8]);
			
		System.out.println("Silmek iste�iniz eleman sirasi =");
		*/
		//public void sil(int silinen)
		//{
			ArrayList  sayi = new ArrayList();
			
			sayi.add(2);
			sayi.add(9);
			sayi.add(4);
			sayi.add(1);
			/*
			int getir;
			
			System.out.print("Dizi Elemanlar� : ");
			System.out.println(sayi);
			System.out.print("Dizi Boyutu : ");
			System.out.println(sayi.size());
			getir=sayi.indexOf("Aranan Kelime �ndex : "+"deneme3");
			System.out.print("Aranan Kelime : ");
			System.out.println(sayi.get(getir));
			System.out.print("Silinen Eleman : ");
			System.out.println(sayi.remove(getir));
			System.out.print("G�ncel Elemanlar : ");
			System.out.println(sayi);
			*/
			//G�NCELLEME YAPAR
			sayi.set(3, 6);
			//Collections.sort(sayi);
			//Collections.enumeration(sayi);
			int ss;
			//�STEN�LEN DE�ER� GETR�R
			ss=(int) sayi.get(2);
			//D�Z� ELEMAN SAYISINI VER�R
			System.out.println(sayi.size());
			System.out.println(ss);
			Collections.enumeration(sayi);
			System.out.println(sayi);
			
		//}
		

	}
	
	
}
