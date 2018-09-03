public class Handphone 
{
    //deklarasi
    private String merk, tipe, warna;
    private double harga;
    //setter 
    public void setMerk(String merk)
    {
        this.merk=merk;
    }
    public void setTipe(String tipe)
    {
        this.tipe=tipe;
    }
    public void setWarna(String colour)
    {
        warna=colour;   
    }
    public void setHarga(double harga)
    {
        this.harga=harga;
    }
    //getter
    public String getMerk ()
    {
        return merk;
    }
    public String getTipe ()
    {
        return tipe;
    }
    public String getWarna ()
    {
        return warna;
    }
    public double getHarga ()
    {
        return harga;
    }
    //method tambahan
    public double HargaDiskon()
    {
        double diskon = 0.1 * getHarga();
        double total = getHarga() - diskon;
        
        return total;
    }
    
    public void keterangan()
    {
        System.out.println("Harga HP sesudah diskon (10%) = Rp " + HargaDiskon());
    }
}

