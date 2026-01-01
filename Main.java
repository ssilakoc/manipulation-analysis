import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        boolean sistemCalisiyor = true;

        while (sistemCalisiyor) {
            int toplamPuan = 0;

            System.out.println("\n========================================");
            System.out.println("--- SOSYAL MEDYA MANIPULASYON TESTI ---");
            System.out.println("========================================");


            while (true) {
                System.out.println("\n1. Reklamlarin sizi dinledigini dusunuyor musunuz?");
                System.out.println("1- Evet (10p) | 2- Belki (5p) | 3- Hayir (0p)");
                System.out.print("Seciminiz: ");
                int cevap = klavye.nextInt();
                if (cevap >= 1 && cevap <= 3) {
                    if (cevap == 1) toplamPuan += 10;
                    else if (cevap == 2) toplamPuan += 5;
                    break;
                }
                System.out.println("\n[!] Gecersiz secim! Lutfen 1, 2 veya 3 girin.");
            }


            while (true) {
                System.out.println("\n2. Bedava bir uygulama icin verilerinizi paylasir misiniz?");
                System.out.println("1- Evet (10p) | 2- Kararsizim (5p) | 3- Asla (0p)");
                System.out.print("Seciminiz: ");
                int cevap = klavye.nextInt();
                if (cevap >= 1 && cevap <= 3) {
                    if (cevap == 1) toplamPuan += 10;
                    else if (cevap == 2) toplamPuan += 5;
                    break;
                }
                System.out.println("\n[!] Gecersiz secim! Lutfen 1, 2 veya 3 girin.");
            }


            while (true) {
                System.out.println("\n3. Sosyal medyadaki tartismalara dahil olur musunuz?");
                System.out.println("1- Hemen yazarim (10p) | 2- Sadece okurum (5p) | 3- Ilgilenmem (0p)");
                System.out.print("Seciminiz: ");
                int cevap = klavye.nextInt();
                if (cevap >= 1 && cevap <= 3) {
                    if (cevap == 1) toplamPuan += 10;
                    else if (cevap == 2) toplamPuan += 5;
                    break;
                }
                System.out.println("\n[!] Gecersiz secim! Lutfen 1, 2 veya 3 girin.");
            }


            while (true) {
                System.out.println("\n4. Telefonunuz yanimizda degilken huzursuz olur musunuz?");
                System.out.println("1- Cok fazla (10p) | 2- Biraz (5p) | 3- Hic (0p)");
                System.out.print("Seciminiz: ");
                int cevap = klavye.nextInt();
                if (cevap >= 1 && cevap <= 3) {
                    if (cevap == 1) toplamPuan += 10;
                    else if (cevap == 2) toplamPuan += 5;
                    break;
                }
                System.out.println("\n[!] Gecersiz secim! Lutfen 1, 2 veya 3 girin.");
            }


            while (true) {
                System.out.println("\n5. Algoritmanin onerdigi her seye tıklar mısınız?");
                System.out.println("1- Evet (10p) | 2- Bazen (5p) | 3- Hayir (0p)");
                System.out.print("Seciminiz: ");
                int cevap = klavye.nextInt();
                if (cevap >= 1 && cevap <= 3) {
                    if (cevap == 1) toplamPuan += 10;
                    else if (cevap == 2) toplamPuan += 5;
                    break;
                }
                System.out.println("\n[!] Gecersiz secim! Lutfen 1, 2 veya 3 girin.");
            }


            System.out.println("\n----------------------------------------");
            System.out.println("ANALIZ BITTI. TOPLAM PUANINIZ: " + toplamPuan);

            if (toplamPuan >= 35) {
                System.out.println("SONUC: Cok yuksek manipulasyon riski!");
            } else if (toplamPuan >= 20) {
                System.out.println("SONUC: Orta seviye risk altindasiniz.");
            } else {
                System.out.println("SONUC: Tebrikler, dijital farkindaliginiz yuksek.");
            }
            System.out.println("----------------------------------------");


            System.out.print("\nBaşa donmek icin 0, cikis yapmak icin herhangi bir sayiya basin: ");
            int kontrol = klavye.nextInt();

            if (kontrol != 0) {
                sistemCalisiyor = false;
                System.out.println("Sistemden cikiliyor... Iyi gunler!");
            }
        }
        klavye.close();
    }
}