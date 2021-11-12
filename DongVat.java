public abstract class DongVat{
    private String hoTen;
    private int soChan;
    private String tiengKeu;
    public void setHoTen(String ten) {
        this.hoTen=ten; 
    }
    public String getHoTen() {
        return hoTen;
    }
    public void setSoChan(int chan) {
        this.soChan=chan; 
    }
    public int getSoChan() {
        return soChan;
    }
    public void setTiengKeu(String tk) {
        this.tiengKeu=tk; 
    }
    public String getTiengKeu() {
        return this.tiengKeu;
    }
    public DongVat(){

    }
    public DongVat(String ht, int sc, String tk){
        this.hoTen=ht;
        this.soChan=sc;
        this.tiengKeu=tk;
    }
    public abstract void dichuyen();
   
    
}