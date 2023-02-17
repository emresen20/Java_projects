public class programmer extends  worker{
    public   String languages;

    public programmer(String name, String surname, int id, String languages) {
        super(name, surname, id);
        this.languages = languages;
    }


    public void doformat(String os){
        System.out.println(getName()+ ""+ os+"loading");
    }

    @Override
    public void showtheinfos() {
        super.showtheinfos();
        System.out.println("prorammer knows: " + languages );
    }

}
