import java.util.Scanner;
public class Hesapla {

	public static void main(String[] args) {
		float sayi1,sayi2;
		Scanner cnn=new Scanner(System.in);
		System.out.print("L�tfen 1.say�y� giriniz : ");
		sayi1=cnn.nextFloat();
		System.out.print("L�tfen 2.say�y� giriniz : ");
		sayi2=cnn.nextFloat();
		
		Islem(sayi1,sayi2);	
	}
	public static void Islem(float x ,float y)
	{
		System.out.println("Cevap : "+(x+y));
		
	}

}
