package Bus;

public class UjiBus {
    public static void main(String[] args) {
        //Membuat objek busBesar dari kelas bus
        Bus busBesar = new Bus(40);
        busBesar.cetak();

        //Penambahan penumpang
        busBesar.addPenumpang(15); //Menambahkan 15 penumpang
        busBesar.cetak();

        //Penambahan penumpang
        busBesar.addPenumpang(5); //Menambahkan 5 penumpang
        busBesar.cetak();

        //Penambahan penumpang
        busBesar.addPenumpang(26); //Menambahkan 26 penumpang
        busBesar.cetak();

        //Sebelum kode program pada kelas Ujibus dirubah, hasilnya adalah :

        //Hasil akhirnya program akan mengalami error. Karena modifier private hanya bisa dipanggil di dalam class yang
        //sama. Lalu untuk error ketika pembuatan objek baru, solusinya adalah dengan memasukkan nilai dari parameter
        //penumpang dan maxPenumpang yang telah dibuat sebelumnya. Untuk maxPenumpang dimasukkan pada objek baru,
        //sedangkan untuk penumpang dimasukkan pada method addPenumpang.


        // Sesudah kode program pada kelas Ujibus dirubah, hasilnya adalah :

        //Kode program dapat dijalankan dan menampilkan output penumpang bus sekarang, seharusnya, dan maksimalnya.
        //Dikarenakan parameter pada objek dan method addPenumpang sudah diisi. Apabila penumpang yang ditambahkan
        //melebihi maxPenumpang yang telah ditetapkan maka akan keluar peringatan "Pemumpang Melebihi Kuota".


    }
}
