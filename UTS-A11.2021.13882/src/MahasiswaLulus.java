class MahasiswaLulus extends Mahasiswa {
    int tahunWisuda;
    float ipk;

    boolean ikutWisuda() {
        return true;
    }

    @Override
    void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Tahun Wisuda: " + tahunWisuda);
        System.out.println("IPK: " + ipk);
    }
}