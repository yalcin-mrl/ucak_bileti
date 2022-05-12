import java.util.Scanner;

public class UcakBileti {
    public static void main(String[] args){
        int mes,yas,yt;
        double normalTutar = 0,toplam =0;
        Scanner sc = new Scanner(System.in);
        try{
            System.out.print("Mesafeyi km türünden giriniz: ");
            mes = sc.nextInt();
            System.out.print("Yasınızı giriniz:");
            yas = sc.nextInt();
            System.out.print("Yolculuk tipini giriniz (1 => Tek yön 2 => Gidis-dönus): ");
            yt = sc.nextInt();
            if(mes >=0){
                normalTutar = mes*(0.10);
                if(yas < 12){
                    normalTutar = normalTutar*(0.50);
                }
                else if(yas >=12 && yas <=24){
                    normalTutar = normalTutar*(0.9);
                }
                else if(yas>65){
                    normalTutar = normalTutar*(0.7);
                }else{
                    toplam = normalTutar;
                }
                if(yt == 1){
                    toplam = normalTutar;
                    System.out.println("Toplam tutar = "+ toplam + " TL");
                }
                else if(yt == 2){
                    normalTutar = normalTutar*(0.8);
                    toplam = normalTutar*2;
                    System.out.println("Toplam tutar = "+ toplam + " TL");
                }else{
                    System.out.println("Hatalı veri girişi - 1 veya 2 arasında secim yapın");
                }
            }else{
                System.out.println("Hatalı veri girişi - Pozitif değer girin");
            }
        }catch (Exception e){
            System.out.println("Hatalı giriş : "+e);
        }
    }
}
