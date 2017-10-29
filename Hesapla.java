import java.util.Scanner;
public class Hesapla {

	public static void main(String[] args) {
		float sayi1,sayi2;
		Scanner cnn=new Scanner(System.in);
		System.out.print("Lütfen 1.sayýyý giriniz : ");
		sayi1=cnn.nextFloat();
		System.out.print("Lütfen 2.sayýyý giriniz : ");
		sayi2=cnn.nextFloat();
		
		Islem(sayi1,sayi2);	
	}
	public static void Islem(float x ,float y)
	{
		System.out.println("Cevap : "+(x+y));
		
	}

}
