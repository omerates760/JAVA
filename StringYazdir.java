package Orta;

public class StringYazdir {

	public static void main(String[] args) {
		String[] isimler={"halit","ahmet","bekir","berna","bengisu"};
		
		for(String yazdir:isimler)
		{
			if(yazdir.startsWith("a"))
			{
			System.out.println("a ile baþlayan="+yazdir);
			}
			else if(yazdir.endsWith("t"))
			{
				System.out.println("t ile biten = "+yazdir);
			}
		}

	}

}
