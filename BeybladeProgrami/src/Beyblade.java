
public class Beyblade {
    private String baybladeci;
    private int donusHizi;
    private int saldiriGucu;

    public Beyblade(String baybladeci, int donusHizi, int saldiriGucu) {
        this.baybladeci = baybladeci;
        this.donusHizi = donusHizi;
        this.saldiriGucu = saldiriGucu;
    }

    public String getBaybladeci() {
        return baybladeci;
    }

    public void setBaybladeci(String baybladeci) {
        this.baybladeci = baybladeci;
    }

    public int getDonusHizi() {
        return donusHizi;
    }

    public void setDonusHizi(int donusHizi) {
        this.donusHizi = donusHizi;
    }

    public int getSaldiriGucu() {
        return saldiriGucu;
    }

    public void setSaldiriGucu(int saldiriGucu) {
        this.saldiriGucu = saldiriGucu;
    }
    public void saldir(){
        System.out.println(baybladeci+" "+ saldiriGucu+ " ve "+ donusHizi +"ile saldırıyor" );
        
    }
    public void kutsalcanavarortayacikar(){
        System.out.println("Bu baybladenin kutsal canavarı bulunmuyor");
    }
    public void bilgilerigoster(){
        System.out.println("Beybladeci ismi: "+ getBaybladeci());
        System.out.println("Saldırı gücü :"+saldiriGucu);
        System.out.println("Beybladeci ismi :" + donusHizi);
        
        
    }
    
    
           
  
}
