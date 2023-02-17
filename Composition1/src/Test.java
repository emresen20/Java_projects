
public class Test {
    public static void main(String[] args) {
        Resolution resolution = new Resolution(1920,1080);
        Monitor monitor = new Monitor("xczxczx", "Asus", "19,2", resolution);
        Kasa kasa = new Kasa("dsdsdsa", "Asus", "Cam");
        Anakart anakart = new Anakart("sdwer", "Casper", 15, "win7");
        Bilgisayar pc = new Bilgisayar(monitor, kasa, anakart);
        pc.getKasa().bilgisiyarı_ac();
        pc.getMonitor().monitoru_kapat();
        pc.getAnakart().isletim_sistemi_yukle("win10");
    }
    
}
