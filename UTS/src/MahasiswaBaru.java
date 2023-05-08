class MahasiswaBaru extends Mahasiswa {
    String asalSekolah;

    boolean ikutOspek() {
        return true;
    }

    @Override
    void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Mahasiswa Harus Ikut Ospek : " + ikutOspek());
        System.out.println("Asal Sekolah: " + asalSekolah);
    }
}