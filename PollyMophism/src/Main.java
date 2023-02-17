class Hayvan {
    private String isim;

    public Hayvan(String isim) {
        this.isim = isim;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus(){
        return "Hayvan konuşuyor";
        
    }
    class Kedi extends Hayvan{

        public Kedi(String isim) {
            super(isim);
        }

        @Override
        public String konus() {
            return this.getIsim()+ "miyavlıyor";
        }
        class Kopek extends Hayvan{

            public Kopek(String isim) {
                super(isim);
            }

            @Override
            public String konus() {
                return this.getIsim()+ "havlıyor"; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
            }
            
        }
        class At extends Hayvan{

            public At(String isim) {
                super(isim);
            }

            @Override
            public String konus() {
                return getIsim()+ "Kişniyor"; 
            
        }
        
  
}
}


public class Main {
    public static void Main(String[] args) {
        Hayvan hayvan = new Kedi("Pamuk");
        System.out.println(hayvan.konus());
    }
        
    }
    
}
