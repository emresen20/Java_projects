
public class BeybladeFabrikası {
    public Beyblade beybladeUret(String beyblade_turu){
        if (beyblade_turu.equals("Dragon")){
            return new Dragon("Takao", "Mavi Ejderha", "Kutsal Canavarla konuşma", 800, 300);
            
            
        }
        else if (beyblade_turu.equals("Dranza")){
            return  new Dranza("kai", "Kırmzı anka kuşu", 600, 400);
        }
         else if (beyblade_turu.equals("Drayga")){
            return  new Dranza("Rei", "Beyaz kaplan", 800, 250);}
         
         else if (beyblade_turu.equals("Draciel")){
            return  new Dranza("Max", "Kara Kaplumbağa", 400, 1000);}
         else {
             return  null;
         }
        
        
    }
    
    
}
