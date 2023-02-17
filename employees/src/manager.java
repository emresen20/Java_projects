public class manager extends worker{
    private int personsresponsible;

    public manager(String name, String surname, int id, int personsresponsible) {
        super(name, surname, id);
        this.personsresponsible = personsresponsible;
    }

    @Override
    public void showtheinfos() {
        super.showtheinfos();
        System.out.println("Number of people the manager is responsible for" +personsresponsible);
    }
    public  void  makeextra(int amount){
        System.out.println(getName()+ " " + "for emloyess    "+ amount + " " + "giving extra");
    }
}
