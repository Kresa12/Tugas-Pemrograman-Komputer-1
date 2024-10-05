class Hewan{

    String jenis;
    String nama_hewan;
    int jumlah_kaki;

    Hewan(String jenis, String nama_hewan, int jumlah_kaki){
        this.jenis = jenis;
        this.nama_hewan = nama_hewan;
        this.jumlah_kaki = jumlah_kaki;
    }

    String get_jenis(){
        return this.jenis;
    }

    String get_nama_hewan(){
        return this.nama_hewan;
    }

    int getJumlah_kaki(){
        return this.jumlah_kaki;
    }

}

public class Main {
    public static void main(String[] args) {

        Hewan hwn1 = new Hewan("mamalia", "kucing", 4);
        System.out.println("Jenis Hewan : " + hwn1.get_jenis());
        System.out.println("Nama Hewan : " + hwn1.get_nama_hewan());
        System.out.println("Jumlah kaki " + hwn1.get_nama_hewan() + " : " + hwn1.getJumlah_kaki());

        System.out.println("________________________________________________________________________");

        Hewan hwn2 = new Hewan("mamalia", "kucing", 4);
        System.out.println("Jenis Hewan : " + hwn2.get_jenis());
        System.out.println("Nama Hewan : " + hwn2.get_nama_hewan());
        System.out.println("Jumlah kaki " + hwn2.get_nama_hewan() + " : " + hwn2.getJumlah_kaki());

    }
}
