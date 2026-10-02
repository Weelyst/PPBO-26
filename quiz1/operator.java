// Averose Arthur R / TI-2G / 254107020042
public class operator {
    private String namaoperator;
    private int biayalayanan;
public operator(String namaoperator, int biayalayanan){
    this.namaoperator = namaoperator;
    this.biayalayanan = biayalayanan;
}
public void setnamaoperator(String namaoperator){
    this.namaoperator = namaoperator;
}
public void setbiayalayanan(int biayalayanan){
    this.biayalayanan = biayalayanan;
}

public String getnamaoperator (){
    return namaoperator;
}
public int getbiayalayanan (){
    return biayalayanan;
}

public String info(){
    return "Operator: " + namaoperator + ", Biaya Layanan: " + biayalayanan;
}
}




