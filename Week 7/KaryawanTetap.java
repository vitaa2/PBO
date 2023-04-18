public class KaryawanTetap extends Karyawan {
    private int gajiPokok;

    public KaryawanTetap(String nama, int tunjanganAnak,int gajiPokok){
        super(nama, tunjanganAnak);
        this.gajiPokok = gajiPokok;
    }
    
    public int totalGaji(){
        int tunjanganAnak = getTunjaganAnak() * 50000;
        return gajiPokok + tunjanganAnak;

    }
}

