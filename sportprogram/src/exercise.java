public class exercise {
    private  int burpee_number;
    private int pushup_number;
    private int situp_number;
    private int squat_number;

    public exercise(int burpee_number, int pushup_number, int situp_number, int squat_number) {
        this.burpee_number = burpee_number;
        this.pushup_number = pushup_number;
        this.situp_number = situp_number;
        this.squat_number = squat_number;
    }

    public int getBurpee_number() {
        return burpee_number;
    }

    public void setBurpee_number(int burpee_number) {
        this.burpee_number = burpee_number;
    }

    public int getPushup_number() {
        return pushup_number;
    }

    public void setPushup_number(int pushup_number) {
        this.pushup_number = pushup_number;
    }

    public int getSitup_number() {
        return situp_number;
    }

    public void setSitup_number(int situp_number) {
        this.situp_number = situp_number;
    }

    public int getSquat_number() {
        return squat_number;
    }

    public void setSquat_number(int squat_number) {
        this.squat_number = squat_number;
    }
    public void doit(String exerciseType,int number){
        if(exerciseType.equals("Burpee")){
            doBurpee(number);
            
        } else if (exerciseType.equals("Pushup")) {
            doPushup(number);

            
        } else if (exerciseType.equals("Situp")) {
            doSitup(number);

        } else if (exerciseType.equals("Squat")) {
            doSquat(number);
        }
        else {
            System.out.println("No means");
        }
    }
        public void doBurpee(int number){
            if (burpee_number==0){
                System.out.println("we don't have any burpee");
            }
            if (burpee_number < number){
                System.out.println("Congratulations , you passed your burpee goal");
                burpee_number=0;
                System.out.println("remaining number of burpee   " + burpee_number);
            }
            else {
                burpee_number= burpee_number - number;
                System.out.println("remaining number of burpee   " + burpee_number);
            }
        }
        public void  doPushup(int number){
            if (pushup_number==0){
                System.out.println("we don't have any pushup  ");
            }
            if (pushup_number < number){
                System.out.println("Congratulations , you passed your pushup goal");
                pushup_number=0;
                System.out.println("remaining number of pushups   " + pushup_number);
            }
            else {
                pushup_number= pushup_number - number;
                System.out.println("remaining number of pushup  " + pushup_number);
            }
        }
        public void  doSitup(int number){
            if (situp_number==0){
                System.out.println("we don't have any situp  ");
            }
            if (situp_number < number){
                System.out.println("Congratulations , you passed your situp goal");
                situp_number=0;
                System.out.println("remaining number of situps   " + situp_number);
            }
            else {
                situp_number= situp_number - number;
                System.out.println("remaining number of situps   " + situp_number);
            }
        }
        public void  doSquat(int number){
            if (squat_number==0){
                System.out.println("we don't have any squat  ");
            }
            if (squat_number < number){
                System.out.println("Congratulations , you passed your squat goal");
                squat_number=0;
                System.out.println("remaining number of squat  " + squat_number);
            }
            else {
                squat_number= squat_number - number;
                System.out.println("remaining number of squat  " + squat_number);
            }
        }
        public boolean theExercisesisEnd(){
        return (burpee_number == 0) && (pushup_number == 0) && (situp_number == 0) && (squat_number == 0);
        }



    }

