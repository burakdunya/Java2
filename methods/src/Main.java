
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}

	// camelCasing fonksiyon isimleri
	public static void sayiBulmaca() {
		int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
		int aranacak = 5;
		boolean varMi = false;

		for (int sayi : sayilar) {
			if (sayi == aranacak) {
				varMi = true;
				break;
			}
		}
		String mesaj = "";
		if (varMi) {
			mesaj = "Sayi mevcuttur:" + aranacak;
			mesajVer(mesaj);
		} else {
			mesajVer("Sayi mevcut degildir:" + aranacak);
		}
	}

	public static void mesajVer(String mesaj) {
		System.out.println(mesaj);
	}
}
