public class Sepeda {
    int gear = 5;
    int jumlahRoda;
    String merk;
    String jenis;

    void ngerem(){
        System.out.println("Sepeda di rem");
    }

    Sepeda(int jumlahRoda,String jenis, String merk ){
        System.out.println("Sepeda "+ jenis +" bermerk "+merk+" Memiliki jumlah roda "+ jumlahRoda);
        this.jenis = jenis;
        this.merk = merk;
        this.jumlahRoda = jumlahRoda;
    }

}
class sepedalipat{
    int ukuranban;
    String merk;
    int kecepatan;
    String keunikan;



    void Melipat(){
        System.out.println("Melipat Sepeda");
    }
    sepedalipat(int ukuranban,int kecepatan,String merk, String keunikan){
        System.out.println("merk sepeda "+ merk+" ukuran ban "+ukuranban+ " inci "+"Kecepatan yang dapat di peroleh " +kecepatan +" KM/h, Keunikannya dapat "+keunikan);
    }
    
}
class Aksisepeda{
    public static void main(String[] args){
        Sepeda sepedaBalap = new Sepeda(2,"x", "y");
        int gearSepeda = sepedaBalap.gear;
        System.out.println("Jumlah Gear "+gearSepeda);
        sepedaBalap.ngerem();
        System.out.println("\n ");
        sepedalipat sepedaUnik = new sepedalipat(16, 30, "United","Melipat");
        sepedaUnik.Melipat();
        
    }
}


