import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Scanner Eklenmesi

        int mesafe,yasi,yTipi,nTutar,gDonusBileti,yindirimi,iTutar,tTutar ;

        System.out.print("Mesafe(KM) : ");
        mesafe = input.nextInt();
        System.out.print("Yaşınızı giriniz : ");
        yasi = input.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        yTipi = input.nextInt();

        if (mesafe>0 && yasi>8 && yTipi==1 && yTipi==2) {



        } else if (yasi<12 && yTipi==2) { // 12 yaşından küçük gidiş dönüş bileti

            nTutar = (int) (mesafe *0.10);
            yindirimi = (int) (nTutar * 0.50);
            iTutar = (int) (nTutar-yindirimi);
            gDonusBileti = (int) (iTutar*0.20);
            tTutar = (int) (iTutar-gDonusBileti)*2;
            System.out.println("Ödenecek Tutar : " + tTutar);


            }else if (yasi< 12 && yTipi==1) {

            nTutar = (int) (mesafe *0.10);
            yindirimi = (int) (nTutar * 0.50);
            iTutar = (int) (nTutar-yindirimi);
            System.out.println("Ödenecek Tutar : " + iTutar);
            
            
            }else if (yasi<24 && 12<24 && yTipi==2) {


            nTutar = (int) (mesafe *0.10);
            yindirimi = (int) (nTutar * 0.10);
            iTutar = (int) (nTutar-yindirimi);
            gDonusBileti = (int) (iTutar*0.20);
            tTutar = (int) (iTutar-gDonusBileti)*2;
            System.out.println("Ödenecek Tutar : " + tTutar);
            
            
            

        } else if (yasi<24 && 12<24 && yTipi==1) {

            nTutar = (int) (mesafe *0.10);
            yindirimi = (int) (nTutar * 0.10);
            iTutar = (int) (nTutar-yindirimi);
            System.out.println("Ödenecek Tutar : " + iTutar);
            
        } else if (yasi>=65 && yTipi==1) {

            nTutar = (int) (mesafe *0.10);
            yindirimi = (int) (nTutar * 0.30);
            iTutar = (int) (nTutar-yindirimi);
            System.out.println("Ödenecek Tutar : " + iTutar);

            
        }else if (yasi>=65 && yTipi==2) {

            nTutar = (int) (mesafe *0.10);
            yindirimi = (int) (nTutar * 0.30);
            iTutar = (int) (nTutar-yindirimi);
            gDonusBileti = (int) (iTutar*0.20);
            tTutar = (int) (iTutar-gDonusBileti)*2;
            System.out.println("Ödenecek Tutar : " + tTutar);

        }else if (yasi<65 && 24<65 && yTipi==1) {

            nTutar = (int) (mesafe *0.10);
            System.out.println("Ödenecek Tutar : " + nTutar );

        }else if (yasi<65 && 24<65 && yTipi==2) {
            nTutar = (int) (mesafe *0.10);
            gDonusBileti = (int) (nTutar*0.20);
            tTutar = (nTutar-gDonusBileti)*2;
            System.out.println("Ödenecek Tutar : " + tTutar);

        }
        else {
            System.out.println("Hatalı Veri Girdiniz !");
        }

        /*else

            }else if (yasi<12 && 12>24 && yTipi==2) {
            yasNdirimi = (int) ((mesafe * 0.10) * 0.10 * 0.20);
            System.out.println("Ödenecek Tutar: " + yasNdirimi);
        }else if (yasi<=12 && 12>24 && yTipi==1) {
                    yasNdirimi = (int) ((mesafe * 0.10) * 0.10);
                    System.out.println("Ödenecek Tutar: " + yasNdirimi);
                }*/






    }
}
