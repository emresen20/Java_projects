import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to exercises program");
        String exercises = "available exercises \n"
                +"Burpee\n"
                +"Pushup\n"
                +"Situp\n"
                +"Squat\n";
        System.out.println(exercises);
        System.out.println("Create a new exercises");
        System.out.println("Burpee number =");
        int burpee =scanner.nextInt();
        System.out.println("Pushup number =");
        int pushup =scanner.nextInt();
        System.out.println("Situp number =");
        int situp =scanner.nextInt();
        System.out.println("Squat number =");
        int squat =scanner.nextInt();
        scanner.nextLine();

        exercise exercise = new exercise(burpee,pushup,situp,squat);
        System.out.println("Your exercise is starting");
        while (exercise.theExercisesisEnd()==false){
            System.out.println("Exercises type (Burpee,Pushup,Situp,Squat:");
            String type = scanner.nextLine();
            System.out.println("How many of these moves are you going to do?");
            int number = scanner.nextInt();
            scanner.nextLine();
            exercise.doit(type,number);

        }
        System.out.println("You finshed your exercises");
    }
}