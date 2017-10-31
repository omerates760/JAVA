package Orta;

public class ReturnIleFactHesaplama {

	public static void main(String[] args) {
		
		System.out.println(faktoriyel(5));
	}
	public static long faktoriyel(int sayi)
	{
		if(sayi<=1)
		{
			return 1;
			
		}
		else
		{
			return sayi*faktoriyel((sayi-1));
		}
		
	}

}
