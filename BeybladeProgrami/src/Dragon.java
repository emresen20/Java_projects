
public class Dragon extends Beyblade {
    private String kutsalCanavar;
  private String gizliyetenek;

    public Dragon(String kutsalCanavar, String gizliyetenek, String baybladeci, int donusHizi, int saldiriGucu) {
        super(baybladeci, donusHizi, saldiriGucu);
        this.kutsalCanavar = kutsalCanavar;
        this.gizliyetenek = gizliyetenek;
    }

    @Override
    public void bilgilerigoster() {
        super.bilgilerigoster(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Kutsal Canavar adı "+ kutsalCanavar);
        System.out.println("gizli yetenek "+ gizliyetenek);
    }

    @Override
    public void kutsalcanavarortayacikar() {
         System.out.println(getBaybladeci()+" "+ kutsalCanavar + " ı ortaya çıkıyor"  );
        System.out.println(getBaybladeci()+" ın saldırısı Hayalet kasırga");
    }
  
    
}
