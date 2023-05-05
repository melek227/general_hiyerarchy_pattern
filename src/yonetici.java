import java.util.ArrayList;
public class yonetici extends calisan{//her yönetici bir çaşısan olduğu için  miras aldu
    ArrayList<calisan> altlari=new ArrayList<calisan>(); //yönetici calisanı tutar/subordinate
    //birden fazla çalışanın bir yöneticisi vardır.
    //yönetici çalışanlarını bilir



    public yonetici(String isim){
        super(isim);
    }
    public void addCalisan(calisan alt){
        altlari.add(alt); //yonetici kendi altında tuttuğu kişilere yeni kişiyi atar
        alt.yonetici=this; //yönetici kendi altına çalışan ekler

    }



}
