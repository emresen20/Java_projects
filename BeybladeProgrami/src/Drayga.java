
public class Drayga extends Beyblade{
    private String kutsalCanavar;

    public Drayga(String kutsalCanavar, String baybladeci, int donusHizi, int saldiriGucu) {
        super(baybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
          System.out.println("Kutsal Canavar adı "+ kutsalCanavar);
    }

    @Override
    public void kutsalcanavarortayacikar() {
         System.out.println(getBaybladeci()+" "+ kutsalCanavar + " ı ortaya çıkıyor"  );
        System.out.println(getBaybladeci()+" ın saldırısı Kaplan Pençesi");
    }
    
    
    
}
