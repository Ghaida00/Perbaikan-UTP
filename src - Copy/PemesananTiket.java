class PemesananTiket {
   // Do your magic here...
   private String namaPemesan;
   private String kodeBooking;
   private String tanggalPesanan;
   private TiketKonser tiket;

   //Konstruktor untuk menginisialisasi objek PemesananTiket baru
   public PemesananTiket(String namaPemesan, TiketKonser tiket) {
    this.namaPemesan = namaPemesan;
    this.tiket = tiket;
    this.kodeBooking = Main.generateKodeBooking();
    this.tanggalPesanan = Main.getCurrentDate();
   }
   //Getter untuk mengambil nama pemesan tiket
   public String getNamaPemesan() {
       return namaPemesan;
   }
   //Getter untuk mengambil kode booking
   public String getKodeBooking() {
       return kodeBooking;
   }
   //Getter untuk mengambil tanggal pemesanan
   public String getTanggalPemesanan(){
    return tanggalPesanan;
   }
   public String getJenisTiket(){
    return tiket.getNamaTiket();
   }
   public double getTotalHarga(){
     return tiket.getHarga();
    }
    @Override
    public String toString() {
     return "Nama Pemesan: " + namaPemesan + "\n" +
    "Kode Booking: " + kodeBooking + "\n" +
    "Tanggal Pesanan: " + tanggalPesanan + "\n" +
    "Tiket yang dipesan: " + getJenisTiket() + "\n" +
    "Total harga: " + getTotalHarga() + " USD";
   }
 }