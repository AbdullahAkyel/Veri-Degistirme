package VeriDegistirme;
import java.util.Scanner;

public class VeriDegistirme {
	static class Kedi {
		private String isim;
		Scanner keyboard = new Scanner(System.in);
		
		public Kedi (String isim) {
			this.isim=isim;
		}
		public void setIsim(String isim) {
			this.isim = isim;
		}
		public String getIsim() {
			return this.isim;
		}
		public void showInfos() {
			System.out.println("Kedi ismi: "+getIsim());
		}
		public String kediIsmi() {
			System.out.print("Kedi ismini girin: ");
			setIsim(keyboard.nextLine());
			System.out.println("");
			System.out.println("Kedi ismi: "+getIsim());
			return getIsim();
		}
	}
	static class Akvaryum {
		private int balikSayisi = 0;
		Scanner keyboard = new Scanner(System.in);
		
		public Akvaryum (int balikSayisi) {
			this.balikSayisi=balikSayisi;
		}
		
		public void balikEkle() {
			System.out.print("Kac tane balik eklemek istiyorsunuz?: ");

			int adet = keyboard.nextInt();
			System.out.println("");
			balikSayisi = balikSayisi + adet;
		}
		public void balikSil() {
			System.out.print("Kac tane balik silmek istiyorsunuz?: ");
			int adet = keyboard.nextInt();
			System.out.println("");
			balikSayisi = balikSayisi - adet;
		}
		public int getBalikSayisi() {
			return this.balikSayisi;
		}
		public void showInfos2() {
			System.out.println("Balik sayisi: "+this.balikSayisi);
	}
}	

	static class Insan {
		private String Isim;
		private String TCKimlik;
		Scanner keyboard = new Scanner(System.in);
		
		public Insan(String Isim, String TCKimlik) {
			this.Isim=Isim;
			this.TCKimlik=TCKimlik;
		}
		public void setIsim(String Isim) {
			this.Isim=Isim;
		}
		public void setTCKimlik(String TCKimlik) {
			this.TCKimlik=TCKimlik;
		}
		public String getBilgiler() {
			return this.Isim +" "+ this.TCKimlik;
		}
		public String kendiniTanit() {
			System.out.print("Adinizi girin: ");
			setIsim(keyboard.nextLine());
			System.out.print("Kimlik Numaranizi girin: ");
			setTCKimlik(keyboard.nextLine());
			System.out.println("");
			System.out.println("Bilgiler: "+getBilgiler());
			return getBilgiler();
		}
		public void showInfos3() {
			System.out.println("Bilgiler: "+getBilgiler());	
	}
}
	
	
	public static void main(String[] args) {
		Insan kisi = new Insan("Abdullah", "12345678901");
		kisi.showInfos3();
		
		Kedi kedi = new Kedi("Cakir");
		kedi.showInfos();
		
		Akvaryum balik = new Akvaryum(5);
		balik.showInfos2();
		
		System.out.println("");
		
		while(true) {
			System.out.print("Menu icin 1'e basin! - ");
			System.out.print("Cikmak icin 0'a basin!: ");

			Scanner keyboard = new Scanner(System.in);
			int secim = keyboard.nextInt();
			System.out.println("");
			
			if (secim == 0) {
				System.out.print("Iyi gunler..");
				System.exit(0);
			}else if (secim == 1) {
				System.out.println("******MENU******");
				System.out.println("1)Balik eklemek istiyorsaniz 1'e basin! ");
				System.out.println("2)Balik silmek istiyorsaniz 2'ye basin! ");
				System.out.println("3)Yeni bilgiler icin 3'e basin! ");
				System.out.println("4)Kedi ismini degistirmek icin 4'e basin! ");
				int secim2 = keyboard.nextInt();
				
				if (secim2==1) {
					balik.balikEkle();
					kisi.showInfos3();
					kedi.showInfos();
					balik.showInfos2();
				}else if (secim2==2) {
					balik.balikSil();
					kisi.showInfos3();
					kedi.showInfos();
					balik.showInfos2();
				}else if (secim2==3) {
					kisi.kendiniTanit();
					kedi.showInfos();
					balik.showInfos2();
				}else if (secim2==4) {
					kedi.kediIsmi();
					kisi.showInfos3();
					balik.showInfos2();
				}
				else {
					System.out.println("Lutfen belirtilen sayilari tuslayin!");
				}	
			}else {
				System.out.println("Lutfen belirtilen sayilari tuslayin!");
				System.exit(0);
			}
			System.out.println("");
		}
	}
}
























	
	


	










