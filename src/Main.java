
public class Main {
    public static void main(String[] args) {
        yonetici ali=new yonetici("ali");
        calisan veli=new calisan("veli");
        calisan ahmet=new calisan("ahmet");
        ali.addCalisan(ahmet);
        ali.addCalisan(veli);

        System.out.println("Ahmetin yöneticisi: "+ahmet.yonetici._isim);
        System.out.println("Alinin calisanları 0 :" +ali.altlari.get(0)._isim);



        }
    }
